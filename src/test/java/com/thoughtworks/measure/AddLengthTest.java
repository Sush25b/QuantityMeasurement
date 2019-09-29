package com.thoughtworks.measure;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AddLengthTest
{
    @Test
    public void givenInchAsZero_whenAdded_thenShouldBeEqual()
    {
        Length zeroInch = new Length(0,Length.Unit.inch);

        assertTrue(zeroInch.equals(zeroInch));
    }


}
