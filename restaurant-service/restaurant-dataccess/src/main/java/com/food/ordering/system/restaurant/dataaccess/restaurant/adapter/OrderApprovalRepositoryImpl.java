package com.food.ordering.system.restautant.service.domain.restaurant.dataaccess.restaurant.adapter;

import com.food.ordering.system.restautant.service.domain.restaurant.dataaccess.restaurant.mapper.RestaurantDataAccessMapper;
import com.food.ordering.system.restautant.service.domain.restaurant.dataaccess.restaurant.repository.OrderApprovalJpaRepository;
import com.food.ordering.system.restautant.service.domain.restaurant.service.domain.entity.OrderApproval;
import com.food.ordering.system.restautant.service.domain.restaurant.service.domain.ports.output.repository.OrderApprovalRepository;
import org.springframework.stereotype.Component;

@Component
public class OrderApprovalRepositoryImpl implements OrderApprovalRepository {

    private final OrderApprovalJpaRepository orderApprovalJpaRepository;
    private final RestaurantDataAccessMapper restaurantDataAccessMapper;

    public OrderApprovalRepositoryImpl(OrderApprovalJpaRepository orderApprovalJpaRepository,
                                       RestaurantDataAccessMapper restaurantDataAccessMapper) {
        this.orderApprovalJpaRepository = orderApprovalJpaRepository;
        this.restaurantDataAccessMapper = restaurantDataAccessMapper;
    }

    @Override
    public OrderApproval save(OrderApproval orderApproval) {
        return restaurantDataAccessMapper
                .orderApprovalEntityToOrderApproval(orderApprovalJpaRepository
                        .save(restaurantDataAccessMapper.orderApprovalToOrderApprovalEntity(orderApproval)));
    }

}
