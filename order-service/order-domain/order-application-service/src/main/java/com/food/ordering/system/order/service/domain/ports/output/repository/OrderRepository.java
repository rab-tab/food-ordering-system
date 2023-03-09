package com.food.ordering.system.order.service.domain.ports.output.repository;

import com.food.ordering.system.restaurant.service.domain.domain.valueobject.OrderId;
import com.food.ordering.system.restaurant.service.domain.order.service.domain.entity.Order;
import com.food.ordering.system.restaurant.service.domain.order.service.domain.valueobject.TrackingId;

import java.util.Optional;

public interface OrderRepository {
    Order save(Order order);

    Optional<Order> findById(OrderId orderId);

    Optional<Order> findByTrackingId(TrackingId trackingId);
}
