package com.company;

public class Figure {
    private Color color;
    private float lenght;

    public Figure(Color color, float lenght) {
        this.color = color;
        this.lenght = lenght;
    }

    public Color getColor() {
        return color;
    }

    public float getLenght() {
        return lenght;
    }
}
