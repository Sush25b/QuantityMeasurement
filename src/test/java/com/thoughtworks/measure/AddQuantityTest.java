package com.thoughtworks.measure;

import com.thoughtworks.measure.length.Inch;
import com.thoughtworks.measure.volume.Liter;
import com.thoughtworks.measure.weight.Gram;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddQuantityTest {
    @Test
    public void givenInchAsZero_whenAdded_thenShouldBeZero() {
        AddableQuantity zeroInch = QuantityFactory.getInchQuantity(0.0);

        assertEquals(new Quantity(0, new Inch()), zeroInch.add(zeroInch));
    }

    @Test
    public void givenFirstInchAsOneAndSecondInchAsTwo_whenAdded_thenShouldBeThreeInches() {
        AddableQuantity firstInch = QuantityFactory.getInchQuantity(1.0);
        AddableQuantity secondInch = QuantityFactory.getInchQuantity(2.0);

        assertEquals(new Quantity(3.0, new Inch()), firstInch.add(secondInch));
    }

    @Test
    public void givenFirstInchAsTwoAndSecondInchAsTwo_whenAdded_thenShouldBeFourInches() {
        AddableQuantity twoInch = QuantityFactory.getInchQuantity(2.0);
        AddableQuantity anothertwoInch = QuantityFactory.getInchQuantity(2.0);

        assertEquals(new Quantity(4.0, new Inch()), twoInch.add(anothertwoInch));
    }

    @Test
    public void givenOneFeetAndTwoInch_whenAdded_thenShouldBeFourteenInches() {
        AddableQuantity oneFeet = QuantityFactory.getFeetQuantity(1.0);
        AddableQuantity twoInch = QuantityFactory.getInchQuantity(2.0);

        assertEquals(new Quantity(14.0, new Inch()), oneFeet.add(twoInch));
    }

    @Test
    public void givenTwoInchAndOneFeet_whenAdded_thenShouldBeFourteenInches() {
        AddableQuantity twoInch = QuantityFactory.getInchQuantity(2.0);
        AddableQuantity oneFeet = QuantityFactory.getFeetQuantity(1.0);

        assertEquals(new Quantity(14.0, new Inch()), twoInch.add(oneFeet));
    }

    @Test
    public void givenOneGallon_whenCompare_thenShouldBeTrue() {
        Quantity oneGallon = QuantityFactory.getGallonQuantity(1.0);

        assertEquals(oneGallon, oneGallon);
    }

    @Test
    public void givenOneGallonAndOneLiter_whenAdded_thenShouldBeFourPointSeventyEight() {
        AddableQuantity oneGallon = QuantityFactory.getGallonQuantity(1.0);
        AddableQuantity oneLiter = QuantityFactory.getLiterQuantity(1.0);

        assertEquals(new Quantity(4.78, new Liter()), oneGallon.add(oneLiter));
    }

    @Test(expected = ArithmeticException.class)
    public void givenOneGallonAndOnefeet_whenAdded_thenThrowRunTimeException() {
        AddableQuantity oneGallon =  QuantityFactory.getGallonQuantity(1.0);
        AddableQuantity oneFeet = QuantityFactory.getFeetQuantity(1.0);

        assertEquals(new Quantity(4.78, new Liter()), oneGallon.add(oneFeet));
    }

    @Test
    public void givenOneGallonAndOnefeet_checkUnits_thenShouldNotBeEquals() {
        Quantity oneGallon = QuantityFactory.getGallonQuantity(1.0);
        Quantity oneFeet = QuantityFactory.getFeetQuantity(1.0);

        assertFalse(oneGallon.equals(oneFeet));
    }


    @Test
    public void givenZeroGram_whenAdded_thenShouldBeZero() {
        AddableQuantity zeroGram = QuantityFactory.getGramQuantity(0.0);

        assertEquals(new Quantity(0.0, new Gram()), zeroGram.add(zeroGram));
    }

    @Test
    public void givenFirstGramAsOneAndSecondGramAsTwo_whenAdded_thenShouldBeThreeGram() {
        AddableQuantity firstGram = QuantityFactory.getGramQuantity(1.0);
        AddableQuantity secondGram = QuantityFactory.getGramQuantity(2.0);

        assertEquals(new Quantity(3.0, new Gram()), firstGram.add(secondGram));
    }

    @Test
    public void givenOneGramAndOneKilogram_whenAdded_thenShouldOneThousandOneGram() {
        AddableQuantity oneGram = QuantityFactory.getGramQuantity(1.0);
        AddableQuantity oneKilogram = QuantityFactory.getKilogramGramQuantity(1.0);

        assertEquals(new Quantity(1001.0, new Gram()), oneGram.add(oneKilogram));
    }

    @Test
    public void givenOneKilogramAndOneGram_whenAdded_thenShouldOneThousandOneGram() {
        AddableQuantity oneKilogram = QuantityFactory.getKilogramGramQuantity(1.0);
        AddableQuantity oneGram = QuantityFactory.getGramQuantity(1.0);

        assertEquals(new Quantity(1001.0, new Gram()), oneKilogram.add(oneGram));
    }

//    @Test
//    public void givenOneCelsiusAndOneCelsius_whenAdded_thenShouldNotBeAdded() {
//        Quantity oneCelsius = QuantityFactory.getCelsiusQuantity(1.0);
//        Quantity anotherOneCelsius = QuantityFactory.getCelsiusQuantity(1.0);
//
//        assertEquals(new Quantity(1001.0, new Gram()),oneCelsius.add(anotherOneCelsius));
//    }
}
