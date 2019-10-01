package com.thoughtworks.measure.Temperature;

import com.thoughtworks.measure.IUnit;

public class Celsius implements IUnit
{
    private double converter =1.0;

    @Override
    public IUnit getBaseUnit() {
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
