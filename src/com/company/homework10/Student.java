package com.company.homework10;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Student {
    private String fullName;
    private int age;
    private String group;
    private int points;


    public Student(String fullName, int age, String group, int points) {
        this.fullName = fullName;
        this.age = age;
        this.group = group;
        this.points = points;
    }
    public int getPoints() {
        return points;
    }
    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getGroup() {
        return group;
    }

    // Извлечение фамилии из полного имени
    public String getLastName() {
        String[] parts = fullName.split(" ");
        if (parts.length > 0) {
            return parts[0]; // Первая часть имени считается фамилией
        } else {
            return fullName; // Если нет пробелов, считаем всю строку фамилией
        }
    }


}

