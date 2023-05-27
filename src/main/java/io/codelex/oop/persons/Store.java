package io.codelex.oop.persons;

import java.time.LocalDate;

public class Store {
    public static void main(String[] args) {

        Person jhonSmith = new Employee("Jhon", "Smith", "1001", 31, "manager", LocalDate.of(2010, 1, 1));
        Person jhaneCustom = new Customer("Jhane", "Custom", "59812", 25, "12545", 0);

        jhonSmith.getInfo();
        jhaneCustom.getInfo();
    }
}
