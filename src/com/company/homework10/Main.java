package com.company.homework10;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Random random = new Random();
        String[] firstNames = {"John", "Jane", "Michael", "Emily", "David"};
        String[] lastNames = {"Smith", "Johnson", "Brown", "Davis", "Wilson"};

        for (int i = 0; i < 100; i++) {
            String fullName = firstNames[random.nextInt(firstNames.length)] + " " +
                    lastNames[random.nextInt(lastNames.length)];
            int age = random.nextInt(20) + 16;
            String group = "Group" + (i % 5 + 1);
            int points = random.nextInt(101); // случайный балл от 0 до 100

            students.add(new Student(fullName, age, group, points));
        }
    }
}
