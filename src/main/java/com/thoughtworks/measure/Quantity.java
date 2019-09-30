package com.thoughtworks.measure;

import java.util.Arrays;
import java.util.List;

public class Quantity {

    private final double value;
    private Units unit;

    enum Units {
        feet(12.0), inch(1.0), gallon(3.78), liters(1.0);

        private double converter;

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

    public Quantity add(Object other)
    {
        Quantity otherQuantity = (Quantity) other;
        List<Units> lengthUnits = Arrays.asList(Units.feet,Units.inch);
        List<Units> volumeUnits= Arrays.asList(Units.liters,Units.gallon);

        if(otherQuantity.unit==Units.inch)
        {
           return new Quantity(this.unit.convertToBaseInch(this) + otherQuantity.unit.convertToBaseInch(otherQuantity), unit.inch);
        }

        if( otherQuantity.unit==Units.liters )
        {
            return new Quantity(Math.round((this.unit.convertToBaseInch(this) + otherQuantity.unit.convertToBaseInch(otherQuantity)) * 100.0) / 100.0, unit.liters);
        }

        if(lengthUnits.contains(this.unit) == volumeUnits.contains(otherQuantity.unit)) {
            throw new ArithmeticException("not valid");
        }

        return new Quantity(0.0,unit.inch);
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