package com.thoughtworks.measure;

public class Feet
{
    private final int value;
    public  Unit unit;          //enum

    enum Unit{
        feet
    }

    public Feet(int value, Unit unit) {
        this.value = value;
    }

    @Override
    public boolean equals(Object object)
    {
        if(!(object instanceof Feet))
        {
            return false;
        }

        Feet q= (Feet) object;
        return this.value==q.value;
    }

}




//    public boolean compare(Quantity quantity)
//    {
//        return this.value==quantity.value;
//    }
