package com.thoughtworks.measure;

public class Length {

    private final int value;
    private final Unit unit;

    enum Unit{
        feet,inch
    }

    public Length(int value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object object)
    {
        if (this==object)               //early return
        {
            return true;
        }

        if(!(object instanceof Length))
        {
            return false;
        }

        Length length = (Length) object;
        return this.value== length.value;
    }
}
