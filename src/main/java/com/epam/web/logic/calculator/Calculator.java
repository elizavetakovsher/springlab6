package com.epam.web.logic.calculator;

import com.epam.web.entity.Triangle;
import com.epam.web.exceptions.TriangleCalculatorException;

public interface Calculator {
    double calculatePerimeter(Triangle figure) throws TriangleCalculatorException;
    double calculateSquare(Triangle figure) throws TriangleCalculatorException;
}
