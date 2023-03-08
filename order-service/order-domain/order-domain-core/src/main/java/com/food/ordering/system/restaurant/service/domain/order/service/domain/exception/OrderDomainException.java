package com.food.ordering.system.restaurant.service.domain.order.service.domain.exception;

import com.food.ordering.system.restaurant.service.domain.domain.exception.DomainException;

public class OrderDomainException extends DomainException {

    public OrderDomainException(String message) {
        super(message);
    }

    public OrderDomainException(String message, Throwable cause) {
        super(message, cause);
    }
}
