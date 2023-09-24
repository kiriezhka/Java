package com.company.homewotk8;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        // Шаг a: Создать ArrayList<String> (list1)
        ArrayList<String> list1 = new ArrayList<>();

        // Шаг b: Создать массив строк и добавить его элементы в list1
        String[] array = {"apple", "banana", "cherry", "date"};
        list1.addAll(Arrays.asList(array));

        // Шаг c: Создать новый (list2) ArrayList<String>, проинициализировав его предыдущим списком
        ArrayList<String> list2 = new ArrayList<>(list1);

        // Шаг d: Создать список (list3) используя Arrays.asList(…)
        List<String> list3 = Arrays.asList("grape", "fig", "kiwi");

        // Шаг e: Вставить list3 в середину list2
        int middleIndex = list2.size() / 2;
        list2.addAll(middleIndex, list3);

        // Шаг f: Отсортировать список по убыванию
        Collections.sort(list2, Collections.reverseOrder());

        // Шаг g: Удалить каждый второй элемент списка используя ListIterator
        ListIterator<String> listIterator = list2.listIterator();
        boolean removeNext = false;

        while (listIterator.hasNext()) {
            listIterator.next();
            if (removeNext) {
                listIterator.remove();
            }
            removeNext = !removeNext;
        }

        // Вывести итоговый список list2
        System.out.println("Итоговый список list2:");
        for (String element : list2) {
            System.out.println(element);
        }
    }
}
