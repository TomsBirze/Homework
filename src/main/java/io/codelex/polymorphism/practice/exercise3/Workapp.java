package io.codelex.polymorphism.practice.exercise3;

public class Workapp {
    public static void main(String[] args) {

        Person jonny = new Student(85.5);
        Person billy = new Employee("manager");
        
        jonny.setFirstName("Jonny");
        jonny.setLastName("Smith");
        jonny.setId(1352);
        jonny.setAddress("Wilkinson AVE");
        jonny.display();

        billy.setFirstName("Billy");
        billy.setLastName("Smith");
        billy.setId(1353);
        billy.setAddress("Wilkinson AVE");
        billy.display();

    }
}
