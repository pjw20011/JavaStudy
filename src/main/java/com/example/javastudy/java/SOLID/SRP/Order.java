package com.example.javastudy.java.SOLID.SRP;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<AbstractItem> items;
    private BigDecimal totalPrice;
    private final PriceCalculator priceCalculator;

    Order() {
        this.items = new ArrayList<>();
        this.totalPrice = BigDecimal.ZERO;
        this.priceCalculator = new PriceCalculator()
    }

    public void add(AbstractItem item) {
        items.add(item);
        calculateTotalPrice(item);
    }

    public void calculateTotalPrice(AbstractItem item) {
        this.totalPrice = priceCalculator.calculateTotalPrice(this.totalPrice, item);
    }

    public BigDecimal getPrice() {
        return this.totalPrice;
    }
}
