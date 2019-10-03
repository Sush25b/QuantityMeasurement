package com.thoughtworks.measure.Temperature;

import com.thoughtworks.measure.Unit;

public class Fahrenheit implements Unit
{
    private double converter =33.8;

    @Override
    public Unit getBaseUnit() {
        return new Celsius();
    }

    @Override
    public double convertToBase(double value) {
        return ( (value)/converter );
    }
}
