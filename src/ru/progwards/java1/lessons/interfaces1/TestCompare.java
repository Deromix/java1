package ru.progwards.java1.lessons.interfaces1;

import java.util.Arrays;

public class TestCompare {
    public static void main(String[] args) {
        Animal [] animal = new Animal[6];
        Cow cow1 = new Cow("Пеструшка", 350);
        Cow cow2 = new Cow("Рыжая" , 250);
        Duck duck1 = new Duck("Даша", 3);
        Duck duck2 = new Duck("Маша", 3.5);
        Hamster ham1 = new Hamster("Акакий" , 0.25);
        Hamster ham2 = new Hamster("Поликарп" , 0.32);
        animal[0] = cow1;
        animal[1] = cow2;
        animal[2] = duck1;
        animal[3] = duck2;
        animal[4] = ham1;
        animal[5] = ham2;
        Arrays.sort(animal);
        System.out.println(Arrays.toString(animal));
    }
}
