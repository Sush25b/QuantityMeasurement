package com.thoughtworks.measure;

public class Feet
{
    private final int value;

    public Feet(int value) {
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
