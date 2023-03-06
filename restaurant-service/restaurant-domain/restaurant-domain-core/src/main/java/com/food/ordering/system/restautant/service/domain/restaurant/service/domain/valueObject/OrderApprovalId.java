package com.food.ordering.system.restautant.service.domain.restaurant.service.domain.valueObject;

import com.food.ordering.system.restautant.service.domain.domain.valueobject.BaseId;

import java.util.UUID;

public class OrderApprovalId extends BaseId<UUID> {

    public OrderApprovalId(UUID value) {
        super(value);
    }
}
