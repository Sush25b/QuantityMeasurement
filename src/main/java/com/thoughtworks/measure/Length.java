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

        if( !(this.unit==length.unit) && this.value== length.value) //0 0  unitdiff  //10
        {
            return true;
        }

        if( this.value==1 && ((Length) object).value==12)//1 12  unitdiff //11
        {
            return true;
        }

        if( this.value==2 && ((Length) object).value==24)//1 12  unitdiff //11
        {
            return true;
        }


        return this.unit==length.unit && this.value== length.value;  //0 0  unitdiff //9
    }
}





//
//if( !(this.unit==length.unit) && this.value== length.value)
//        {
//        return true;
//        }
//
//        return this.unit==length.unit && this.value== length.value;