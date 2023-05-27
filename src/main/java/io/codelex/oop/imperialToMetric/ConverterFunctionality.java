package io.codelex.oop.imperialToMetric;

public class ConverterFunctionality {
    public static void main(String[] args) {

        MeasurementConverter converter = new MeasurementConverter();

        int meters = 100;
        double yards = converter.convert(meters, ConversionType.METERS_TO_YARDS);
        System.out.println(meters + " meters" + " = " + yards + " yards.");

        int inches = 10;
        double centimeters = converter.convert(inches, ConversionType.INCHES_TO_CENTIMETERS);
        System.out.println(inches + " inches" + " = " + centimeters + " centimeters.");

        int km = 100;
        double miles = converter.convert(km, ConversionType.KILOMETERS_TO_MILES);
        System.out.println(km + " km" + " = " + miles + " miles.");

    }
}
