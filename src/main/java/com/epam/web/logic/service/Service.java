package com.epam.web.logic.service;

import com.epam.web.entity.Triangle;
import com.epam.web.entity.TriangleParameters;
import com.epam.web.exceptions.InputException;
import com.epam.web.exceptions.TriangleCalculatorException;
import org.springframework.stereotype.Component;

public interface Service {
    TriangleParameters doService(Triangle entity) throws TriangleCalculatorException, InputException;
}
