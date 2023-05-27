package io.codelex.oop.parcels;

public class ParcelTest {
    public static void main(String[] args) {

        Parcel one = new Parcel();

        one.zLength = 30;
        one.yLength = 50;
        one.xLength = 80;

        one.isExpress = true;

        boolean isValid = one.validate();
        if (isValid) {
            System.out.println("Parcel is valid.");
        } else {
            System.out.println("Parcel is invalid.");
        }
    }
}
