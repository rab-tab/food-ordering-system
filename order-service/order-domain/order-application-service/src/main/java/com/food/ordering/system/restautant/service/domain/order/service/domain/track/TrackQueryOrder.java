package com.food.ordering.system.restautant.service.domain.order.service.domain.track;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public class TrackQueryOrder {
    @NotNull
    private final UUID  orderTrackingId;

}
