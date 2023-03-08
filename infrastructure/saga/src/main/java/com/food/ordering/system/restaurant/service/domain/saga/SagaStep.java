package com.food.ordering.system.restaurant.service.domain.saga;

import com.food.ordering.system.restaurant.service.domain.domain.event.DomainEvent;

public interface SagaStep<T, S extends DomainEvent, U extends DomainEvent> {
    S process(T data);

    U rollBack(T data);

}
