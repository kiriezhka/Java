package com.company.homework4.task2;
import java.util.Scanner;
public class City {
    private String cityName;
    private String regionName;
    private String countryName;
    private int population;
    private String postalCode;
    private String phoneCode;

    // Конструктор класса
    public City(String cityName, String regionName, String countryName, int population, String postalCode, String phoneCode) {
        this.cityName = cityName;
        this.regionName = regionName;
        this.countryName = countryName;
        this.population = population;
        this.postalCode = postalCode;
        this.phoneCode = phoneCode;
    }

    // Метод для ввода данных о городе
    public void inputCityData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название города:");
        cityName = scanner.nextLine();

        System.out.println("Введите название региона:");
        regionName = scanner.nextLine();

        System.out.println("Введите название страны:");
        countryName = scanner.nextLine();

        System.out.println("Введите количество жителей в городе:");
        population = scanner.nextInt();
        scanner.nextLine(); // Поглощаем символ новой строки

        System.out.println("Введите почтовый индекс города:");
        postalCode = scanner.nextLine();

        System.out.println("Введите телефонный код города:");
        phoneCode = scanner.nextLine();
    }

    // Метод для вывода данных о городе
    public void displayCityData() {
        System.out.println("Название города: " + cityName);
        System.out.println("Название региона: " + regionName);
        System.out.println("Название страны: " + countryName);
        System.out.println("Количество жителей: " + population);
        System.out.println("Почтовый индекс: " + postalCode);
        System.out.println("Телефонный код: " + phoneCode);
    }

    // Геттеры и сеттеры для доступа к полям класса

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public static void main(String[] args) {
        // Пример использования класса
        City city = new City("", "", "", 0, "", "");
        city.inputCityData();
        System.out.println("Введенные данные о городе:");
        city.displayCityData();
    }
}
