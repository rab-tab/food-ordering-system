package com.food.ordering.system.restautant.service.domain.order.service.domain.ports.input.service.message.listener.payment;

import com.food.ordering.system.restautant.service.domain.order.service.domain.dto.message.PaymentResponse;

public interface PaymentResponseMessageListener {
    void paymentCompleted(PaymentResponse paymentResponse);
    void paymentCancelled(PaymentResponse paymentResponse);

}
