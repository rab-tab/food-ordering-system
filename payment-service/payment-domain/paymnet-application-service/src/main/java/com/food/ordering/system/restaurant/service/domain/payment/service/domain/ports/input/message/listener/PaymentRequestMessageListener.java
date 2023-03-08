package com.food.ordering.system.restaurant.service.domain.payment.service.domain.ports.input.message.listener;

import com.food.ordering.system.restaurant.service.domain.payment.service.domain.dto.PaymentRequest;

public interface PaymentRequestMessageListener {

    void completePayment(PaymentRequest paymentRequest);

    void cancelPayment(PaymentRequest paymentRequest);
}
