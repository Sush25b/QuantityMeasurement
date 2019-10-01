package com.thoughtworks.measure;

import com.thoughtworks.measure.length.Inch;
import com.thoughtworks.measure.volume.Gallon;
import com.thoughtworks.measure.volume.Liter;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddQuantityTest {
    @Test
    public void givenInchAsZero_whenAdded_thenShouldBeZero() {
        Quantity zeroInch = QuantityFactory.getInchQuantity(0.0);

        assertEquals(new Quantity(0, new Inch()), zeroInch.add(zeroInch));
    }

    @Test
    public void givenFirstInchAsOneAndSecondInchAsTwo_whenAdded_thenShouldBeThreeInches() {
        Quantity firstInch = QuantityFactory.getInchQuantity(1.0);// new Quantity(1.0, Units.inch);
        Quantity secondInch = QuantityFactory.getInchQuantity(2.0);//new Quantity(2.0, Units.inch);

        assertEquals(new Quantity(3.0, new Inch()), firstInch.add(secondInch));
    }

    @Test
    public void givenFirstInchAsTwoAndSecondInchAsTwo_whenAdded_thenShouldBeFourInches() {
        Quantity twoInch = QuantityFactory.getInchQuantity(2.0);//new Quantity(2.0, Units.inch);
        Quantity anothertwoInch = QuantityFactory.getInchQuantity(2.0);//new Quantity(2.0, Units.inch);

        assertEquals(new Quantity(4.0, new Inch()), twoInch.add(anothertwoInch));
    }

    @Test
    public void givenOneFeetAndTwoInch_whenAdded_thenShouldBeFourteenInches() {
        Quantity oneFeet = QuantityFactory.getFeetQuantity(1.0);//new Quantity(1.0, Units.feet);
        Quantity twoInch = QuantityFactory.getInchQuantity(2.0);//new Quantity(2.0, Units.inch);

        assertEquals(new Quantity(14.0, new Inch()), oneFeet.add(twoInch));
    }

    ////////
    @Test
    public void givenOneGallon_whenCompare_thenShouldBeTrue() {
        Quantity oneGallon = QuantityFactory.getGallonQuantity(1.0);

        assertEquals(oneGallon, oneGallon);
    }

    @Test
    public void givenOneGallonAndOneLiter_whenAdded_thenShouldBeFourPointSeventyEight() {
        Quantity oneGallon = QuantityFactory.getGallonQuantity(1.0);//new Quantity(1.0, Units.gallon);
        Quantity oneLiter = QuantityFactory.getLiterQuantity(1.0);//new Quantity(1.0, Units.liters);

        assertEquals(new Quantity(4.78, new Liter()), oneGallon.add(oneLiter));
    }

    @Test(expected = ArithmeticException.class)
    public void givenOneGallonAndOnefeet_whenAdded_thenThrowRunTimeException() {
        Quantity oneGallon =  QuantityFactory.getGallonQuantity(1.0);//new Quantity(1.0, Units.gallon);
        Quantity oneFeet = QuantityFactory.getFeetQuantity(1.0);//new Quantity(1.0, Units.feet);

        assertEquals(new Quantity(4.78, new Liter()), oneGallon.add(oneFeet));
    }

    @Test
    public void givenOneGallonAndOnefeet_checkUnits_thenShouldNotBeEquals() {
        Quantity oneGallon = QuantityFactory.getGallonQuantity(1.0);//new Quantity(1.0, Units.gallon);
        Quantity oneFeet = QuantityFactory.getFeetQuantity(1.0);//new Quantity(1.0, Units.feet);

        assertFalse(oneGallon.equals(oneFeet));
    }
}
