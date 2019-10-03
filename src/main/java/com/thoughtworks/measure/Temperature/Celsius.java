package com.thoughtworks.measure.Temperature;

import com.thoughtworks.measure.Unit;

public class Celsius implements Unit
{
    private double converter =1.0;

    @Override
    public Unit getBaseUnit() {
        return new Celsius();
    }

    @Override
    public double convertToBase(double value) {
        return value*converter;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Celsius);
    }
}
