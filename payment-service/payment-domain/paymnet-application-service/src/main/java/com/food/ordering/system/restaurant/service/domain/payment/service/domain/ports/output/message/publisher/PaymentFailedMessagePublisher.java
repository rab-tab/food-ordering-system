package com.food.ordering.system.restaurant.service.domain.payment.service.domain.ports.output.message.publisher;

import com.food.ordering.system.restaurant.service.domain.domain.event.publisher.DomainEventPublisher;
import com.food.ordering.system.restaurant.service.domain.payment.service.domain.event.PaymentFailedEvent;

public interface PaymentFailedMessagePublisher extends DomainEventPublisher<PaymentFailedEvent> {
}
