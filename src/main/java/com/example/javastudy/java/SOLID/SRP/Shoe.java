package com.example.javastudy.java.SOLID.SRP;

import java.math.BigDecimal;

public class Shoe extends AbstractItem{
    private final String brand;
    private final int size;
    private final String color;

    public Shoe(int size, String brand, String color,
                String name, BigDecimal price) {
        super(name, price, BigDecimal.ZERO);
        this.size = size;
        this.brand = brand;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }
}
