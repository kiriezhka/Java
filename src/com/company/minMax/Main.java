package com.company.minMax;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Задайте размер массива
        int size = 10;
        int[] arr = new int[size];

        // Заполните массив случайными числами
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(201) - 100; // Генерируем числа от -100 до 100
        }

        // Найдем минимальный и максимальный элементы
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Посчитаем количество отрицательных, положительных и нулевых элементов
        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] < 0) {
                negativeCount++;
            } else if (arr[i] > 0) {
                positiveCount++;
            } else {
                zeroCount++;
            }
        }

        // Выведем результаты на экран
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Количество отрицательных элементов: " + negativeCount);
        System.out.println("Количество положительных элементов: " + positiveCount);
        System.out.println("Количество нулей: " + zeroCount);
    }
}
