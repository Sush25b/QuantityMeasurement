package com.thoughtworks.measure;

public class Inch {

    private final int value;

    public Inch(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object object)
    {
        if(!(object instanceof Inch))
        {
            return false;
        }

        Inch inch= (Inch) object;
        return this.value== inch.value;
    }
}
