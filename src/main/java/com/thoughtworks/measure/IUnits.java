package com.thoughtworks.measure;

public interface IUnits
{
    Measurement getMeasurement();
    double convertToBase(Quantity quantity);
}
