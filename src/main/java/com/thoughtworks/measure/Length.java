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

        if(!(object instanceof Length))
        {
            return false;
        }

        Length length = (Length) object;
        return this.value== length.value && this.unit==length.unit;
    }
}
