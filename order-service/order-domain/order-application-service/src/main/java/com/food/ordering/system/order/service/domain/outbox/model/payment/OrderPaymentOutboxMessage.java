package com.food.ordering.system.order.service.domain.outbox.model.payment;

import com.food.ordering.system.outbox.OutBoxStatus;
import com.food.ordering.system.restaurant.service.domain.domain.valueobject.OrderStatus;
import com.food.ordering.system.restaurant.service.domain.saga.SagaStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.ZonedDateTime;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public class OrderPaymentOutboxMessage {
    private UUID id;
    private UUID sagaId;
    private ZonedDateTime createdAt;
    private ZonedDateTime processedAt;
    private String type;
    private String payload;
    private SagaStatus sagaStatus;
    private OrderStatus orderStatus;
    private OutBoxStatus outBoxStatus;
    private int version;


    public void setProcessedAt(ZonedDateTime processedAt) {
        this.processedAt = processedAt;
    }

    public void setSagaStatus(SagaStatus sagaStatus) {
        this.sagaStatus = sagaStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setOutboxStatus(OutBoxStatus outboxStatus) {
        this.outBoxStatus = outboxStatus;
    }


}
