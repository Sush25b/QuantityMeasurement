package com.thoughtworks.measure;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuantityTest
{

    @Test
    public void givenInchAsZero_whenCompareInch_thenShouldBeEqual()
    {
        Quantity zeroQuantity = new Quantity(0, Units.inch);
        Quantity anotherZeroQuantity = new Quantity(0, Units.inch);

        assertEquals(zeroQuantity, anotherZeroQuantity);
    }

    @Test
    public void givenInchAsOne_whenCompareInch_thenShouldBeEqual()
    {
        Quantity oneQuantity = new Quantity(1, Units.inch);
        Quantity anotherOneQuantity = new Quantity(1, Units.inch);

        assertEquals(oneQuantity, anotherOneQuantity);
    }

    @Test
    public void givenFirstInchAsOneAndSecondInchAsTwo_whenCompareFeet_thenShouldNotBeEqual()
    {
        Quantity firstQuantity = new Quantity(1, Units.inch);
        Quantity secondQuantity = new Quantity(2, Units.inch);

        assertFalse( firstQuantity.equals(secondQuantity) );
    }

    @Test
    public void givenInchAsZeroAndObject_whenCompareInch_thenShouldNotBeEqual()
    {
        Quantity zeroQuantity = new Quantity(0, Units.inch);

        assertFalse(zeroQuantity.equals(new Object()));
    }

    @Test
    public void givenInchAsZeroAndNull_whenCompareInch_thenShouldNotBeEqual()
    {
        Quantity zeroQuantity = new Quantity(0, Units.inch);

        assertFalse(zeroQuantity.equals(null));
    }

    //////////
    @Test
    public void givenFeetAsZero_whenCompareFeet_thenShouldBeEqual() {
        Quantity zeroFeet = new Quantity(0, Units.feet);
        Quantity anotherZeroFeet = new Quantity(0, Units.feet);

        assertEquals(zeroFeet, anotherZeroFeet);
    }

    @Test
    public void givenFeetAsOne_whenCompareFeet_thenShouldBeEqual() {
        Quantity oneFeet = new Quantity(1, Units.feet);
        Quantity anotherOneFeet = new Quantity(1, Units.feet);

        assertEquals(oneFeet, anotherOneFeet);
    }

    @Test
    public void givenFirstFeetValueAsOneAndSecondFeetValueAsTwo_whenCompareFeet_thenShouldNotBeEqual() {
        Quantity firstFeet = new Quantity(1, Units.feet);
        Quantity secondFeet = new Quantity(2, Units.feet);

        assertFalse(firstFeet.equals(secondFeet));
    }

    @Test
    public void givenFeetAsOneAndAObject_whenCompareFeet_thenShouldNoteBeEqual() {
        Quantity zeroFeet = new Quantity(0, Units.feet);

        assertFalse(zeroFeet.equals(new Object()));
    }

    @Test
    public void givenFeetAsOneAndNull_whenCompareFeet_thenShouldNoteBeEqual() {
        Quantity zeroFeet = new Quantity(0, Units.feet);

        assertFalse(zeroFeet.equals(null));
    }

    //Compare feet and inch unit
    @Test
    public void givenFeetAsOneAndInchAsZero_whenCompareBothUnit_thenShouldNoteBeEqual() {
        Quantity oneFeet = new Quantity(1, Units.feet);
        Quantity zeroInch = new Quantity(0, Units.inch);
        assertFalse(oneFeet.equals(zeroInch));
    }

    @Test
    public void givenFeetAsZeroAndInchAsZero_whenCompareBoth_thenShouldBeEqual() {
        Quantity oneFeet = new Quantity(0, Units.feet);
        Quantity oneInch = new Quantity(0, Units.inch);

        assertTrue(oneFeet.equals(oneInch));
    }
    @Test
    public void givenFeetAsOneAndInchAsTwelve_whenCompareBoth_thenShouldBeTrue() {
        Quantity oneFeet = new Quantity(1, Units.feet);
        Quantity twelveInch = new Quantity(12, Units.inch);

        assertTrue(oneFeet.equals(twelveInch));
    }

    @Test
    public void givenFeetAsTwoAndInchAsTwentyFour_whenCompareBoth_thenShouldBeTrue() {
        Quantity twoFeet = new Quantity(2, Units.feet);
        Quantity twentyFourInch = new Quantity(24, Units.inch);

        assertTrue(twoFeet.equals(twentyFourInch));
    }
    @Test
    public void givenFeetAsThreeAndInchAsThirtySix_whenCompareBoth_thenShouldBeTrue() {
        Quantity threeFeet = new Quantity(3, Units.feet);
        Quantity thirtSixInch = new Quantity(36, Units.inch);

        assertTrue(threeFeet.equals(thirtSixInch));
    }

    @Test
    public void givenInchAsTwelveAndFeetAsOne_whenCompareBoth_thenShouldBeTrue() {
        Quantity twelveInch = new Quantity(12, Units.inch);
        Quantity oneFeet = new Quantity(1, Units.feet);

        assertTrue(twelveInch.equals(oneFeet));
    }

    @Test
    public void givenInchAsTwelveAndInchAsTwelve_whenCompareBoth_thenShouldBeTrue() {
        Quantity twelveInch = new Quantity(12, Units.inch);
        Quantity twentyfourInch = new Quantity(24, Units.inch);

        assertFalse(twelveInch.equals(twentyfourInch));
    }


    /////////
//    @Test
//    public void givenZeroYard_whenCompareYard_thenShouldBeEqual()
//    {
//        Length zeroYard = new Length(0,Length.Unit.yard);
//
//        assertTrue(zeroYard.equals(zeroYard));
//    }
//
//    @Test
//    public void givenOneYard_whenCompareYard_thenShouldBeEqual()
//    {
//        Length oneYard = new Length(1,Length.Unit.yard);
//
//        assertTrue(oneYard.equals(oneYard));
//    }
//
//    @Test
//    public void givenFirstYardAsOneAndSecondYardAsTwo_whenCompareYard_thenShouldNotBeEqual()
//    {
//        Length firstYard = new Length(1,Length.Unit.yard);
//        Length secondYard = new Length(2,Length.Unit.yard);
//
//        assertFalse(firstYard.equals(secondYard));
//    }
//
//    @Test
//    public void givenOneYardAndObject_whenCompareYard_thenShouldNotBeEqual()
//    {
//        Length oneYard = new Length(1,Length.Unit.yard);
//
//        assertFalse(oneYard.equals(new Object()));
//    }
//
//    @Test
//    public void givenOneYardAndANull_whenCompareYard_thenShouldNotBeEqual()
//    {
//        Length oneYard = new Length(1,Length.Unit.yard);
//
//        assertFalse(oneYard.equals(null));
//    }
//
//    @Test
//    public void givenOneYardAndOneFeet_whenCompareUnits_thenShouldNotBeEqual()
//    {
//        Length oneYard = new Length(1,Length.Unit.yard);
//        Length oneFeet = new Length(1,Length.Unit.feet);
//
//        assertFalse(oneYard.equals(oneFeet));
//    }
//
//    @Test
//    public void givenZeroYardAndZeroFeet_whenCompare_thenShouldBeEqual()
//    {
//        Length zeroYard = new Length(0,Length.Unit.yard);
//        Length zeroFeet = new Length(0,Length.Unit.feet);
//
//        assertTrue(zeroYard.equals(zeroFeet));
//    }

//    @Test
//    public void givenOneYardAndThreeFeet_whenCompare_thenShouldBeEqual()
//    {
//        Length oneYard = new Length(1,Length.Unit.yard);
//        Length threeFeet = new Length(3,Length.Unit.feet);
//
//        assertTrue(oneYard.equals(threeFeet));
//    }
}
