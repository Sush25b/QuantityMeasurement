package com.thoughtworks.measure;

 public enum Units {
    feet(12.0, Group.length), inch(1.0, Group.length), gallon(3.78, Group.volume), liters(1.0, Group.volume);

    private double converter;
    protected Group group;

//        static List<Units> lengthUnits = Arrays.asList(feet, inch);
//        static List<Units> volumeUnits = Arrays.asList(liters,gallon);

    Units(double converter, Group group) {
        this.converter = converter;
        this.group = group;
    }

     enum Group {
        length, volume
    }

    public double convertToBase(Quantity quantity) {
        return quantity.value * quantity.unit.converter;
    }
}
