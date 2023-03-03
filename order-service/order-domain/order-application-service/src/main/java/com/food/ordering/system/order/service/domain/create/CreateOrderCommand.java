package com.food.ordering.system.order.service.domain.create;


import com.food.ordering.system.order.service.domain.entity.OrderItem;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Builder
@Getter
@AllArgsConstructor
public class CreateOrderCommand {
    @NotNull
    private final UUID customerId;
    @NotNull
    private final UUID restaurantId;
    private final BigDecimal price;
    private final List <OrderItem> items;
    private final OrderAddress address;




}
