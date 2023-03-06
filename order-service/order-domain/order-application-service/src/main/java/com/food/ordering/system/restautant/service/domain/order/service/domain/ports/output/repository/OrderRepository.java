package com.food.ordering.system.restautant.service.domain.order.service.domain.ports.output.repository;

import com.food.ordering.system.restautant.service.domain.order.service.domain.entity.Order;
import com.food.ordering.system.restautant.service.domain.order.service.domain.valueobject.TrackingId;

import java.util.Optional;

public interface OrderRepository {
    Order save(Order order);

    Optional<Order> findByTrackingId(TrackingId trackingId);
}
