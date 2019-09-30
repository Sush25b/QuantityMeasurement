package com.thoughtworks.measure;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;

public class Quantity {

    private final double value;
    private Units unit;

    enum Units {

        feet(12.0), inch(1.0), gallon(3.78), liters(1.0);
        private double converter;
        static List<Units> lengthUnits = Arrays.asList(feet, inch);
        static List<Units> volumeUnits = Arrays.asList(liters,gallon);

        Units(double converter) {
            this.converter = converter;
        }

        public double convertToBaseInch(Quantity quantity) {
            return quantity.value * quantity.unit.converter;
        }

    }

    public Quantity(double value, Units unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other)               //2 other same address
        {
            return true;
        }

        if (!(other instanceof Quantity)) //instance
        {
            return false;
        }

        Quantity quantity = (Quantity) other;

        return (this.unit.convertToBaseInch(this) == this.unit.convertToBaseInch(quantity));
    }

    public Quantity add(Object other) {
        Quantity otherQuantity = (Quantity) other;

        double meInBase = this.unit.convertToBaseInch(this);
        double otherInBase = otherQuantity.unit.convertToBaseInch(otherQuantity);

        if (otherQuantity.unit == Units.inch) {
            return new Quantity(meInBase + otherInBase, Units.inch);
        }

        if (otherQuantity.unit == Units.liters) {
            return new Quantity(Math.round((meInBase + otherInBase) * 100.0) / 100.0, Units.liters);
        }

        if ( Units.lengthUnits.contains(this.unit) == Units.volumeUnits.contains(otherQuantity.unit)) {
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