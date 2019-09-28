package com.thoughtworks.measure;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InchTest{
    @Test
    public void givenInchAsZero_whenCompareInch_thenShouldBeEqual()
    {
        Inch zeroInch = new Inch(0);
        Inch anotherZeroInch = new Inch(0);

        assertEquals(zeroInch, anotherZeroInch);
    }
}
