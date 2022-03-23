package com.company;

public class ProductionMaterial {
    private String material;
    private double strenght;

    public ProductionMaterial(String material, double strenght) {
        this.material = material;
        this.strenght = strenght;
    }

    public String getMaterial() {
        return material;
    }

    public double getStrenght() {
        return strenght;
    }
}
