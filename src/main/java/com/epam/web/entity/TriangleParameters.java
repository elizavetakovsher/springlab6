package com.epam.web.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TriangleParameters {

    @JsonProperty("Triangle Square")
    private double square;
    @JsonProperty("Triangle Perimeter")
    private double perimeter;

    public TriangleParameters(double square, double perimeter) {
        this.square = square;
        this.perimeter = perimeter;
    }

    public double getSquare() {
        return square;
    }

    public double getPerimeter() {
        return perimeter;
    }
}
