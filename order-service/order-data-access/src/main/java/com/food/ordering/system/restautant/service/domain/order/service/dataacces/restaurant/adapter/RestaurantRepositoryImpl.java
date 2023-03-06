package com.food.ordering.system.restautant.service.domain.order.service.dataacces.restaurant.adapter;

import com.food.ordering.system.restautant.service.domain.order.service.dataacces.restaurant.mapper.RestaurantDataAccessMapper;
import com.food.ordering.system.restautant.service.domain.order.service.domain.entity.Restaurant;
import com.food.ordering.system.restautant.service.domain.order.service.domain.ports.output.repository.RestaurantRepository;
import restaurant.entity.RestaurantEntity;
import restaurant.repository.RestaurantJpaRepository;


import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class RestaurantRepositoryImpl implements RestaurantRepository {

    private final RestaurantJpaRepository restaurantJpaRepository;
    private final RestaurantDataAccessMapper restaurantDataAccessMapper;

    public RestaurantRepositoryImpl(RestaurantJpaRepository restaurantJpaRepository,
                                    RestaurantDataAccessMapper restaurantDataAccessMapper) {
        this.restaurantJpaRepository = restaurantJpaRepository;
        this.restaurantDataAccessMapper = restaurantDataAccessMapper;
    }

    @Override
    public Optional<Restaurant> findRestaurantInformation(Restaurant restaurant) {
        List<UUID> restaurantProducts =
                restaurantDataAccessMapper.restaurantToRestaurantProducts(restaurant);
        Optional<List<RestaurantEntity>> restaurantEntities = restaurantJpaRepository
                .findByRestaurantIdAndProductIdIn(restaurant.getId().getValue(),
                        restaurantProducts);
        return restaurantEntities.map(restaurantDataAccessMapper::restaurantEntityToRestaurant);
    }
}
