package com.thoughtworks.measure;

import org.junit.Assert;
import org.junit.Test;

public class LengthMeasurementTest
{
    @Test
    public void givenFeetAsZero_whenCompareLength_thenReturnZeroInch()
    {
        LengthMeasurement lengthMeasurement = new LengthMeasurement();
        Assert.assertEquals(0,lengthMeasurement.measure(0));
    }

}
