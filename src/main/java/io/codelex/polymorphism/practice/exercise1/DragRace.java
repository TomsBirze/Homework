package io.codelex.polymorphism.practice.exercise1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;


/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of an each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();

        Car toyota = new Toyota();
        Car zigulis = new Zigulis();
        Car lexus = new Lexus();
        Car tesla = new Tesla();
        Car audi = new Audi();
        Car bmw = new Bmw();

        cars.add(toyota);
        cars.add(zigulis);
        cars.add(lexus);
        cars.add(tesla);
        cars.add(audi);
        cars.add(bmw);

        for (int i = 0; i < 10; i++) {
            int iteration = i + 1;
            System.out.println("Iteration: " + iteration);
            Car fastestCar = cars.stream()
                    .flatMap(car -> applySpeedBoost(car, iteration))
                    .max(Comparator.comparing(Car::showCurrentSpeed))
                    .orElse(null);

            if (fastestCar != null) {
                System.out.println("Fastest car: " + fastestCar.getClass().getSimpleName() + " - Speed: " + fastestCar.showCurrentSpeed());
            }

            System.out.println();
        }
    }

    private static Stream<Car> applySpeedBoost(Car car, int iteration) {
        if (iteration == 3 && car instanceof Nitros) {
            Nitros nitrosCar = (Nitros) car;
            nitrosCar.useNitrousOxideEngine();
        }
        for (int i = 0; i < iteration; i++) {
            car.speedUp();
        }
        return Stream.of(car);
    }
}

