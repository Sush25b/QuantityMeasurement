package com.thoughtworks.measure;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class InchTest{
    @Test
    public void givenInchAsZero_whenCompareInch_thenShouldBeEqual()
    {
        Inch zeroInch = new Inch(0);
        Inch anotherZeroInch = new Inch(0);

        assertEquals(zeroInch, anotherZeroInch);
    }

    @Test
    public void givenInchAsOne_whenCompareInch_thenShouldBeEqual()
    {
        Inch oneInch = new Inch(1);
        Inch anotherOneInch = new Inch(1);

        assertEquals(oneInch, anotherOneInch);
    }

    @Test
    public void givenFirstInchAsOneAndSecondInchAsTwo_whenCompareFeet_thenShouldNotBeEqual()
    {
        Inch firstInch = new Inch(1);
        Inch secondInch = new Inch(2);

        assertFalse(firstInch.equals(secondInch));
    }
}
