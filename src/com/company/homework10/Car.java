package com.company.homework10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Car {
    private String name;
    private String color;
    private int maxSpeed;

    public Car(String name, String color, int maxSpeed) {
        this.name = name;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        // Генерируем 100 разных машин со случайными характеристиками
        Random random = new Random();
        String[] carNames = {"Car1", "Car2", "Car3", "Car4", "Car5"};
        String[] carColors = {"Red", "Blue", "Green", "Yellow", "Black"};

        for (int i = 0; i < 100; i++) {
            String name = carNames[random.nextInt(carNames.length)];
            String color = carColors[random.nextInt(carColors.length)];
            int maxSpeed = random.nextInt(200) + 50; // Случайная скорость от 50 до 250 км/ч

            cars.add(new Car(name, color, maxSpeed));
        }

        // Найти самую быструю красную машину
        Car fastestRedCar = cars.stream()
                .filter(car -> car.getColor().equalsIgnoreCase("Red"))
                .max((car1, car2) -> Integer.compare(car1.getMaxSpeed(), car2.getMaxSpeed()))
                .orElse(null);

        System.out.println("Самая быстрая красная машинa: " + fastestRedCar);
    }
}
