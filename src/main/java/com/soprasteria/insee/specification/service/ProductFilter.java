package com.soprasteria.insee.specification.service;

import java.util.List;
import java.util.stream.Collectors;

public class ProductFilter {

   public static List<Product> filterByColor(List<Product> products, Color color) {
      return products.stream()
         .filter(product -> product.getColor() == color)
         .collect(Collectors.toList());
   }

   public static List<Product>  filterBySize(List<Product> products, Size size) {
      return products.stream()
         .filter(product -> product.getSize() == size)
         .collect(Collectors.toList());
   }

   public static List<Product>  filterBySizeAndColor(List<Product> products, Size size, Color color) {
      return products.stream()
         .filter(product -> product.getSize() == size && product.getColor() == color)
         .collect(Collectors.toList());
   }

}
