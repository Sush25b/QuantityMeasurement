package com.thoughtworks.measure;

public interface Unit
{
    double convertToBase(double value);
    Unit getBaseUnit();
}
