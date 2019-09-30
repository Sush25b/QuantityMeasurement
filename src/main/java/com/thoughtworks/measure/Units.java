package com.thoughtworks.measure;

 public enum Units {
    feet(12.0, Measurement.length), inch(1.0, Measurement.length), gallon(3.78, Measurement.volume), liters(1.0, Measurement.volume);

    private double converter;
    protected Measurement measurement;

    Units(double converter, Measurement measurement) {
        this.converter = converter;
        this.measurement = measurement;
    }

     enum Measurement {
        length, volume
    }

    public double convertToBase(Quantity quantity) {
        return quantity.value * quantity.unit.converter;
    }
}
