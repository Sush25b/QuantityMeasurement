package com.thoughtworks.measure;

import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AddQuantityTest {
    @Test
    public void givenInchAsZero_whenAdded_thenShouldBeZero() {
        Quantity zeroInch = new Quantity(0, Quantity.Units.inch);

        assertEquals(new Quantity(0, Quantity.Units.inch), zeroInch.add(zeroInch));
    }

    @Test
    public void givenFirstInchAsOneAndSecondInchAsTwo_whenAdded_thenShouldBeThreeInches() {
        Quantity firstInch = new Quantity(1.0, Quantity.Units.inch);
        Quantity secondInch = new Quantity(2.0, Quantity.Units.inch);

        assertEquals(new Quantity(3.0, Quantity.Units.inch), firstInch.add(secondInch));
    }

    @Test
    public void givenFirstInchAsTwoAndSecondInchAsTwo_whenAdded_thenShouldBeFourInches() {
        Quantity twoInch = new Quantity(2.0, Quantity.Units.inch);
        Quantity anothertwoInch = new Quantity(2.0, Quantity.Units.inch);

        assertEquals(new Quantity(4.0, Quantity.Units.inch), twoInch.add(anothertwoInch));
    }

    @Test
    public void givenOneFeetAndTwoInch_whenAdded_thenShouldBeFourteenInches() {
        Quantity oneFeet = new Quantity(1.0, Quantity.Units.feet);
        Quantity twoInch = new Quantity(2.0, Quantity.Units.inch);

        assertEquals(new Quantity(14.0, Quantity.Units.inch), oneFeet.add(twoInch));
    }

    ////////
    @Test
    public void givenOneGallon_whenCompare_thenShouldBeTrue() {
        Quantity oneGallon = new Quantity(1.0, Quantity.Units.gallon);

        assertEquals(oneGallon, oneGallon);
    }

    @Test
    public void givenOneGallonAndOneLiter_whenAdded_thenShouldBeFourPointSeventyEight() {
        Quantity oneGallon = new Quantity(1.0, Quantity.Units.gallon);
        Quantity oneLiter = new Quantity(1.0, Quantity.Units.liters);

        assertEquals( new Quantity(4.78, Quantity.Units.liters),oneGallon.add(oneLiter) );
    }

    @Test(expected = ArithmeticException.class)
    public void givenOneGallonAndOnefeet_whenAdded_thenThrowRunTimeException() {
        Quantity oneGallon = new Quantity(1.0, Quantity.Units.gallon);
        Quantity oneFeet = new Quantity(1.0, Quantity.Units.feet);

        assertEquals(new Quantity(4.78, Quantity.Units.liters),oneGallon.add(oneFeet));
    }
}
