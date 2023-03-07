package com.food.ordering.system.restautant.service.domain.order.service.dataacces.customer.mapper;

import com.food.ordering.system.domain.valueobject.CustomerId;
import com.food.ordering.system.restautant.service.domain.order.service.dataacces.customer.entity.CustomerEntity;
import com.food.ordering.system.restautant.service.domain.order.service.domain.entity.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerDataAccessMapper {

    public Customer customerEntityToCustomer(CustomerEntity customerEntity) {
        return new Customer(new CustomerId(customerEntity.getId()));
    }
}