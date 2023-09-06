package com.company.homework5.task6;
import java.util.Scanner;


public class Car {
    private String carName;
    private String manufacturer;
    private int productionYear;
    private double engineVolume;

    // Конструктор класса
    public Car(String carName, String manufacturer, int productionYear, double engineVolume) {
        this.carName = carName;
        this.manufacturer = manufacturer;
        this.productionYear = productionYear;
        this.engineVolume = engineVolume;
    }

    // Перегруженный конструктор для создания автомобиля с минимальными данными
    public Car(String carName, String manufacturer, int productionYear) {
        this(carName, manufacturer, productionYear, 0.0);
    }

    // Метод для ввода данных об автомобиле
    public void inputCarData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название автомобиля:");
        carName = scanner.nextLine();

        System.out.println("Введите название производителя:");
        manufacturer = scanner.nextLine();

        System.out.println("Введите год выпуска:");
        productionYear = scanner.nextInt();
        scanner.nextLine(); // Поглощаем символ новой строки

        System.out.println("Введите объем двигателя:");
        engineVolume = scanner.nextDouble();
    }

    // Метод для вывода данных об автомобиле
    public void displayCarData() {
        System.out.println("Название автомобиля: " + carName);
        System.out.println("Название производителя: " + manufacturer);
        System.out.println("Год выпуска: " + productionYear);
        System.out.println("Объем двигателя: " + engineVolume + " л");
    }

    // Перегруженный метод для вывода минимальных данных об автомобиле (без объема двигателя)
    public void displayCarDataMin() {
        System.out.println("Название автомобиля: " + carName);
        System.out.println("Название производителя: " + manufacturer);
        System.out.println("Год выпуска: " + productionYear);
    }

    // Геттеры и сеттеры для доступа к полям класса

    // (оставьте геттеры и сеттеры без изменений)

    public static void main(String[] args) {
        // Пример использования класса
        Car car = new Car("", "", 0, 0.0);
        car.inputCarData();
        System.out.println("Введенные данные об автомобиле:");
        car.displayCarData();

        Car minimalCar = new Car("Мой автомобиль", "Производитель", 2023);
        System.out.println("Минимальные данные об автомобиле:");
        minimalCar.displayCarDataMin();
    }
}
