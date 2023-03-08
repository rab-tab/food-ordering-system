package com.food.ordering.system.restautant.service.domain.order.service.domain;

import com.food.ordering.system.domain.event.publisher.DomainEventPublisher;
import com.food.ordering.system.restautant.service.domain.order.service.domain.entity.Order;
import com.food.ordering.system.restautant.service.domain.order.service.domain.entity.Product;
import com.food.ordering.system.restautant.service.domain.order.service.domain.entity.Restaurant;
import com.food.ordering.system.restautant.service.domain.order.service.domain.event.OrderCancelledEvent;
import com.food.ordering.system.restautant.service.domain.order.service.domain.event.OrderCreatedEvent;
import com.food.ordering.system.restautant.service.domain.order.service.domain.event.OrderPaidEvent;
import com.food.ordering.system.restautant.service.domain.order.service.domain.exception.OrderDomainException;
import lombok.extern.slf4j.Slf4j;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

@Slf4j
public class OrderDomainServiceImpl implements OrderDomainService {


    @Override
    public OrderCreatedEvent validateAndInitiateOrder(Order order, Restaurant restaurant, DomainEventPublisher<OrderCreatedEvent> orderCreatedEventDomainEventPublisher) {
        validateRestaurant(restaurant);
        setOrderProductInformation(order, restaurant);
        order.validateOrder();
        order.initializeOrder();
        return new OrderCreatedEvent(order, ZonedDateTime.now(ZoneId.of("UTC")), orderCreatedEventDomainEventPublisher);
    }

    private void setOrderProductInformation(Order order, Restaurant restaurant) {
        order.getOrderItems().forEach(orderItem -> restaurant.getProducts().forEach(restaurantProduct -> {
            Product currentProduct = orderItem.getProduct();
            if (currentProduct.equals(restaurantProduct)) {
                currentProduct.updateWithConfirmedNameAndPrice(restaurantProduct.getName(), restaurantProduct.getprice());
            }

        }));
    }

    private void validateRestaurant(Restaurant restaurant) {
        if (!restaurant.isActive()) {
            throw new OrderDomainException("Restauarant" + restaurant.getId() + "not active");
        }
    }

    @Override
    public OrderPaidEvent payOrder(Order order, DomainEventPublisher<OrderPaidEvent> orderPaidEventDomainEventPublisher) {
        order.pay();
        return new OrderPaidEvent(order, ZonedDateTime.now(ZoneId.of("UTC")), orderPaidEventDomainEventPublisher);
    }

    @Override
    public void approveOrder(Order order) {
        order.approve();

    }

    @Override
    public OrderCancelledEvent cancelOrderPayment(Order order, List<String> failureMessages, DomainEventPublisher<OrderCancelledEvent> orderCancelledEventDomainEventPublisher) {
        order.initCancel(failureMessages);
        return new OrderCancelledEvent(order, ZonedDateTime.now(ZoneId.of("UTC")), orderCancelledEventDomainEventPublisher);
    }

    @Override
    public void cancelOrder(Order order, List<String> failureMessages) {
        order.cancel(failureMessages);

    }
}