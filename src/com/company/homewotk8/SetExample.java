package com.company.homewotk8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class SetExample {
    public static void main(String[] args) {
        // Шаг a: Создать HashSet<String> (set1)
        HashSet<String> set1 = new HashSet<>();

        // Шаг b: Вставить в set 2 произвольные строки
        set1.add("apple");
        set1.add("banana");

        // Шаг c: Вставить в set все элементы из list1 и list2
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("cherry");
        list1.add("date");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("apple");
        list2.add("banana");
        list2.add("grape");
        list2.add("fig");

        set1.addAll(list1);
        set1.addAll(list2);

        // Шаг d: Вывести на экран значения set-a
        System.out.println("Значения set1:");
        for (String element : set1) {
            System.out.println(element);
        }

        // Шаг e: Создать LinkedHashSet<String> (set2)
        LinkedHashSet<String> set2 = new LinkedHashSet<>();

        // Шаг f: Вставить в set все элементы из list2 и list3
        List<String> list3 = new ArrayList<>();
        list3.add("kiwi");

        set2.addAll(list2);
        set2.addAll(list3);

        // Шаг g: Вывести на экран значения set-a
        System.out.println("\nЗначения set2:");
        for (String element : set2) {
            System.out.println(element);
        }
    }
}
