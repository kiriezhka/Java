package com.company.secondTask;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double value;
        double percent;

        // Проверка ввода первого числа
        while (true) {
            System.out.print("Введите значение: ");
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                break; // Выход из цикла, если введено число
            } else {
                System.out.println("Ошибка! Введите корректное число.");
                scanner.next(); // Очистка буфера ввода
            }
        }

        // Проверка ввода второго числа (процента)
        while (true) {
            System.out.print("Введите процент: ");
            if (scanner.hasNextDouble()) {
                percent = scanner.nextDouble();
                break; // Выход из цикла, если введено число
            } else {
                System.out.println("Ошибка! Введите корректное число.");
                scanner.next(); // Очистка буфера ввода
            }
        }

        double result = (percent / 100) * value;

        System.out.println(percent + "% от " + value + " = " + result);
    }
}
