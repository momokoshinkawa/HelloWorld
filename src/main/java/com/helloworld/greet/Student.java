package com.helloworld.greet;

public class Student {

    private final String name;
    private final int age;
    private final String nationality;

    public Student(String name, int age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }
}
