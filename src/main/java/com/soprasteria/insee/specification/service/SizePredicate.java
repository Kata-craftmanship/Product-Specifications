package com.soprasteria.insee.specification.service;

import com.soprasteria.insee.specification.model.Product;
import com.soprasteria.insee.specification.model.Size;

import java.util.function.Predicate;

public class SizePredicate implements Predicate<Product> {

    private Size size;

    public SizePredicate(Size size) {
        this.size = size;
    }

    @Override
    public boolean test(Product product) {
        return size == product.getSize();
    }


}
