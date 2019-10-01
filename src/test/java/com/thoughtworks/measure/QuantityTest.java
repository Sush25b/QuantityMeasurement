package com.thoughtworks.measure;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuantityTest {

    @Test
    public void givenInchAsZero_whenCompareInch_thenShouldBeEqual() {
        Quantity zeroQuantity = QuantityFactory.getInchQuantity(0.0);
        Quantity anotherZeroQuantity = QuantityFactory.getInchQuantity(0.0);

        assertEquals(zeroQuantity, anotherZeroQuantity);
    }

    @Test
    public void givenInchAsOne_whenCompareInch_thenShouldBeEqual() {
        Quantity oneQuantity = QuantityFactory.getInchQuantity(1.0);
        Quantity anotherOneQuantity = QuantityFactory.getInchQuantity(1.0);

        assertEquals(oneQuantity, anotherOneQuantity);
    }

    @Test
    public void givenFirstInchAsOneAndSecondInchAsTwo_whenCompareFeet_thenShouldNotBeEqual() {
        Quantity firstQuantity = QuantityFactory.getInchQuantity(1.0);
        Quantity secondQuantity = QuantityFactory.getInchQuantity(2.0);

        assertFalse(firstQuantity.equals(secondQuantity));
    }

    @Test
    public void givenInchAsZeroAndObject_whenCompareInch_thenShouldNotBeEqual() {
        Quantity zeroQuantity = QuantityFactory.getInchQuantity(0.0);

        assertFalse(zeroQuantity.equals(new Object()));
    }

    @Test
    public void givenInchAsZeroAndNull_whenCompareInch_thenShouldNotBeEqual() {
        Quantity zeroQuantity = QuantityFactory.getInchQuantity(0.0);

        assertFalse(zeroQuantity.equals(null));
    }

    //////////
    @Test
    public void givenFeetAsZero_whenCompareFeet_thenShouldBeEqual() {
        Quantity zeroFeet = QuantityFactory.getFeetQuantity(0.0);
        Quantity anotherZeroFeet = QuantityFactory.getFeetQuantity(0.0);

        assertEquals(zeroFeet, anotherZeroFeet);
    }

    @Test
    public void givenFeetAsOne_whenCompareFeet_thenShouldBeEqual() {
        Quantity oneFeet = QuantityFactory.getFeetQuantity(1.0);
        Quantity anotherOneFeet = QuantityFactory.getFeetQuantity(1.0);

        assertEquals(oneFeet, anotherOneFeet);
    }

    @Test
    public void givenFirstFeetValueAsOneAndSecondFeetValueAsTwo_whenCompareFeet_thenShouldNotBeEqual() {
        Quantity firstFeet = QuantityFactory.getFeetQuantity(1.0);
        Quantity secondFeet = QuantityFactory.getFeetQuantity(2.0);

        assertFalse(firstFeet.equals(secondFeet));
    }

    @Test
    public void givenFeetAsOneAndAObject_whenCompareFeet_thenShouldNoteBeEqual() {
        Quantity zeroFeet = QuantityFactory.getFeetQuantity(0.0);

        assertFalse(zeroFeet.equals(new Object()));
    }

    @SuppressWarnings("ConstantConditions")
    @Test
    public void givenFeetAsOneAndNull_whenCompareFeet_thenShouldNoteBeEqual() {
        Quantity zeroFeet = QuantityFactory.getFeetQuantity(0.0);

        assertFalse(zeroFeet.equals(null));
    }

    //Compare feet and inch unit
    @Test
    public void givenFeetAsOneAndInchAsZero_whenCompareBothUnit_thenShouldNoteBeEqual() {
        Quantity oneFeet = QuantityFactory.getFeetQuantity(1.0);
        Quantity zeroInch = QuantityFactory.getInchQuantity(0.0);
        assertFalse(oneFeet.equals(zeroInch));
    }

    @Test
    public void givenFeetAsZeroAndInchAsZero_whenCompareBoth_thenShouldBeEqual() {
        Quantity zeroFeet = QuantityFactory.getFeetQuantity(0.0);
        Quantity oneInch = QuantityFactory.getInchQuantity(0.0);

        assertTrue(zeroFeet.equals(oneInch));
    }

    @Test
    public void givenFeetAsOneAndInchAsTwelve_whenCompareBoth_thenShouldBeTrue() {
        Quantity oneFeet = QuantityFactory.getFeetQuantity(1.0);
        Quantity twelveInch = QuantityFactory.getInchQuantity(12.0);

        assertTrue(oneFeet.equals(twelveInch));
    }

    @Test
    public void givenFeetAsTwoAndInchAsTwentyFour_whenCompareBoth_thenShouldBeTrue() {
        Quantity twoFeet = QuantityFactory.getFeetQuantity(2.0);
        Quantity twentyFourInch = QuantityFactory.getInchQuantity(24.0);

        assertTrue(twoFeet.equals(twentyFourInch));
    }

    @Test
    public void givenFeetAsThreeAndInchAsThirtySix_whenCompareBoth_thenShouldBeTrue() {
        Quantity threeFeet =QuantityFactory.getFeetQuantity(3.0);
        Quantity thirtSixInch = QuantityFactory.getInchQuantity(36.0);

        assertTrue(threeFeet.equals(thirtSixInch));
    }

    @Test
    public void givenInchAsTwelveAndFeetAsOne_whenCompareBoth_thenShouldBeTrue() {
        Quantity twelveInch = QuantityFactory.getInchQuantity(12.0);
        Quantity oneFeet = QuantityFactory.getFeetQuantity(1.0);

        assertTrue(twelveInch.equals(oneFeet));
    }

    @Test
    public void givenInchAsTwelveAndInchAsTwelve_whenCompareBoth_thenShouldBeTrue() {
        Quantity twelveInch = QuantityFactory.getInchQuantity(12.0);
        Quantity twentyfourInch = QuantityFactory.getInchQuantity(24.0);

        assertFalse(twelveInch.equals(twentyfourInch));
    }


    @Test
    public void givenGramAsZero_whenCompareGram_thenShouldBeEqual() {
        Quantity zeroQuantity = QuantityFactory.getGramQuantity(0.0);
        Quantity anotherZeroQuantity = QuantityFactory.getGramQuantity(0.0);

        assertEquals(zeroQuantity, anotherZeroQuantity);
    }

    @Test
    public void givenFirstGramAsOneAndSecondGramAsTwo_whenCompareGram_thenShouldNotBeEqual() {
        Quantity firstQuantity = QuantityFactory.getGramQuantity(1.0);
        Quantity secondQuantity = QuantityFactory.getGramQuantity(2.0);

        assertFalse(firstQuantity.equals(secondQuantity));
    }

}