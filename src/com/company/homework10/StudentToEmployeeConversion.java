package com.company.homework10;
import java.util.List;
import java.util.stream.Collectors;

public class StudentToEmployeeConversion {
    public static class Student {
        private String fullName;
        private int age;

        public Student(String fullName, int age) {
            this.fullName = fullName;
            this.age = age;
        }

        public String getFullName() {
            return fullName;
        }

        public int getAge() {
            return age;
        }
    }

    public static class Employee {
        private String name;
        private String surname;
        private String patronymic;
        private int age;

        public Employee(String name, String surname, String patronymic, int age) {
            this.name = name;
            this.surname = surname;
            this.patronymic = patronymic;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        public String getPatronymic() {
            return patronymic;
        }

        public int getAge() {
            return age;
        }
    }

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("John Smith", 20),
                new Student("Jane Johnson", 21),
                new Student("Michael Brown", 22)
                // Добавьте других студентов
        );

        List<Employee> employees = students.stream()
                .map(student -> {
                    String[] parts = student.getFullName().split(" ");
                    String name = parts.length > 0 ? parts[0] : "";
                    String surname = parts.length > 1 ? parts[1] : "";
                    String patronymic = parts.length > 2 ? parts[2] : "";

                    return new Employee(name, surname, patronymic, student.getAge());
                })
                .collect(Collectors.toList());

        employees.forEach(employee -> {
            System.out.println("Name: " + employee.getName());
            System.out.println("Surname: " + employee.getSurname());
            System.out.println("Patronymic: " + employee.getPatronymic());
            System.out.println("Age: " + employee.getAge());
            System.out.println();
        });
    }
}
