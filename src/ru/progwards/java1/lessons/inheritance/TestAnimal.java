package ru.progwards.java1.lessons.inheritance;

public class TestAnimal {
    public static void printAnimal(Animal animal){
        System.out.println(animal.toString() + " - " + animal.say() + "!" );
    }

    public static void main(String[] args) {
        Cow cow1 = new Cow("Пеструшка");
        printAnimal(cow1);
        Cow cow2 = new Cow("Рыжая");
        printAnimal(cow2);
        Duck duck1 = new Duck("Даша");
        printAnimal(duck1);
        Duck duck2 = new Duck("Маша");
        printAnimal(duck2);
        Hamster hum1 = new Hamster("Акакий");
        printAnimal(hum1);
        Hamster hum2 = new Hamster("Поликарп");
        printAnimal(hum2);
    }
}
