package com.thoughtworks.measure;

public class Quantity
{
    private final int value;
    public  Unit unit;          //enum

    enum Unit{
        feet,inch
    }

    public Quantity(int value, Unit unit) {
        this.value = value;
    }

    @Override
    public boolean equals(Object object)
    {
        if(!(object instanceof Quantity))
        {
            return false;
        }

        Quantity q= (Quantity) object;
        return this.value==q.value;
    }

}




//    public boolean compare(Quantity quantity)
//    {
//        return this.value==quantity.value;
//    }
