package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    private final List<Car> cars;

    public CarService() {
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }

    public List<Car> getAllCars() {
        return cars;
    }

    public List<Car> getCarsWithV12Engine() {
        return cars.stream()
                .filter(car -> car.getEngine() == Car.Engine.V12)
                .collect(Collectors.toList());
    }

    public List<Car> getCarsProducedBefore(int year) {
        return cars.stream()
                .filter(car -> car.getYearOfManufacture().getYear() < year)
                .collect(Collectors.toList());
    }

    public Car getMostExpensiveCar() {
        return cars.stream()
                .max(Comparator.comparingInt(Car::getPrice))
                .orElse(null);
    }

    public Car getCheapestCar() {
        return cars.stream()
                .min(Comparator.comparingInt(Car::getPrice))
                .orElse(null);
    }

    public List<Car> getCarsWithMultipleManufacturers(int manufacturerCount) {
        return cars.stream()
                .filter(car -> car.getManufacturer().size() >= manufacturerCount)
                .collect(Collectors.toList());
    }

    public List<Car> getSortedCars(boolean ascending) {
        Comparator<Car> priceComparator = Comparator.comparingInt(Car::getPrice);
        if (!ascending) {
            priceComparator = priceComparator.reversed();
        }
        return cars.stream()
                .sorted(priceComparator)
                .collect(Collectors.toList());
    }

    public boolean isCarInList(Car car) {
        return cars.contains(car);
    }

    public List<Car> getCarsByManufacturer(String manufacturer) {
        return cars.stream()
                .filter(car -> car.getManufacturer().contains(manufacturer))
                .collect(Collectors.toList());
    }

    public List<Car> getCarsByManufacturerAndYearComparison(String manufacturer, String comparison, int year) {
        return switch (comparison) {
            case "<" -> cars.stream()
                    .filter(car -> car.getManufacturer().contains(manufacturer)
                            && car.getYearOfManufacture().getYear() < year)
                    .collect(Collectors.toList());
            case ">" -> cars.stream()
                    .filter(car -> car.getManufacturer().contains(manufacturer)
                            && car.getYearOfManufacture().getYear() > year)
                    .collect(Collectors.toList());
            case "<=" -> cars.stream()
                    .filter(car -> car.getManufacturer().contains(manufacturer)
                            && car.getYearOfManufacture().getYear() <= year)
                    .collect(Collectors.toList());
            case ">=" -> cars.stream()
                    .filter(car -> car.getManufacturer().contains(manufacturer)
                            && car.getYearOfManufacture().getYear() >= year)
                    .collect(Collectors.toList());
            case "=" -> cars.stream()
                    .filter(car -> car.getManufacturer().contains(manufacturer)
                            && car.getYearOfManufacture().getYear() == year)
                    .collect(Collectors.toList());
            case "!=" -> cars.stream()
                    .filter(car -> car.getManufacturer().contains(manufacturer)
                            && car.getYearOfManufacture().getYear() != year)
                    .collect(Collectors.toList());
            default -> new ArrayList<>();
        };


    }
}