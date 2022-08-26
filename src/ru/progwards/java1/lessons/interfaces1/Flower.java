package ru.progwards.java1.lessons.interfaces1;

public class Flower implements IColor{
    Color white = Color.WHITE;
    @Override
    public Animal.Color getColor() {
        white = Color.valueOf("WHITE");
        return white;
    }
}
