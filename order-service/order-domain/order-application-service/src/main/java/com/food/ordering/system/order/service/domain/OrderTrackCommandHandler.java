package com.food.ordering.system.order.service.domain;

import com.food.ordering.system.order.service.domain.track.TrackOrderResponse;
import com.food.ordering.system.order.service.domain.track.TrackQueryOrder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class OrderTrackCommandHandler {
    public TrackOrderResponse trackOrder(TrackQueryOrder trackQueryOrder) {
        return null;
    }
}
