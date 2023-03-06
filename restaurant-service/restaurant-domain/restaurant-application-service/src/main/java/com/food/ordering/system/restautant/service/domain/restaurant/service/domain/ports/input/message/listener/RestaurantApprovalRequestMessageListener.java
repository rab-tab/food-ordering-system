package com.food.ordering.system.restautant.service.domain.restaurant.service.domain.ports.input.message.listener;

import com.food.ordering.system.restautant.service.domain.restaurant.service.domain.dto.RestaurantApprovalRequest;

public interface RestaurantApprovalRequestMessageListener {
    void approveOrder(RestaurantApprovalRequest restaurantApprovalRequest);
}
