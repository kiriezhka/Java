package com.company.fourArrays;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Задайте размер массива
        int size = 10;
        int[] originalArray = new int[size];

        // Заполните исходный массив случайными числами
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            originalArray[i] = random.nextInt(201) - 100; // Генерируем числа от -100 до 100
        }

        // Создайте массивы для четных, нечетных, отрицательных и положительных чисел
        int[] evenArray = new int[size];
        int[] oddArray = new int[size];
        int[] negativeArray = new int[size];
        int[] positiveArray = new int[size];

        int evenCount = 0;
        int oddCount = 0;
        int negativeCount = 0;
        int positiveCount = 0;

        // Пройдитесь по исходному массиву и разделите элементы
        for (int i = 0; i < size; i++) {
            int num = originalArray[i];

            if (num % 2 == 0) { // Четное число
                evenArray[evenCount] = num;
                evenCount++;
            } else { // Нечетное число
                oddArray[oddCount] = num;
                oddCount++;
            }

            if (num < 0) { // Отрицательное число
                negativeArray[negativeCount] = num;
                negativeCount++;
            } else if (num > 0) { // Положительное число
                positiveArray[positiveCount] = num;
                positiveCount++;
            }
        }

        // Созданные массивы могут содержать нулевые элементы, поэтому можно создать новые массивы, если нужны чистые списки.

        int[] evenNumbers = new int[evenCount];
        int[] oddNumbers = new int[oddCount];
        int[] negativeNumbers = new int[negativeCount];
        int[] positiveNumbers = new int[positiveCount];

        // Копируем только реально использованные элементы из временных массивов в новые массивы.
        System.arraycopy(evenArray, 0, evenNumbers, 0, evenCount);
        System.arraycopy(oddArray, 0, oddNumbers, 0, oddCount);
        System.arraycopy(negativeArray, 0, negativeNumbers, 0, negativeCount);
        System.arraycopy(positiveArray, 0, positiveNumbers, 0, positiveCount);

        // Выводим результаты на экран
        System.out.println("Исходный массив: " + Arrays.toString(originalArray));
        System.out.println("Четные числа: " + Arrays.toString(evenNumbers));
        System.out.println("Нечетные числа: " + Arrays.toString(oddNumbers));
        System.out.println("Отрицательные числа: " + Arrays.toString(negativeNumbers));
        System.out.println("Положительные числа: " + Arrays.toString(positiveNumbers));
    }
}
