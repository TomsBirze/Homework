package io.codelex.oop.cars;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CarApp {
    public static void main(String[] args) {
        List<String> manufacturer = new ArrayList<>();
        manufacturer.add("Honda");
        manufacturer.add("Chevy");
        manufacturer.add("Audi");
        manufacturer.add("Benz");

//        Car firstCar = new Car("Rover", "CX500", 21000, LocalDate.of(1990, 4, 10), manufacturer.get(0), Car.Engine.V6);
//        System.out.println(firstCar.getName() + " costs: " + firstCar.getPrice());
//        System.out.println(firstCar.toString());


        CarService carService = new CarService();

        carService.addCar(new Car("Rover", "CX500", 21000, LocalDate.of(1990, 4, 10), "Honda", Car.Engine.V6));
        carService.addCar(new Car("Benz", "TR500", 23000, LocalDate.of(1995, 3, 4), "Benz", Car.Engine.V12));
        carService.addCar(new Car("Groove", "GD500", 22000, LocalDate.of(1998, 2, 3), "Honda", Car.Engine.V8));
        carService.addCar(new Car("Duke", "AD500", 24000, LocalDate.of(1980, 1, 2), "Audi", Car.Engine.V12));
        carService.addCar(new Car("Chevy", "CD500", 25000, LocalDate.of(2000, 6, 1), "Chevy", Car.Engine.V12));

        List<Car> filteredCars = carService.getCarsByManufacturerAndYearComparison("Honda", ">", 1950);
        for (Car car : filteredCars) {
            System.out.println(car.getName() + " " + car.getModel());
        }

        List<Car> carsByManufac = carService.getCarsByManufacturer("Audi");
        for (Car car : carsByManufac) {
            System.out.println("Cars by manufacturer 'Audi': " + car.toString());
        }


        List<Car> sortedCars = carService.getSortedCars(true);
        for (Car car : sortedCars) {
            System.out.println(car.getName() + " " + car.getModel() + " " + car.getPrice());

        }

        System.out.println("Cheapest car is: " + carService.getCheapestCar());
        System.out.println("Most expensive car is: " + carService.getMostExpensiveCar());
    }

}

