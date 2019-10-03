package com.thoughtworks.measure;

import com.thoughtworks.measure.Temperature.Celsius;
import com.thoughtworks.measure.Temperature.Fahrenheit;
import com.thoughtworks.measure.length.Feet;
import com.thoughtworks.measure.length.Inch;
import com.thoughtworks.measure.volume.Gallon;
import com.thoughtworks.measure.volume.Liter;
import com.thoughtworks.measure.weight.Gram;
import com.thoughtworks.measure.weight.Kilogram;

public class QuantityFactory
{
    public static AddableQuantity getInchQuantity(double value) { return new AddableQuantity(value, new Inch()); }

    public static AddableQuantity getFeetQuantity(double value) { return new AddableQuantity(value, new Feet()); }

    public static AddableQuantity getLiterQuantity(double value) { return new AddableQuantity(value, new Liter()); }

    public static AddableQuantity getGallonQuantity(double value) { return new AddableQuantity(value, new Gallon()); }

    public static AddableQuantity getGramQuantity(double value){return  new AddableQuantity(value, new Gram()); }

    public static AddableQuantity getKilogramGramQuantity(double value){return new AddableQuantity(value, new Kilogram()); }

    public static Quantity getCelsiusQuantity(double value) {return new Quantity(value, new Celsius()); };

    public static Quantity getFahrenheitQuantity(double value){ return  new Quantity(value, new Fahrenheit());}

}
