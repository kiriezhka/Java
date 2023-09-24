package com.company.homewotk8;

import java.util.HashSet;

public class UserHashSetExample {
    public static void main(String[] args) {
        // Шаг b: Создать userSet (HashSet<User>)
        HashSet<User> userSet = new HashSet<>();

        // Шаг c: Создать 2 экземпляра класса User с одинаковыми полями и 1 экземпляр отличающийся возрастом
        User user1 = new User("Alice", 25, "123-456-789");
        User user2 = new User("Bob", 30, "987-654-321");
        User user3 = new User("Alice", 28, "555-555-555"); // Этот пользователь имеет то же имя, что и user1

        // Шаг d: Добавить пользователей в userSet.
        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);

        // Шаг e: Вывести пользователей на экран
        System.out.println("Пользователи в userSet:");
        for (User user : userSet) {
            System.out.println(user);
        }
    }
}
