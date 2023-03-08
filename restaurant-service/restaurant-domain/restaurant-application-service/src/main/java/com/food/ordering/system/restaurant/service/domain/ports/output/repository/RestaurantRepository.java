package com.food.ordering.system.restautant.service.domain.restaurant.service.domain.ports.output.repository;

import com.food.ordering.system.restautant.service.domain.restaurant.service.domain.entity.Restaurant;

import java.util.Optional;

public interface RestaurantRepository {
    Optional<Restaurant> findRestaurantInformation(Restaurant restaurant);
}
