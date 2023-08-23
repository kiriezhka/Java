package com.company.thirdTask;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Введите цифру " + i + ": ");

            // Проверка на ввод числа
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка! Введите корректную цифру.");
                scanner.next(); // Очистка буфера ввода
            }

            int digit = scanner.nextInt();
            number = number * 10 + digit;
        }

        System.out.println("Сформированное число: " + number);
    }
}
