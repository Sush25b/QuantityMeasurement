package com.thoughtworks.measure.weight;

import com.thoughtworks.measure.Unit;

public class Kilogram implements Unit
{
    private double converter =1000.0;

    @Override
    public Unit getBaseUnit() {
        return new Gram();
    }

    @Override
    public double convertToBase(double value) {
        return value*converter;
    }
}
