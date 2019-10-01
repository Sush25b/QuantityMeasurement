package com.thoughtworks.measure;

import com.thoughtworks.measure.length.Feet;
import com.thoughtworks.measure.length.Inch;
import com.thoughtworks.measure.volume.Gallon;
import com.thoughtworks.measure.volume.Liter;
import com.thoughtworks.measure.weight.Gram;
import com.thoughtworks.measure.weight.Kilogram;

public class QuantityFactory
{
    public static Quantity getInchQuantity(double value) { return new Quantity(value, new Inch()); }

    public static Quantity getFeetQuantity(double value) { return new Quantity(value, new Feet()); }

    public static Quantity getLiterQuantity(double value) { return new Quantity(value, new Liter()); }

    public static Quantity getGallonQuantity(double value) { return new Quantity(value, new Gallon()); }

    public static Quantity getGramQuantity(double value){return  new Quantity(value, new Gram()); }

    public static Quantity getKilogramGramQuantity(double value){return  new Quantity(value, new Kilogram()); }

}
