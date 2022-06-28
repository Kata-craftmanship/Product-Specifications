package com.soprasteria.insee.specification.service;

import com.soprasteria.insee.specification.model.Product;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProductFilter {
   public static List<Product> filterBy(List<Product> products, Predicate<Product> predicate){
      return products.stream()
              .filter(predicate)
              .collect(Collectors.toList());
   }
}
