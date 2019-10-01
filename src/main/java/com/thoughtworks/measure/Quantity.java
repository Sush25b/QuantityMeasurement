package com.thoughtworks.measure;

public class Quantity {

    public final double value;
    protected final IUnits unit;

    public Quantity(double value, IUnits unit) {
        this.value = value;
        this.unit = unit;
    }

    private boolean isNotSimilarMeasurement(Quantity otherQuantity) {
        return !this.unit.getMeasurement().equals(otherQuantity.unit.getMeasurement());
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

        return (this.unit.convertToBase(this) == otherQuantity.unit.convertToBase(otherQuantity));
    }

    public Quantity add(Object other) {
        Quantity otherQuantity = (Quantity) other;

        double meInBase = this.unit.convertToBase(this);
        double otherInBase = otherQuantity.unit.convertToBase(otherQuantity);

        if (isNotSimilarMeasurement(otherQuantity)) {
            throw new ArithmeticException("not a valid units for conversion");
        }

        return new Quantity(Math.round((meInBase + otherInBase) * 100.0) / 100.0, otherQuantity.unit);
    }

    @Override
    public String toString() {
        return "Quantity{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }
}
