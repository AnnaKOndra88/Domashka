package com.otus;

public class Animal {
    protected String name;
    protected int age;
    protected int weight;
    protected String color;
    protected String old;

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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOld() {
        return old;
    }

    public void setOld(String old) {
        this.old = old;
    }

    public void say(){
        System.out.println("Я говорю");
    }
    public void go(){
        System.out.println("Я иду");
    }

    public void drink(){
        System.out.println("Я пью");
    }
    public void eat(){
        System.out.println("Я ем");
    }

    @Override
    public String toString() {
        if(age == 1)
            old = "год";
        else if (age >= 2 & age <=4)
            old = "года";
        else if (age >= 5 & age <= 20)
            old = "лет";
        else
            old = "Вы с какой планеты? Столько не живут!";
        return "Привет! меня зовут " + name + ", мне " + age+old + ", я вешу - " +weight+ "кг, мой цвет - " +color;

    }
}

