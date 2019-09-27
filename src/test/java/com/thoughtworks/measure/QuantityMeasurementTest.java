package com.thoughtworks.measure;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class QuantityMeasurementTest {
    @Test
    public void givenFeetAsZero_whenCompareFeet_thenShouldBeEqual() {
        Quantity zeroFeet = new Quantity(0, "feet");

        assertTrue(zeroFeet.compare(zeroFeet));
    }

    @Test
    public void givenFeetAsOne_whenCompareFeet_thenShouldBeEqual() {
        Quantity oneFeet = new Quantity(1, "feet");

        assertTrue(oneFeet.compare(oneFeet));
    }

    @Test
    public void givenFirstFeetValueAsOneAndSecondFeetValueAsTwo_whenCompareFeet_thenShouldNotBeEqual() {
        Quantity firstFeet = new Quantity(1, "feet");
        Quantity secondFeet = new Quantity(2, "feet");

        assertFalse(firstFeet.compare(secondFeet));
    }

    @Test
    public void givenInchAsZero_whenCompareInch_thenShouldBeEqual() {
        Quantity zeroInch = new Quantity(0, "inch");

        assertTrue(zeroInch.compare(zeroInch));
    }
    @Test
    public void givenInchAsOne_whenCompareInch_thenShouldBeEqual() {
        Quantity oneInch = new Quantity(1, "inch");

        assertTrue(oneInch.compare(oneInch));
    }

}
