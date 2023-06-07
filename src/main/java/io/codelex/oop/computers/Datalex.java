package io.codelex.oop.computers;

public class Datalex {
    public static void main(String[] args) {

        //Exercise7

        Computer firstPC = new Computer("Intel(R) Core(TM)", "32GB", "RTX3090", "TOSHIBA", "OldGen");
        Computer secondPC = new Computer("Asus", "16GB", "RTX2090", "TOSHIBA", "NewGen");
        Computer thirdPC = new Computer("Linux", "8GB", "RTX3000", "TOSHIBA", "Fogy");


        if (firstPC.company.equals(secondPC.company)) {
            System.out.println("There from the same mother ship!");
        } else {
            System.out.println("Look somewhere else!");
        }

        if (secondPC.ram.equals(thirdPC.ram)) {
            System.out.println("There from the same mother ship!");
        } else {
            System.out.println("Look somewhere else!");
        }

        System.out.println(firstPC.toString());
        System.out.println(secondPC.toString());
        System.out.println(thirdPC.toString());

        //Exercise8

        Computer firstLaptop = new Laptop("Asus", "32GB", "RTX1090", "TOSHIBA", "NewGen", "POWA 2000");
        Computer secondLaptop = new Laptop("Linux", "16GB", "RTX5000", "TOSHIBA", "OldGen", "POWA 4000");


        System.out.println(firstLaptop.getGraphicsCard());
        System.out.println(secondLaptop.getModel());
        System.out.println(firstLaptop.getProcessor());

        System.out.println(firstLaptop.toString());
        System.out.println(secondLaptop.toString());
    }
}
