package com.thoughtworks.measure.length;

import com.thoughtworks.measure.Unit;

public class Inch implements Unit
{
    private double converter =1.0;

    @Override
    public Unit getBaseUnit() {
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
