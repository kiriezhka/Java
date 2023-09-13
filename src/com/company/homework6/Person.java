package com.company.homework6;

import java.util.ArrayList;

public class Person implements Named{
    protected String name;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(){

    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public ArrayList<Person> config(){
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Andrey", 22));
        persons.add(new Person("Alexandr", 25));
        persons.add(new Person("Kristina", 23));
        return persons;
    }
    @Override
    public String getName() {
        return name;
    }
}
