package com.thoughtworks.measure.weight;

import com.thoughtworks.measure.IUnit;

public class Gram implements IUnit
{
    private double converter =1.0;

    @Override
    public IUnit getBaseUnit() {
        return new Gram();
    }

    @Override
    public double convertToBase(double value) {
        return value*converter;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Gram);
    }
}
