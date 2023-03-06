package com.food.ordering.system.restautant.service.domain.order.service.domain;

import com.food.ordering.system.restautant.service.domain.order.service.domain.entity.Order;
import com.food.ordering.system.restautant.service.domain.order.service.domain.exception.OrderNotFoundException;
import com.food.ordering.system.restautant.service.domain.order.service.domain.mapper.OrderDataMapper;
import com.food.ordering.system.restautant.service.domain.order.service.domain.ports.output.repository.OrderRepository;
import com.food.ordering.system.restautant.service.domain.order.service.domain.track.TrackOrderResponse;
import com.food.ordering.system.restautant.service.domain.order.service.domain.track.TrackQueryOrder;
import com.food.ordering.system.restautant.service.domain.order.service.domain.valueobject.TrackingId;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Slf4j
@Component
public class OrderTrackCommandHandler {

    private final OrderDataMapper orderDataMapper;
    private final OrderRepository orderRepository;

    public OrderTrackCommandHandler(OrderDataMapper orderDataMapper, OrderRepository orderRepository) {
        this.orderDataMapper = orderDataMapper;
        this.orderRepository = orderRepository;
    }

    @Transactional(readOnly = true)
    public TrackOrderResponse trackOrder(TrackQueryOrder trackQueryOrder) {
        Optional<Order> orderResult=orderRepository.findByTrackingId(new TrackingId(trackQueryOrder.getOrderTrackingId()));
        if(orderResult.isEmpty()){
            log.warn("Could not find order with tracking id: {} ",trackQueryOrder.getOrderTrackingId());
            throw new OrderNotFoundException("Could not find order with tracking id: {} "+
                    trackQueryOrder.getOrderTrackingId());
        }

        return orderDataMapper.orderToTrackOrderResponse(orderResult.get());
    }
}
