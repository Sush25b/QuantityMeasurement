package com.thoughtworks.measure;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuantityMeasurementTest {

    @Test
    public void givenFeetAsZero_whenCompareFeet_thenShouldBeEqual() {
        Quantity zeroFeet = new Quantity(0, Quantity.Unit.feet);
        Quantity anotherZeroFeet = new Quantity(0, Quantity.Unit.feet);

        assertEquals(zeroFeet, anotherZeroFeet);
    }

    @Test
    public void givenFeetAsOne_whenCompareFeet_thenShouldBeEqual() {
        Quantity oneFeet = new Quantity(1, Quantity.Unit.feet);
        Quantity anotherOneFeet = new Quantity(1, Quantity.Unit.feet);

        assertEquals(oneFeet, anotherOneFeet);
    }

    @Test
    public void givenFirstFeetValueAsOneAndSecondFeetValueAsTwo_whenCompareFeet_thenShouldNotBeEqual() {
        Quantity firstFeet = new Quantity(1, Quantity.Unit.feet);
        Quantity secondFeet = new Quantity(2, Quantity.Unit.feet);

        assertFalse(firstFeet.equals(secondFeet));
    }

    @Test
    public void givenFeetAsOneAndAObject_whenCompareFeet_thenShouldNoteBeEqual() {
        Quantity zeroFeet = new Quantity(0, Quantity.Unit.feet);

        assertFalse(zeroFeet.equals(new Object()));
    }

    @Test
    public void givenFeetAsOneAndNull_whenCompareFeet_thenShouldNoteBeEqual() {
        Quantity zeroFeet = new Quantity(0, Quantity.Unit.feet);

        assertFalse(zeroFeet.equals(null));
    }


}
