package io.codelex.oop.parcels;

public class Parcel implements Validatable {
    int xLength;
    int yLength;
    int zLength;
    float weight;
    boolean isExpress;

    @Override
    public boolean validate() {
        boolean isValid = true;
        if (xLength < 30 || yLength < 30 || zLength < 30) {
            System.out.println("Each size (x, y, z) must be at least 30.");
            isValid = false;
        }

        int totalDimensions = xLength + yLength + zLength;
        if (totalDimensions > 300) {
            System.out.println("The sum of dimensions (x, y, z) cannot exceed 300.");
            isValid = false;
        }

        float maxWeight = isExpress ? 15.0f : 30.0f;
        if (weight > maxWeight) {
            System.out.println("The weight cannot exceed " + maxWeight + ".");
            isValid = false;
        }

        return isValid;
    }
}
