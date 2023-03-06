package com.food.ordering.system.restautant.service.domain.order.service.domain.entity;

import com.food.ordering.system.restautant.service.domain.domain.entity.AggregateRoot;
import com.food.ordering.system.restautant.service.domain.domain.valueobject.CustomerId;

public class Customer extends AggregateRoot<CustomerId> {

    public Customer()
    {
    }
    public Customer(CustomerId customerId) {
        super();
    }
}
