package com.food.ordering.system.restautant.service.domain;

import com.food.ordering.system.restautant.service.domain.restaurant.service.domain.RestaurantDomainService;
import com.food.ordering.system.restautant.service.domain.restaurant.service.domain.RestaurantDomainServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public RestaurantDomainService restaurantDomainService() {
        return new RestaurantDomainServiceImpl();
    }

}
