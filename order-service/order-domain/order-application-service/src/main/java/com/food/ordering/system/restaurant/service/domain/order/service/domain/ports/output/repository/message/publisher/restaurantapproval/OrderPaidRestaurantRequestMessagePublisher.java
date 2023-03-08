package com.food.ordering.system.restaurant.service.domain.order.service.domain.ports.output.repository.message.publisher.restaurantapproval;

import com.food.ordering.system.restaurant.service.domain.domain.event.publisher.DomainEventPublisher;
import com.food.ordering.system.restaurant.service.domain.order.service.domain.event.OrderPaidEvent;

public interface OrderPaidRestaurantRequestMessagePublisher extends DomainEventPublisher<OrderPaidEvent> {
}
