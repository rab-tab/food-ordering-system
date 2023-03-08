package com.food.ordering.system.restaurant.service.domain.order.service.dataacces.customer.repository;

import com.food.ordering.system.restaurant.service.domain.order.service.dataacces.customer.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CustomerJpaRepository extends JpaRepository<CustomerEntity, UUID> {
}

