package com.thoughtworks.measure.weight;

import com.thoughtworks.measure.Unit;

public class Gram implements Unit
{
    private double converter =1.0;

    @Override
    public Unit getBaseUnit() {
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
