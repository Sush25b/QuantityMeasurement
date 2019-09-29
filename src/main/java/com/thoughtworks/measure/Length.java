package com.thoughtworks.measure;

public class Length {

    private final double value;
    private Unit unit;

    enum Unit {
        feet, inch;

//        private double converter;
//
//        Unit(double converter) {
//            this.converter = converter;
//        }
//
//        public double convertToBaseInch(Length length) {
//            return length.value * converter;
//        }

        public double convertToBaseInch(Length length)
        {
            if (length.unit == feet) {
                return length.value * 12.0;
            }

            return length.value;
        }

    }
    public Length(int value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other)               //2 other same address
        {
            return true;
        }

        if (!(other instanceof Length)) //instance
        {
            return false;
        }

        Length length = (Length) other;

        return (this.unit.convertToBaseInch(this) == this.unit.convertToBaseInch(length));
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
