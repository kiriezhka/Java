package com.company.sorter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArraySorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запросить у пользователя длину массива
        int length = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Введите длину массива: ");
                length = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: Введите целое число для длины массива.");
                scanner.nextLine(); // Очистить буфер ввода
            }
        }

        // Создать массив
        int[] array = new int[length];

        // Заполнить массив значениями
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < length; i++) {
            boolean validElement = false;
            while (!validElement) {
                try {
                    array[i] = scanner.nextInt();
                    validElement = true;
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка: Введите целое число для элемента массива.");
                    scanner.nextLine(); // Очистить буфер ввода
                }
            }
        }

        // Запросить пользователя о направлении сортировки
        System.out.print("Выберите направление сортировки (возрастание/убывание): ");
        String direction = scanner.next().toLowerCase();

        // Вызвать метод сортировки
        if (direction.equals("возрастание")) {
            sortAscending(array);
        } else if (direction.equals("убывание")) {
            sortDescending(array);
        } else {
            System.out.println("Неверное направление сортировки. Используйте 'возрастание' или 'убывание'.");
        }

        // Вывести отсортированный массив
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }

    public static void sortAscending(int[] arr) {
        Arrays.sort(arr);
    }

    public static void sortDescending(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}
