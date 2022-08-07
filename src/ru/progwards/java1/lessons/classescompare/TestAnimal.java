package ru.progwards.java1.lessons.classescompare;

public class TestAnimal {
    public static void printAnimal(Animal animal){
        System.out.println(animal.toString() + " - " + animal.say() + "!" );
    }

    public static void main(String[] args) {
        Cow cow1 = new Cow("Рыжая");
        printAnimal(cow1);
        Cow cow2 = new Cow("Рыжая");
        printAnimal(cow2);
        Duck duck1 = new Duck("Маша");
        printAnimal(duck1);
        Duck duck2 = new Duck("Маша");
        printAnimal(duck2);
        Hamster hum1 = new Hamster("Акакий");
        printAnimal(hum1);
        Hamster hum2 = new Hamster("Поликарп");
        printAnimal(hum2);
        hum1.setWeight(100);
        hum2.setWeight(100);
        System.out.println(hum1.compareTo(hum2));
        System.out.println(hum1.equals(hum2));
        System.out.println(hum1.getFoodKind());
        System.out.println(hum1.getFoodCoeff());
        System.out.println(hum1.calculateFoodWeight());
        System.out.println(hum1.calculateFoodPrice());
        System.out.println();
        cow1.setWeight(100);
        cow2.setWeight(100);
        System.out.println(cow1.compareTo(cow2));
        System.out.println(cow1.equals(cow2));
        System.out.println(cow1.getFoodKind());
        System.out.println(cow1.getFoodCoeff());
        System.out.println(cow1.calculateFoodWeight());
        System.out.println(cow1.calculateFoodPrice());

    }
}
