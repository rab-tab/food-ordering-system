package com.food.ordering.system.restautant.service.domain.order.service.domain.ports.output.repository;

import com.food.ordering.system.restautant.service.domain.order.service.domain.entity.Restaurant;

import java.util.Optional;

public interface RestaurantRepository {

    Optional<Restaurant> findRestaurantInformation(Restaurant restaurant);
}
