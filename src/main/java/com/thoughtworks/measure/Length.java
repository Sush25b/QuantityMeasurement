package com.thoughtworks.measure;

public class Length {

    private final int value;
    private Unit unit;

    enum Unit{
        feet,inch
    }

    public Length(int value, Unit unit) {
        this.value = value;
        this.unit=unit;
    }

    @Override
    public boolean equals(Object object)
    {
        if(this==object)               //2 object same address
        {
            return true;
        }

        if(!(object instanceof Length)) //instance
        {
            return false;
        }

        Length length = (Length) object;
        if( this.unit== Unit.feet && !(this.unit==length.unit) )
        {
            int FFET_TO_INCH = this.value * 12;                     //12 1
            return (length.value==FFET_TO_INCH );
        }

        if( this.unit== Unit.inch && !(this.unit==length.unit) )
        {
            int INCH_TO_FEET = this.value / 12;                     //12 1
            return (length.value==INCH_TO_FEET) ;
        }

        return this.unit==length.unit && this.value== length.value;
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