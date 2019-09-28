package com.thoughtworks.measure;

import org.junit.Test;

import static org.junit.Assert.*;

public class FeetTest {

    @Test
    public void givenFeetAsZero_whenCompareFeet_thenShouldBeEqual() {
        Feet zeroFeet = new Feet(0);
        Feet anotherZeroFeet = new Feet(0);

        assertEquals(zeroFeet, anotherZeroFeet);
    }

    @Test
    public void givenFeetAsOne_whenCompareFeet_thenShouldBeEqual() {
        Feet oneFeet = new Feet(1);
        Feet anotherOneFeet = new Feet(1);

        assertEquals(oneFeet, anotherOneFeet);
    }

    @Test
    public void givenFirstFeetValueAsOneAndSecondFeetValueAsTwo_whenCompareFeet_thenShouldNotBeEqual() {
        Feet firstFeet = new Feet(1);
        Feet secondFeet = new Feet(2);

        assertFalse(firstFeet.equals(secondFeet));
    }

    @Test
    public void givenFeetAsOneAndAObject_whenCompareFeet_thenShouldNoteBeEqual() {
        Feet zeroFeet = new Feet(0);

        assertFalse(zeroFeet.equals(new Object()));
    }

    @Test
    public void givenFeetAsOneAndNull_whenCompareFeet_thenShouldNoteBeEqual() {
        Feet zeroFeet = new Feet(0);

        assertFalse(zeroFeet.equals(null));
    }

}
