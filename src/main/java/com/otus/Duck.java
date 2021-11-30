package com.otus;

public class Duck extends Animal implements iFly{
    @Override
    public void say() {
        System.out.println("Я говорю Кря");
    }
    @Override
    public void fly() {
        System.out.println("Я лечу");
    }
}
