package com.food.ordering.system.restautant.service.domain.restaurant.service.domain.ports.output.message.publisher;

import com.food.ordering.system.restautant.service.domain.domain.event.publisher.DomainEventPublisher;
import com.food.ordering.system.restautant.service.domain.restaurant.service.domain.event.OrderApprovedEvent;

public interface OrderApprovedMessagePublisher extends DomainEventPublisher<OrderApprovedEvent> {
}
