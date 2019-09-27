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
}
