package com.food.ordering.system.restaurant.service.domain.payment.service.domain.ports.output.repository;

import com.food.ordering.system.domain.valueobject.CustomerId;
import com.food.ordering.system.restaurant.service.domain.payment.service.domain.entity.CreditEntry;

import java.util.Optional;

public interface CreditEntryRepository {

    CreditEntry save(CreditEntry creditEntry);

    Optional<CreditEntry> findByCustomerId(CustomerId customerId);
}
