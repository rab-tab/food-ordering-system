package com.food.ordering.system.order.service.domain.ports.input.service;

import com.food.ordering.system.domain.event.publisher.DomainEventPublisher;
import com.food.ordering.system.order.service.domain.dto.create.CreateOrderCommand;
import com.food.ordering.system.order.service.domain.dto.create.CreateOrderResponse;
import com.food.ordering.system.order.service.domain.event.OrderCreatedEvent;
import com.food.ordering.system.order.service.domain.track.TrackOrderResponse;
import com.food.ordering.system.order.service.domain.track.TrackQueryOrder;
import jakarta.validation.Valid;

public interface OrderApplicationService {

    CreateOrderResponse createOrder(@Valid CreateOrderCommand createOrderCommand, DomainEventPublisher<OrderCreatedEvent> orderCreatedEventDomainEventPublisher);

    TrackOrderResponse trackOrder(@Valid TrackQueryOrder trackQueryOrder);

}
