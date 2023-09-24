package com.company.homewotk8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        // Шаг a: Создать LinkedHashMap<Integer, String> (map1)
        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();

        // Шаг b: Добавить в map значения всех месяцев года
        map1.put(0, "Январь");
        map1.put(1, "Февраль");
        map1.put(2, "Март");
        map1.put(3, "Апрель");
        map1.put(4, "Май");
        map1.put(5, "Июнь");
        map1.put(6, "Июль");
        map1.put(7, "Август");
        map1.put(8, "Сентябрь");
        map1.put(9, "Октябрь");
        map1.put(10, "Ноябрь");
        map1.put(11, "Декабрь");

        // Шаг c: Вывести на экран первый и последний месяц года (0 и 11)
        System.out.println("Первый месяц: " + map1.get(0));
        System.out.println("Последний месяц: " + map1.get(11));

        // Шаг d: Вставить на место 6-го месяца слово ‘ОТПУСК’ и вывести на экран
        map1.put(6, "ОТПУСК");
        System.out.println("6-й месяц: " + map1.get(6));

        // Шаг e: Создать HashMap<Integer, String> (map2)
        HashMap<Integer, String> map2 = new HashMap<>();

        // Шаг f: Вставить в map2 все значения map1
        map2.putAll(map1);

        // Шаг g: Вывести на экран map1 и map2
        System.out.println("\nmap1:");
        printMap(map1);
        System.out.println("\nmap2:");
        printMap(map2);

        // Шаг h: Создать map3 (ключ – имя студента, значение -контакты студента)
        HashMap<String, Set<String>> map3 = new HashMap<>();
    }

    // Метод для вывода всех элементов map в консоль (EntrySet<Integer, String>)
    private static void printMap(HashMap<Integer, String> map) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
