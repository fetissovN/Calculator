package com.springapp.logic.impl;

import com.springapp.logic.Calc;
import org.springframework.stereotype.Component;

@Component
public class CalcImplMultiply implements Calc {
    @Override
    public Double calculate(double digitA, double digitB) {
        Double res = digitA * digitB;
        return res;
    }
}
