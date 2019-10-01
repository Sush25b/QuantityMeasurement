package com.thoughtworks.measure.weight;

import com.thoughtworks.measure.IUnit;

public class Kilogram implements IUnit
{
    private double converter =1000.0;

    @Override
    public IUnit getBaseUnit() {
        return new Gram();
    }

    @Override
    public double convertToBase(double value) {
        return value*converter;
    }
}
