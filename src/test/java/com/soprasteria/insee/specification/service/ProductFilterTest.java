package com.soprasteria.insee.specification.service;

import com.soprasteria.insee.specification.model.Color;
import com.soprasteria.insee.specification.model.Product;
import com.soprasteria.insee.specification.model.Size;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Predicate;

import static org.assertj.core.api.Assertions.assertThat;

public class ProductFilterTest {
    Product p1 = new Product("p1",Color.BLUE, Size.LARGE);
    Product p2 = new Product("p2",Color.GREEN,Size.MEDIUM);
    List<Product> lp = List.of(p1,p2);

    @Test
    public void filterByColorBlueTest() {
        Predicate<Product> predicate = product -> product.getColor() == Color.BLUE;
        assertThat(ProductFilter.filterBy(lp,predicate)).hasSize(1).isEqualTo(List.of(p1));
    }

    @Test
    public void filterByColorGreenTest() {
        Predicate<Product> predicate = product -> product.getColor() == Color.GREEN;
        assertThat(ProductFilter.filterBy(lp,predicate)).hasSize(1).isEqualTo(List.of(p2));
    }

    @Test
    public void filterByColorRedTest() {
        Predicate<Product> predicate = product -> product.getColor() == Color.RED;
        assertThat(ProductFilter.filterBy(lp,predicate)).isEmpty();
    }
    @Test
    public void filterBySizeLargeTest() {
        Predicate<Product> predicate = product -> product.getSize() == Size.LARGE;
        assertThat(ProductFilter.filterBy(lp, predicate)).hasSize(1).isEqualTo(List.of(p1));
    }

    @Test
    public void filterBySizeMedium() {
        Predicate<Product> predicate = product -> product.getSize() == Size.MEDIUM;
        assertThat(ProductFilter.filterBy(lp, predicate)).hasSize(1);
    }

}
