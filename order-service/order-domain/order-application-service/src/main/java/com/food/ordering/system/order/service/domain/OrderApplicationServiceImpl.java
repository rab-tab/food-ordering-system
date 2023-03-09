package com.food.ordering.system.order.service.domain;

import com.food.ordering.system.restaurant.service.domain.domain.event.publisher.DomainEventPublisher;
import com.food.ordering.system.order.service.domain.dto.create.CreateOrderCommand;
import com.food.ordering.system.order.service.domain.dto.create.CreateOrderResponse;
import com.food.ordering.system.restaurant.service.domain.order.service.domain.event.OrderCreatedEvent;
import com.food.ordering.system.order.service.domain.ports.input.service.OrderApplicationService;
import com.food.ordering.system.order.service.domain.track.TrackOrderResponse;
import com.food.ordering.system.order.service.domain.track.TrackQueryOrder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Slf4j
@Validated
@Service
public class OrderApplicationServiceImpl implements OrderApplicationService {

    private final OrderCreateCommandHandler orderCreateCommandHandler;
    private final OrderTrackCommandHandler orderTrackCommandHandler;

    public OrderApplicationServiceImpl(OrderCreateCommandHandler orderCreateCommandHandler, OrderTrackCommandHandler orderTrackCommandHandler) {
        this.orderCreateCommandHandler = orderCreateCommandHandler;
        this.orderTrackCommandHandler = orderTrackCommandHandler;
    }

    @Override
    public CreateOrderResponse createOrder(CreateOrderCommand createOrderCommand, DomainEventPublisher<OrderCreatedEvent> orderCreatedEventDomainEventPublisher) {
        return orderCreateCommandHandler.createOrder(createOrderCommand, orderCreatedEventDomainEventPublisher);
    }

    @Override
    public TrackOrderResponse trackOrder(TrackQueryOrder trackQueryOrder) {
        return orderTrackCommandHandler.trackOrder(trackQueryOrder);
    }
}
