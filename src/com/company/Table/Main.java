package com.company.Table;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начало диапазона: ");
        int start = scanner.nextInt();

        System.out.print("Введите конец диапазона: ");
        int end = scanner.nextInt();

        // Проверка, что начало диапазона меньше или равно концу
        if (start > end) {
            System.out.println("Ошибка! Начало диапазона больше конца.");
            return;
        }

        for (int i = start; i <= end; i++) {
            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                System.out.print(i + " * " + j + " = " + result);

                if (j < 10) {
                    System.out.print("   "); // Добавляем пробелы для форматирования
                } else {
                    System.out.println(); // Переход на новую строку после каждой десятки
                }
            }
        }
    }
}
