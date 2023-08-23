package com.company.Month;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер месяца (от 1 до 12): ");
        int month = scanner.nextInt();

        if (month >= 1 && month <= 12) {
            if (month == 1 || month == 2 || month == 12) {
                System.out.println("Winter");
            } else if (month >= 3 && month <= 5) {
                System.out.println("Spring");
            } else if (month >= 6 && month <= 8) {
                System.out.println("Summer");
            } else {
                System.out.println("Autumn");
            }
        } else {
            System.out.println("Ошибка! Номер месяца должен быть от 1 до 12.");
        }
    }
}
