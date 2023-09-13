package com.company.homework6;

import java.util.ArrayList;

import static com.company.homework6.SchoolClass.CLASS_11;

public class Student extends Person {
    private SchoolClass schoolClass;
    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }
    public Student(){

    }

    @Override
    public String toString() {
        return "Student{" +
                "schoolClass=" + schoolClass +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public ArrayList<Student> configStudents(){
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Alex", 16, CLASS_11));
        students.add(new Student("Mariya", 16, CLASS_11));
        students.add(new Student("Christina", 16, CLASS_11));
        return students;
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public Student(String name, int age, SchoolClass schoolClass) {
        super(name, age);
        this.schoolClass = schoolClass;
    }
}
