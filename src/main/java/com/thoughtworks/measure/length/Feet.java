package com.thoughtworks.measure.length;

import com.thoughtworks.measure.IUnit;
import com.thoughtworks.measure.Quantity;

public class Feet implements IUnit
{
    private double converter = 12.0;

    @Override
    public IUnit getBaseUnit() {
        return new Inch();
    }

    @Override
    public double convertToBase(double value) {
        return value*converter;
    }
}
