package com.soprasteria.insee.specification.service;

import com.soprasteria.insee.specification.model.Color;
import com.soprasteria.insee.specification.model.Product;

import java.util.function.Predicate;

public class ColorPredicate implements Predicate<Product> {

    private Color color;

    public ColorPredicate(Color color) {
        this.color = color;
    }

    @Override
    public boolean test(Product product) {
        return color == product.getColor();
    }


}
