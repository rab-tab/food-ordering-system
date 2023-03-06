package com.food.ordering.system.restautant.service.domain.order.service.domain;

import com.food.ordering.system.restautant.service.domain.order.service.domain.dto.create.CreateOrderCommand;
import com.food.ordering.system.restautant.service.domain.order.service.domain.dto.create.CreateOrderResponse;
import com.food.ordering.system.restautant.service.domain.order.service.domain.event.OrderCreatedEvent;
import com.food.ordering.system.restautant.service.domain.order.service.domain.mapper.OrderDataMapper;
import com.food.ordering.system.restautant.service.domain.order.service.domain.ports.output.repository.message.publisher.payment.OrderCreatedPaymentRequestMessagePublisher;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class OrderCreateCommandHandler {

    private final OrderCreateHelper orderCreateHelper;

    private final OrderDataMapper orderdataMapper;

    private final OrderCreatedPaymentRequestMessagePublisher orderCreatedPaymentRequestMessagePublisher;

    private final ApplicationDomainEventPublisher applicationDomainEventPublisher;

    public OrderCreateCommandHandler(OrderCreateHelper orderCreateHelper,
                                     OrderDataMapper orderdataMapper,
                                     OrderCreatedPaymentRequestMessagePublisher orderCreatedPaymentRequestMessagePublisher, ApplicationDomainEventPublisher applicationDomainEventPublisher) {
        this.orderCreateHelper = orderCreateHelper;
        this.orderdataMapper = orderdataMapper;
        this.orderCreatedPaymentRequestMessagePublisher = orderCreatedPaymentRequestMessagePublisher;
        this.applicationDomainEventPublisher = applicationDomainEventPublisher;
    }


    public CreateOrderResponse createOrder(CreateOrderCommand createOrderCommand) {
        OrderCreatedEvent orderCreatedEvent = orderCreateHelper.persistOrder(createOrderCommand);
        log.info("Order created with id :{} " + orderCreatedEvent.getOrder().getId().getValue());
        orderCreatedPaymentRequestMessagePublisher.publish(orderCreatedEvent);
      //  applicationDomainEventPublisher.publish(orderCreatedEvent);
        return orderdataMapper.orderToCreateOrderResponse(orderCreatedEvent.getOrder(),"Order created suceesfully");
    }


}
