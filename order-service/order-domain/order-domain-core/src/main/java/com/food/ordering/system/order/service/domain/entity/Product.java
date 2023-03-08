package com.food.ordering.system.restautant.service.domain.order.service.domain.entity;

import com.food.ordering.system.domain.entity.BaseEntity;
import com.food.ordering.system.domain.valueobject.Money;
import com.food.ordering.system.domain.valueobject.ProductId;

public class Product extends BaseEntity<ProductId> {
    private String name;
    private Money price;

    public Product(ProductId productId,String name, Money price) {
        super.setId(productId);
        this.name = name;
        this.price = price;
    }

    public Product(ProductId productId)
    {
        super.setId(productId);
    }
    public String getName() {
        return name;
    }

    public Money getprice() {
        return price;
    }

    public void updateWithConfirmedNameAndPrice(String name, Money getprice) {
        this.name=name;
        this.price=price;
    }
}