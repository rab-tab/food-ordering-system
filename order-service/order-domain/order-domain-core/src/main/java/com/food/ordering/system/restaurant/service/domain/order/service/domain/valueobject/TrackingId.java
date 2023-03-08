package com.food.ordering.system.restaurant.service.domain.order.service.domain.valueobject;

import com.food.ordering.system.restaurant.service.domain.domain.valueobject.BaseId;

import java.util.UUID;

public class TrackingId extends BaseId<UUID> {
    public TrackingId(UUID value) {
        super(value);
    }
}
