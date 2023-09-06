package com.company.homework4.task1;
import java.util.Scanner;
public class Person {
    private String fullName;
    private String dateOfBirth;
    private String phoneNumber;
    private String city;
    private String country;
    private String homeAddress;

    // Конструктор класса
    public Person(String fullName, String dateOfBirth, String phoneNumber, String city, String country, String homeAddress) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.country = country;
        this.homeAddress = homeAddress;
    }

    // Метод для ввода данных о человеке
    public void inputPersonData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ФИО:");
        fullName = scanner.nextLine();

        System.out.println("Введите дату рождения:");
        dateOfBirth = scanner.nextLine();

        System.out.println("Введите контактный телефон:");
        phoneNumber = scanner.nextLine();

        System.out.println("Введите город:");
        city = scanner.nextLine();

        System.out.println("Введите страну:");
        country = scanner.nextLine();

        System.out.println("Введите домашний адрес:");
        homeAddress = scanner.nextLine();
    }

    // Метод для вывода данных о человеке
    public void displayPersonData() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Дата рождения: " + dateOfBirth);
        System.out.println("Контактный телефон: " + phoneNumber);
        System.out.println("Город: " + city);
        System.out.println("Страна: " + country);
        System.out.println("Домашний адрес: " + homeAddress);
    }

    // Перегруженный метод для ввода данных о человеке с указанием ФИО и контактного телефона
    public void inputPersonData(String fullName, String phoneNumber) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
    }

    // Перегруженный метод для вывода данных о человеке без адреса
    public void displayPersonDataWithoutAddress() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Дата рождения: " + dateOfBirth);
        System.out.println("Контактный телефон: " + phoneNumber);
        System.out.println("Город: " + city);
        System.out.println("Страна: " + country);
    }

    // Геттеры и сеттеры для доступа к полям класса

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public static void main(String[] args) {
        // Пример использования класса
        Person person = new Person("", "", "", "", "", "");
        person.inputPersonData();
        System.out.println("Введенные данные о человеке:");
        person.displayPersonData();

        Person person2 = new Person("", "", "", "", "", "");
        person2.inputPersonData("Иванов Иван Иванович", "+1234567890");
        System.out.println("Введенные данные о человеке (перегруженный метод):");
        person2.displayPersonData();

        System.out.println("Введенные данные о человеке без адреса:");
        person.displayPersonDataWithoutAddress();
    }

}
