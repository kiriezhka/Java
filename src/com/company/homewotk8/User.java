package com.company.homewotk8;

public class User {
    private String name;
    private int age;
    private String phone;

    public User(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    // Шаг f: Переопределить в классе User метод hashCode, указав в нем только обработку поля name.
    @Override
    public int hashCode() {
        return name.hashCode();
    }

    // Шаг g: Переопределить в классе User метод equals для сравнения пользователей по всем полям.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        User otherUser = (User) obj;
        return name.equals(otherUser.name) && age == otherUser.age && phone.equals(otherUser.phone);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}
