package com.thoughtworks.measure;

import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AddLengthTest
{
    @Test
    public void givenInchAsZero_whenAdded_thenShouldBeZero()
    {
        Length zeroInch = new Length(0,Length.Unit.inch);

        assertEquals(0.0,zeroInch.add(zeroInch),0.01);
    }

}
