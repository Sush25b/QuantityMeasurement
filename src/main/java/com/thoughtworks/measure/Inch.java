package com.thoughtworks.measure;

public class Inch {

    private final int value;

    public Inch(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object object)
    {
        Inch inch= (Inch) object;
        return this.value== inch.value;
    }
}
