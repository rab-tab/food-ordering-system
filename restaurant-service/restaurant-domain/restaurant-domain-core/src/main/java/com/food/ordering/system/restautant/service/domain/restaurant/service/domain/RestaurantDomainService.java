package com.food.ordering.system.restautant.service.domain.restaurant.service.domain;

import com.food.ordering.system.restautant.service.domain.domain.event.publisher.DomainEventPublisher;
import com.food.ordering.system.restautant.service.domain.restaurant.service.domain.entity.Restaurant;
import com.food.ordering.system.restautant.service.domain.restaurant.service.domain.event.OrderApprovalEvent;
import com.food.ordering.system.restautant.service.domain.restaurant.service.domain.event.OrderApprovedEvent;
import com.food.ordering.system.restautant.service.domain.restaurant.service.domain.event.OrderRejectedEvent;

import java.util.List;

public interface RestaurantDomainService {

    OrderApprovalEvent validateOrder(Restaurant restaurant,
                                     List<String> failureMessages,
                                     DomainEventPublisher<OrderApprovedEvent> orderApprovedEventDomainEventPublisher,
                                     DomainEventPublisher<OrderRejectedEvent> orderRejectedEventDomainEventPublisher);
}
