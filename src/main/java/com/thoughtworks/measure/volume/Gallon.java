package com.thoughtworks.measure.volume;

import com.thoughtworks.measure.Unit;

public class Gallon implements Unit
{
    private double converter =3.78;

    @Override
    public Unit getBaseUnit() {
        return new Liter();
    }

    @Override
    public double convertToBase(double value) {
        return value*converter;
    }

}
