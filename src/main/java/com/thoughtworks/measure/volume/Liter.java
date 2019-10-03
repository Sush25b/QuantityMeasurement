package com.thoughtworks.measure.volume;

import com.thoughtworks.measure.Unit;

public class Liter implements Unit
{
    private double converter =1.0;

    @Override
    public Unit getBaseUnit() {
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
