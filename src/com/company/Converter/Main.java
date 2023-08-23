package com.company.Converter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество метров: ");
        double meters = scanner.nextDouble();

        System.out.println("Выберите единицу измерения для перевода:");
        System.out.println("1. Мили");
        System.out.println("2. Дюймы");
        System.out.println("3. Ярды");
        int choice = scanner.nextInt();

        double result;

        switch (choice) {
            case 1:
                // Перевод в мили (1 метр = 0.000621371 мили)
                result = meters * 0.000621371;
                System.out.println("Результат: " + result + " миль");
                break;
            case 2:
                // Перевод в дюймы (1 метр = 39.3701 дюймов)
                result = meters * 39.3701;
                System.out.println("Результат: " + result + " дюймов");
                break;
            case 3:
                // Перевод в ярды (1 метр = 1.09361 ярдов)
                result = meters * 1.09361;
                System.out.println("Результат: " + result + " ярдов");
                break;
            default:
                System.out.println("Ошибка! Выбрана недопустимая опция.");
        }
    }
}
