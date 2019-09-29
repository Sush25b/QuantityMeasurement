package com.thoughtworks.measure;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthTest
{

    @Test
    public void givenInchAsZero_whenCompareInch_thenShouldBeEqual()
    {
        Length zeroLength = new Length(0,Length.Unit.inch);
        Length anotherZeroLength = new Length(0,Length.Unit.inch);

        assertEquals(zeroLength, anotherZeroLength);
    }

    @Test
    public void givenInchAsOne_whenCompareInch_thenShouldBeEqual()
    {
        Length oneLength = new Length(1,Length.Unit.inch);
        Length anotherOneLength = new Length(1,Length.Unit.inch);

        assertEquals(oneLength, anotherOneLength);
    }

    @Test
    public void givenFirstInchAsOneAndSecondInchAsTwo_whenCompareFeet_thenShouldNotBeEqual()
    {
        Length firstLength = new Length(1,Length.Unit.inch);
        Length secondLength = new Length(2,Length.Unit.inch);

        assertFalse( firstLength.equals(secondLength) );
    }

    @Test
    public void givenInchAsZeroAndObject_whenCompareInch_thenShouldNotBeEqual()
    {
        Length zeroLength = new Length(0,Length.Unit.inch);

        assertFalse(zeroLength.equals(new Object()));
    }

    @Test
    public void givenInchAsZeroAndNull_whenCompareInch_thenShouldNotBeEqual()
    {
        Length zeroLength = new Length(0,Length.Unit.inch);

        assertFalse(zeroLength.equals(null));
    }

    //////////
    @Test
    public void givenFeetAsZero_whenCompareFeet_thenShouldBeEqual() {
        Length zeroFeet = new Length(0,Length.Unit.feet);
        Length anotherZeroFeet = new Length(0,Length.Unit.feet);

        assertEquals(zeroFeet, anotherZeroFeet);
    }

    @Test
    public void givenFeetAsOne_whenCompareFeet_thenShouldBeEqual() {
        Length oneFeet = new Length(1,Length.Unit.feet);
        Length anotherOneFeet = new Length(1,Length.Unit.feet);

        assertEquals(oneFeet, anotherOneFeet);
    }

    @Test
    public void givenFirstFeetValueAsOneAndSecondFeetValueAsTwo_whenCompareFeet_thenShouldNotBeEqual() {
        Length firstFeet = new Length(1,Length.Unit.feet);
        Length secondFeet = new Length(2,Length.Unit.feet);

        assertFalse(firstFeet.equals(secondFeet));
    }

    @Test
    public void givenFeetAsOneAndAObject_whenCompareFeet_thenShouldNoteBeEqual() {
        Length zeroFeet = new Length(0,Length.Unit.feet);

        assertFalse(zeroFeet.equals(new Object()));
    }

    @Test
    public void givenFeetAsOneAndNull_whenCompareFeet_thenShouldNoteBeEqual() {
        Length zeroFeet = new Length(0,Length.Unit.feet);

        assertFalse(zeroFeet.equals(null));
    }

    //Compare feet and inch unit
    @Test
    public void givenFeetAsOneAndInchAsZero_whenCompareBothUnit_thenShouldNoteBeEqual() {
        Length oneFeet = new Length(1,Length.Unit.feet);
        Length zeroInch = new Length(0,Length.Unit.inch);
        assertFalse(oneFeet.equals(zeroInch));
    }

    @Test
    public void givenFeetAsZeroAndInchAsZero_whenCompareBoth_thenShouldBeEqual() {
        Length oneFeet = new Length(0,Length.Unit.feet);
        Length oneInch = new Length(0,Length.Unit.inch);

        assertTrue(oneFeet.equals(oneInch));
    }
    @Test
    public void givenFeetAsOneAndInchAsTwelve_whenCompareBoth_thenShouldBeTrue() {
        Length oneFeet = new Length(1,Length.Unit.feet);
        Length twelveInch = new Length(12,Length.Unit.inch);

        assertTrue(oneFeet.equals(twelveInch));
    }

    @Test
    public void givenFeetAsTwoAndInchAsTwentyFour_whenCompareBoth_thenShouldBeTrue() {
        Length twoFeet = new Length(2,Length.Unit.feet);
        Length twentyFourInch = new Length(24,Length.Unit.inch);

        assertTrue(twoFeet.equals(twentyFourInch));
    }
    @Test
    public void givenFeetAsThreeAndInchAsThirtySix_whenCompareBoth_thenShouldBeTrue() {
        Length threeFeet = new Length(3,Length.Unit.feet);
        Length thirtSixInch = new Length(36,Length.Unit.inch);

        assertTrue(threeFeet.equals(thirtSixInch));
    }

    @Test
    public void givenInchAsTwelveAndFeetAsOne_whenCompareBoth_thenShouldBeTrue() {
        Length twelveInch = new Length(12,Length.Unit.inch);
        Length oneFeet = new Length(1,Length.Unit.feet);

        assertTrue(twelveInch.equals(oneFeet));
    }

    @Test
    public void givenInchAsTwelveAndInchAsTwelve_whenCompareBoth_thenShouldBeTrue() {
        Length twelveInch = new Length(12,Length.Unit.inch);
        Length twentyfourInch = new Length(24,Length.Unit.inch);

        assertFalse(twelveInch.equals(twentyfourInch));
    }


    /////////
    @Test
    public void givenZeroYard_whenCompareYard_thenShouldBeEqual()
    {
        Length zeroYard = new Length(0,Length.Unit.yard);

        assertTrue(zeroYard.equals(zeroYard));
    }
}
