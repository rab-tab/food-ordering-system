package com.food.ordering.system.restautant.service.domain.order.service.domain.ports.input.service;

import com.food.ordering.system.restautant.service.domain.order.service.domain.dto.create.CreateOrderCommand;
import com.food.ordering.system.restautant.service.domain.order.service.domain.dto.create.CreateOrderResponse;
import com.food.ordering.system.restautant.service.domain.order.service.domain.track.TrackOrderResponse;
import com.food.ordering.system.restautant.service.domain.order.service.domain.track.TrackQueryOrder;
import jakarta.validation.Valid;

public interface OrderApplicationService {

    CreateOrderResponse createOrder(@Valid CreateOrderCommand createOrderCommand);

    TrackOrderResponse trackOrder(@Valid TrackQueryOrder trackQueryOrder);

}
