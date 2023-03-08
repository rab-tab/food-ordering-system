package com.food.ordering.system.restautant.service.domain.restaurant.service.domain.ports.output.repository;

import com.food.ordering.system.restautant.service.domain.restaurant.service.domain.entity.OrderApproval;

public interface OrderApprovalRepository {
    OrderApproval save(OrderApproval orderApproval);
}
