package com.thoughtworks.measure.Temperature;

import com.thoughtworks.measure.IUnit;

public class Fahrenheit implements IUnit
{
    private double converter =33.8;

    @Override
    public IUnit getBaseUnit() {
        return new Celsius();
    }

    @Override
    public double convertToBase(double value) {
        return ( (value)/converter );
    }
}
