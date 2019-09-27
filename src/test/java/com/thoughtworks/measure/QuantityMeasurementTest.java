package com.thoughtworks.measure;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest
{
    @Test
    public void givenFeetAsZero_whenCompareLength_thenReturnZeroInch()
    {
        QunatityMeasurement lengthMeasurement = new QunatityMeasurement();
        Assert.assertEquals(0,lengthMeasurement.compare(0));
    }

}
