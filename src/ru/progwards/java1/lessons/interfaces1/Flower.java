package ru.progwards.java1.lessons.interfaces1;

public class Flower extends Animal{
    public Flower(String name) {
        super(name);
    }

    @Override
    public String kind() {
        return null;
    }

    @Override
    public String say() {
        return null;
    }

    @Override
    public FoodKind getFoodKind() {
        return null;
    }

    @Override
    public double getFoodCoeff() {
        return 0;
    }

    @Override
    public Color getColor() {
        Color white = Color.WHITE;
        white = Color.valueOf("WHITE");
        return white;
    }
}
