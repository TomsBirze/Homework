package io.codelex.classesandobjects.practice.Exercise5;

public class DateTest {
    public static void main(String[] args) {

        Date today = new Date(13, 5, 2023);
        Date someday = new Date(13, 5, 2023);
        Date birthDate = new Date(0, 0, 0);

        today.displayDate();

        someday.setDay(3);
        someday.setMonth(8);
        someday.setYear(1991);
        someday.displayDate();

        birthDate.setDay(21);
        birthDate.setMonth(11);
        birthDate.setYear(1995);
        birthDate.displayDate();
    }
}
