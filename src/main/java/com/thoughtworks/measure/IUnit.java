package com.thoughtworks.measure;

public interface IUnit
{
    double convertToBase(double value);
    IUnit getBaseUnit();
}
