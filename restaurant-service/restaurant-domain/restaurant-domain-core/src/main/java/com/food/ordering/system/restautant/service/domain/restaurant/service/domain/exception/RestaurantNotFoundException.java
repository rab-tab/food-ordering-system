package com.food.ordering.system.restautant.service.domain.restaurant.service.domain.exception;

import com.food.ordering.system.restautant.service.domain.domain.exception.DomainException;

public class RestaurantNotFoundException extends DomainException {
    public RestaurantNotFoundException(String message) {
        super(message);
    }

    public RestaurantNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
