package com.thoughtworks.measure;

public class Quantity {

    protected final double value;
    protected final Units unit;

    public Quantity(double value, Units unit) {
        this.value = value;
        this.unit = unit;
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

        if (this.unit.group.name() != otherQuantity.unit.group.name()) {
            return false;
        }

        return (this.unit.convertToBase(this) == this.unit.convertToBase(otherQuantity));
    }

    public Quantity add(Object other) {
        Quantity otherQuantity = (Quantity) other;

        double meInBase = this.unit.convertToBase(this);
        double otherInBase = otherQuantity.unit.convertToBase(otherQuantity);

        if (otherQuantity.unit == Units.inch) {
            return new Quantity(meInBase + otherInBase, Units.inch);
        }

        if (otherQuantity.unit == Units.liters) {
            return new Quantity(Math.round((meInBase + otherInBase) * 100.0) / 100.0, Units.liters);
        }

        // if ( Units.lengthUnits.contains(this.unit) == Units.volumeUnits.contains(otherQuantity.unit)) {
        if (this.unit.group.name() != otherQuantity.unit.group.name()) {
            throw new ArithmeticException("not valid");
        }

        return new Quantity(0.0, Units.inch);
    }

    @Override
    public String toString() {
        return "Quantity{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }
}







//        if( !(this.unit==length.unit) && this.value== length.value) //0 0  unitdiff  //10
//        {
//            return true;
//        }


//
//if( !(this.unit==length.unit) && this.value== length.value)
//        {
//        return true;
//        }
//
//        return this.unit==length.unit && this.value== length.value;


//-----
//Length length = (Length) object;
//    if (this.unit == Unit.feet && !(this.unit == length.unit)) {
//            int FFET_TO_INCH = this.value * 12;                     //12 1
//            return (length.value == FFET_TO_INCH);
//            }
//
//            if (this.unit == Unit.inch && !(this.unit == length.unit)) {
//            int INCH_TO_FEET = this.value / 12;                     //12 1
//            return (length.value == INCH_TO_FEET);
//            }


//      feet, inch, gallon, liters
//        public double convertToBaseInch(Quantity quantity) {
//            if (quantity.unit == feet) {
//                return quantity.value * 12.0;
//            }
//            if (quantity.unit == gallon) {
//                return quantity.value * 3.78;
//            }
//            return quantity.value;
//        }