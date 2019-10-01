package com.thoughtworks.measure;

public class Quantity {

    public final double value;
    protected final IUnit unit;

    public Quantity(double value, IUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    private boolean isNotSimilarMeasurement(Quantity otherQuantity) {
        return !this.unit.getBaseUnit().equals(otherQuantity.unit.getBaseUnit());
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (!(other instanceof Quantity)) {
            return false;
        }

        Quantity otherQuantity = (Quantity) other;
        if (isNotSimilarMeasurement(otherQuantity)) {
            return false;
        }

        return ( this.unit.convertToBase(this.value) == otherQuantity.unit.convertToBase(otherQuantity.value));
    }

    /*
    oneFeet.add(oneInch) -> 13 inches
    oneInch.add(oneFeet) -> 13 foot
     */

    public Quantity add(Object other) {
        Quantity otherQuantity = (Quantity) other;

        double meInBase = this.unit.convertToBase(this.value);
        double otherInBase = otherQuantity.unit.convertToBase(otherQuantity.value);

        if (isNotSimilarMeasurement(otherQuantity)) {
            throw new ArithmeticException("not a valid units for conversion");
        }

        return new Quantity(Math.round((meInBase + otherInBase) * 100.0) / 100.0, otherQuantity.unit.getBaseUnit());
    }

    @Override
    public String toString() {
        return "Quantity{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }
}
