package com.otus;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainClass {
        public static void main(String[] args){
            System.out.println("Выбери значение из меню:");
            System.out.println("1 Добавить животное");
            System.out.println("2 Показать список животных");
            System.out.println("3 Выход из программы");

            List<Animal> animals = new ArrayList<>();

            Scanner scanner = new Scanner(System.in);
            int menu = scanner.nextInt();

            while (!(menu == 3)) {

                switch (menu){
                    case 1:
                        System.out.println("Добавляем животное:");
                        System.out.println("Выбери животное: сat/dog/duck");
                        String animalAnimal = scanner.next().trim().toLowerCase();

                        Animal userAnimal;

                        if (animalAnimal.equals("cat")){
                            userAnimal = new Cat();
                            System.out.println("Задайте имя");
                            String name = scanner.next().trim().toLowerCase();
                            System.out.println("Задайте цвет");
                            String color = scanner.next().trim().toLowerCase();
                            System.out.println("Задайте возраст");
                            int age = scanner.nextInt();
                            System.out.println("Задайте вес");
                            int weight = scanner.nextInt();
                            userAnimal.setName(name);
                            userAnimal.setColor(color);
                            userAnimal.setAge(age);
                            userAnimal.setWeight(weight);
                            animals.add(userAnimal);

                            System.out.println(userAnimal);

                        }else if (animalAnimal.equals("dog")) {
                            userAnimal = new Dog();
                            System.out.println("Задайте имя");
                            String name = scanner.next().trim().toLowerCase();
                            System.out.println("Задайте цвет");
                            String color = scanner.next().trim().toLowerCase();
                            System.out.println("Задайте возраст");
                            int age = scanner.nextInt();
                            System.out.println("Задайте вес");
                            int weight = scanner.nextInt();
                            userAnimal.setName(name);
                            userAnimal.setColor(color);
                            userAnimal.setAge(age);
                            userAnimal.setWeight(weight);
                            animals.add(userAnimal);

                        }else if (animalAnimal.equals("duck")) {
                            userAnimal = new Duck();
                            System.out.println("Задайте имя");
                            String name = scanner.next().trim().toLowerCase();
                            System.out.println("Задайте цвет");
                            String color = scanner.next().trim().toLowerCase();
                            System.out.println("Задайте возраст");
                            int age = scanner.nextInt();
                            System.out.println("Задайте вес");
                            int weight = scanner.nextInt();
                            userAnimal.setName(name);
                            userAnimal.setColor(color);
                            userAnimal.setAge(age);
                            userAnimal.setWeight(weight);
                            animals.add(userAnimal);

                        }
                        break;
                    case 2:
                        System.out.println("Список ваших животных");
                        for (int i=0; i<animals.size(); i++){
                            animals.get(i).say();
                            animals.get(i).whoIam();

                            System.out.println(animals.get(i));

                        }
                        break;
                    case 3:
                        System.out.println("Exit");
                        break;

                }
                System.out.println("Новый выбор");
                menu = scanner.nextInt();
            }

    }
}
