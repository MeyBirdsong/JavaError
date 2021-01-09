package com.company;

public class Person {
    String name;
    int age;
    int height;
    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    // We will cover every thing below next week......
    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", age=" + age +
                        ", height=" + height;
    }
    public Person() {
    }
    public String getName() {
        return name;
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
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
}