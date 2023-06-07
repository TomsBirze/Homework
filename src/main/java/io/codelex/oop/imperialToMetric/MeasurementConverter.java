package io.codelex.oop.imperialToMetric;

public class MeasurementConverter {

    public double convert(int value, ConversionType conversionType) {
        return switch (conversionType) {
            case METERS_TO_YARDS -> value * ConversionType.METERS_TO_YARDS.getParameter();
            case YARDS_TO_METERS -> value * ConversionType.YARDS_TO_METERS.getParameter();
            case CENTIMETERS_TO_ICHES -> value * ConversionType.CENTIMETERS_TO_ICHES.getParameter();
            case KILOMETERS_TO_MILES -> value * ConversionType.KILOMETERS_TO_MILES.getParameter();
            case MILES_TO_KILOMETERS -> value * ConversionType.MILES_TO_KILOMETERS.getParameter();
            case INCHES_TO_CENTIMETERS -> value * ConversionType.INCHES_TO_CENTIMETERS.getParameter();
            default -> 0.0;
        };
    }
}
