package com.thoughtworks.measure;

public class Quantity
{
    public final double value;
    protected final IUnit unit;

    public Quantity(double value, IUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    boolean isNotSimilarMeasurement(Quantity otherQuantity) {
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

    @Override
    public String toString() {
        return "Quantity{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }
}
