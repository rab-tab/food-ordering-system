package com.food.ordering.system.restaurant.service.domain.order.service.domain.event;

import com.food.ordering.system.restaurant.service.domain.domain.event.publisher.DomainEventPublisher;
import com.food.ordering.system.restaurant.service.domain.order.service.domain.entity.Order;

import java.time.ZonedDateTime;

public class OrderCreatedEvent extends OrderEvent {


    private final DomainEventPublisher<OrderCreatedEvent> orderCreatedEventDomainEventPublisher;

    public OrderCreatedEvent(Order order,
                             ZonedDateTime createdAt,
                             DomainEventPublisher<OrderCreatedEvent> orderCreatedEventDomainEventPublisher) {
        super(order, createdAt);
        this.orderCreatedEventDomainEventPublisher = orderCreatedEventDomainEventPublisher;
    }

    @Override
    public void fire() {
        orderCreatedEventDomainEventPublisher.publish(this);
    }
}
