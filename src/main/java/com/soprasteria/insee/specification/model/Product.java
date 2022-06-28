package com.soprasteria.insee.specification.model;

import java.util.Objects;

public class Product {
   private final String name;
   private final Color color;
   private final Size size;
   private final Price price;

   public Product(String name, Color color, Size size, Price price) {
      Objects.requireNonNull(name,"Name can't be null");
      this.name = name;
      this.color = color;
      this.size = size;
      this.price = price;
   }

   public Price getPrice() {
      return price;
   }

   public Color getColor() {
      return color;
   }

   public String getName() {
      return name;
   }
   public Size getSize() {
      return size;
   }
   @Override
   public String toString() {
      return "Product{" +
         "name='" + name + '\'' +
         ", color=" + color +
         ", size=" + size +
         '}';
   }
}
