package com.food.ordering.system.restautant.service.domain.order.service.domain;

import com.food.ordering.system.restautant.service.domain.order.service.domain.dto.message.RestaurantApprovalResponse;
import com.food.ordering.system.restautant.service.domain.order.service.domain.ports.input.service.message.listener.restraurantapproval.RestaurantApprovalResponseMessageListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
@Slf4j
public class RestaurantApprovalResponseMessageListenerImpl implements RestaurantApprovalResponseMessageListener {
    @Override
    public void orderApproved(RestaurantApprovalResponse restaurantApprovalResponse) {

    }

    @Override
    public void orderRejected(RestaurantApprovalResponse restaurantApprovalResponse) {

    }
}
