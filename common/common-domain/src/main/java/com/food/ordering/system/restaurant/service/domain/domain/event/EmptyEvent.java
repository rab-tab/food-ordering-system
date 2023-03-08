package com.food.ordering.system.restaurant.service.domain.domain.event;

public final class EmptyEvent implements DomainEvent<Void> {
    public static final EmptyEvent INSTANCE = new EmptyEvent();

    public EmptyEvent() {
    }

    @Override
    public void fire() {

    }
}
