package com.thoughtworks.measure.length;

import com.thoughtworks.measure.IUnit;
import com.thoughtworks.measure.Quantity;

public class Inch implements IUnit
{
    private double converter =1.0;

    @Override
    public IUnit getBaseUnit() {
        return new Inch();
    }

    @Override
    public double convertToBase(double value) {
        return value*converter;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Inch);
    }
}
