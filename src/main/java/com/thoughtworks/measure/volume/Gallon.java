package com.thoughtworks.measure.volume;

import com.thoughtworks.measure.IUnit;
import com.thoughtworks.measure.Quantity;

public class Gallon implements IUnit
{
    private double converter =3.78;

    @Override
    public IUnit getBaseUnit() {
        return new Liter();
    }

    @Override
    public double convertToBase(double value) {
        return value*converter;
    }

}
