package com.food.ordering.system.restautant.service.domain.domain.event.publisher;

import com.food.ordering.system.restautant.service.domain.domain.event.DomainEvent;

public interface DomainEventPublisher <T extends DomainEvent> {

    void publish(T domainevent);
}
