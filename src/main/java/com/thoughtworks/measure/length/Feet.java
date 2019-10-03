package com.thoughtworks.measure.length;

import com.thoughtworks.measure.Unit;

public class Feet implements Unit
{
    private double converter = 12.0;

    @Override
    public Unit getBaseUnit() {
        return new Inch();
    }

    @Override
    public double convertToBase(double value)
    {
        return value*converter;
    }
}
