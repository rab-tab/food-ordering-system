package com.food.ordering.system.restautant.service.domain.order.service.domain.ports.input.service.message.listener.restraurantapproval;

import com.food.ordering.system.restautant.service.domain.order.service.domain.dto.message.RestaurantApprovalResponse;

public interface RestaurantApprovalResponseMessageListener {

    void orderApproved(RestaurantApprovalResponse restaurantApprovalResponse);

    void orderRejected(RestaurantApprovalResponse restaurantApprovalResponse);
}
