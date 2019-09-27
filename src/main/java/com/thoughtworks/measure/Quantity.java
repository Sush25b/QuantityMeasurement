package com.thoughtworks.measure;

public class Quantity
{
    private final int value;
    private final String unit;

    public Quantity(int value, String unit)
    {
        this.value = value;
        this.unit = unit;
    }

    public boolean compare(Quantity quantity)
    {
        return this.value==quantity.value;
    }

}
