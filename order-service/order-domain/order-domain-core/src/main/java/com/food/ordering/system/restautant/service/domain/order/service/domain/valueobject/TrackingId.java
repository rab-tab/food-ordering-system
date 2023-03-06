package com.food.ordering.system.restautant.service.domain.order.service.domain.valueobject;

import com.food.ordering.system.restautant.service.domain.domain.valueobject.BaseId;

import java.util.UUID;

public class TrackingId extends BaseId<UUID> {
    public TrackingId(UUID value) {
        super(value);
    }
}
