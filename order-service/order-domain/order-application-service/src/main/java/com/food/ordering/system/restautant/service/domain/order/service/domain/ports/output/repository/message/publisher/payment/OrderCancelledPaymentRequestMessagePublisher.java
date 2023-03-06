package com.food.ordering.system.restautant.service.domain.order.service.domain.ports.output.repository.message.publisher.payment;

import com.food.ordering.system.restautant.service.domain.domain.event.publisher.DomainEventPublisher;
import com.food.ordering.system.restautant.service.domain.order.service.domain.event.OrderCancelledEvent;

public interface OrderCancelledPaymentRequestMessagePublisher extends DomainEventPublisher<OrderCancelledEvent> {
}
