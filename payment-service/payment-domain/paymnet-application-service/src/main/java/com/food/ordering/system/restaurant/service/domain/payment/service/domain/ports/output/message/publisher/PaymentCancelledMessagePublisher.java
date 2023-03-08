package com.food.ordering.system.restaurant.service.domain.payment.service.domain.ports.output.message.publisher;

import com.food.ordering.system.restaurant.service.domain.domain.event.publisher.DomainEventPublisher;
import com.food.ordering.system.restaurant.service.domain.payment.service.domain.event.PaymentCancelledEvent;

public interface PaymentCancelledMessagePublisher extends DomainEventPublisher<PaymentCancelledEvent> {
}
