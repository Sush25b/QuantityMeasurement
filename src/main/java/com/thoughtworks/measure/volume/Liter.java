package com.thoughtworks.measure.volume;

import com.thoughtworks.measure.IUnit;
import com.thoughtworks.measure.Quantity;

public class Liter implements IUnit
{
    private double converter =1.0;

    @Override
    public IUnit getBaseUnit() {
        return new Liter();
    }

    @Override
    public double convertToBase(double value) {
        return value*converter;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Liter);
    }
}
