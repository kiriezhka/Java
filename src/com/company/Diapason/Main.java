package com.company.Diapason;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        int start, end;

        // Нормализация границ диапазона
        if (num1 <= num2) {
            start = num1;
            end = num2;
        } else {
            start = num2;
            end = num1;
        }

        System.out.println("Нечетные числа в диапазоне от " + start + " до " + end + ":");

        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
