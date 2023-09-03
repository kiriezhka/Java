package com.company.homework4.task4;
import java.util.Scanner;
public class Fraction {
    private int numerator;   // Числитель
    private int denominator; // Знаменатель

    // Конструктор класса
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // Метод для ввода данных о дроби
    public void inputFractionData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите числитель:");
        numerator = scanner.nextInt();

        System.out.println("Введите знаменатель (не равный нулю):");
        denominator = scanner.nextInt();

        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю.");
        }
    }

    // Метод для вывода данных о дроби
    public void displayFractionData() {
        System.out.println("Дробь: " + numerator + "/" + denominator);
    }

    // Методы для арифметических операций

    // Сложение дробей
    public Fraction add(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Вычитание дробей
    public Fraction subtract(Fraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Умножение дробей
    public Fraction multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // Деление дробей
    public Fraction divide(Fraction other) {
        if (other.numerator == 0) {
            throw new IllegalArgumentException("Деление на ноль недопустимо.");
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Fraction(newNumerator, newDenominator);
    }

    public static void main(String[] args) {
        // Пример использования класса
        Fraction fraction1 = new Fraction(1, 2);
        Fraction fraction2 = new Fraction(3, 4);

        System.out.println("Дробь 1:");
        fraction1.displayFractionData();

        System.out.println("Дробь 2:");
        fraction2.displayFractionData();

        Fraction sum = fraction1.add(fraction2);
        System.out.println("Сумма дробей:");
        sum.displayFractionData();

        Fraction difference = fraction1.subtract(fraction2);
        System.out.println("Разность дробей:");
        difference.displayFractionData();

        Fraction product = fraction1.multiply(fraction2);
        System.out.println("Произведение дробей:");
        product.displayFractionData();

        try {
            Fraction quotient = fraction1.divide(fraction2);
            System.out.println("Частное дробей:");
            quotient.displayFractionData();
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
