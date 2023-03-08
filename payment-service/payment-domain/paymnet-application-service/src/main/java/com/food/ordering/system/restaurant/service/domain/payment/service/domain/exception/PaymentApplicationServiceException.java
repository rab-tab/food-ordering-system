package com.food.ordering.system.restaurant.service.domain.payment.service.domain.exception;

import com.food.ordering.system.restaurant.service.domain.domain.exception.DomainException;

public class PaymentApplicationServiceException extends DomainException {

    public PaymentApplicationServiceException(String message) {
        super(message);
    }

    public PaymentApplicationServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
