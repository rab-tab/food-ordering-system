package com.food.ordering.system.restautant.service.domain.restaurant.dataaccess.restaurant.repository;

import com.food.ordering.system.restautant.service.domain.restaurant.dataaccess.restaurant.entity.OrderApprovalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OrderApprovalJpaRepository extends JpaRepository<OrderApprovalEntity, UUID> {


}
