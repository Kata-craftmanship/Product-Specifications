package com.soprasteria.insee.specification.service;

import com.soprasteria.insee.specification.model.Product;
import com.soprasteria.insee.specification.model.Size;

import java.util.Objects;
import java.util.function.Predicate;

public class NamePredicate implements Predicate<Product> {

    private String name;

    public NamePredicate(String name) {
        Objects.requireNonNull(name,"name predicate can't be null");
        this.name = name;
    }

    @Override
    public boolean test(Product product) {
        return name.equalsIgnoreCase(product.getName());
    }


}
