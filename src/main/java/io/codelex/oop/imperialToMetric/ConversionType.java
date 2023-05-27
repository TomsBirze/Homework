package io.codelex.oop.imperialToMetric;

public enum ConversionType {
    METERS_TO_YARDS(1.093613),
    YARDS_TO_METERS(0.9144),
    CENTIMETERS_TO_ICHES(0.3937008),
    INCHES_TO_CENTIMETERS(2.54),
    KILOMETERS_TO_MILES(0.6213712),
    MILES_TO_KILOMETERS(1.609344);
    private final double parameter;

    ConversionType(double parameter) {
        this.parameter = parameter;
    }

    public double getParameter() {
        return parameter;
    }
}
