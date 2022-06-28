package com.soprasteria.insee.specification.service;

import com.soprasteria.insee.specification.model.Price;
import com.soprasteria.insee.specification.model.Product;

import java.util.function.Predicate;

public class PricePredicate implements Predicate<Product> {

    private Price price;

    public PricePredicate(Price price) {
        this.price = price;
    }

    @Override
    public boolean test(Product product) {
        return product.getPrice().getAmount() >= price.getAmount();
    }
}
