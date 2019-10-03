package com.thoughtworks.measure;

public class AddableQuantity extends Quantity
{
    public AddableQuantity(double value, Unit unit) {
        super(value, unit);
    }

    public Quantity add(Object other)
    {
        Quantity otherQuantity = (Quantity) other;

        double meInBase = this.unit.convertToBase(this.value);
        double otherInBase = otherQuantity.unit.convertToBase(otherQuantity.value);

        if (isNotSimilarMeasurement(otherQuantity)) {                           //base unit not same
            throw new ArithmeticException("not a valid units for conversion");
        }

        return new Quantity(Math.round((meInBase + otherInBase) * 100.0) / 100.0, otherQuantity.unit.getBaseUnit());
    }
}
