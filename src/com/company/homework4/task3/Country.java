package com.company.homework4.task3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Country {
    private String countryName;
    private String continentName;
    private int population;
    private String phoneCode;
    private String capital;
    private List<String> cities;

    // Конструктор класса
    public Country(String countryName, String continentName, int population, String phoneCode, String capital) {
        this.countryName = countryName;
        this.continentName = continentName;
        this.population = population;
        this.phoneCode = phoneCode;
        this.capital = capital;
        this.cities = new ArrayList<>();
    }

    // Метод для ввода данных о стране
    public void inputCountryData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название страны:");
        countryName = scanner.nextLine();

        System.out.println("Введите название континента:");
        continentName = scanner.nextLine();

        System.out.println("Введите количество жителей в стране:");
        population = scanner.nextInt();
        scanner.nextLine(); // Поглощаем символ новой строки

        System.out.println("Введите телефонный код страны:");
        phoneCode = scanner.nextLine();

        System.out.println("Введите название столицы:");
        capital = scanner.nextLine();

        System.out.println("Введите названия городов страны (введите 'end' для завершения ввода):");
        String city;
        while (true) {
            city = scanner.nextLine();
            if (city.equalsIgnoreCase("end")) {
                break;
            }
            cities.add(city);
        }
    }

    // Метод для вывода данных о стране
    public void displayCountryData() {
        System.out.println("Название страны: " + countryName);
        System.out.println("Название континента: " + continentName);
        System.out.println("Количество жителей: " + population);
        System.out.println("Телефонный код: " + phoneCode);
        System.out.println("Столица: " + capital);
        System.out.println("Города страны:");
        for (String city : cities) {
            System.out.println("- " + city);
        }
    }

    // Геттеры и сеттеры для доступа к полям класса

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getContinentName() {
        return continentName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    public static void main(String[] args) {
        // Пример использования класса
        Country country = new Country("", "", 0, "", "");
        country.inputCountryData();
        System.out.println("Введенные данные о стране:");
        country.displayCountryData();
    }
}
