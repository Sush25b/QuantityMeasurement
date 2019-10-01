package com.thoughtworks.measure.length;

import com.thoughtworks.measure.IUnits;
import com.thoughtworks.measure.Measurement;import com.thoughtworks.measure.Quantity;

public class Inch implements IUnits
{
    private double converter =1.0;
    protected final Measurement measurement= Measurement.length;

    @Override
    public Measurement getMeasurement() {
        return measurement;
    }

    @Override
    public double convertToBase(Quantity quantity) {
        return (quantity.value * converter);
    }
}
