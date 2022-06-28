package com.soprasteria.insee.specification.service;

import com.soprasteria.insee.specification.model.Color;
import com.soprasteria.insee.specification.model.Product;
import com.soprasteria.insee.specification.model.Size;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ProductFilterTest {
    Product p1 = new Product("p1",Color.BLUE, Size.LARGE);
    Product p2 = new Product("p2",Color.GREEN,Size.MEDIUM);
    List<Product> lp = List.of(p1,p2);

    @Test
    public void filterByColorBlueTest() {
        assertThat(ProductFilter.filterByColor(lp,Color.BLUE)).hasSize(1).isEqualTo(List.of(p1));
    }

    @Test
    public void filterByColorGreenTest() {
        assertThat(ProductFilter.filterByColor(lp,Color.GREEN)).hasSize(1).isEqualTo(List.of(p2));
    }

    @Test
    public void filterByColorRedTest() {
        assertThat(ProductFilter.filterByColor(lp,Color.RED)).isEmpty();
    }



}
