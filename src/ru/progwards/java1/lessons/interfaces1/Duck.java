package ru.progwards.java1.lessons.interfaces1;


class Duck extends Animal {
    FoodKind corn = FoodKind.CORN;
    public Duck(String name) {
        super(name);
    }

    public Duck(String name, double weight) {
        super(name, weight);
    }

    public Duck() {}
    @Override
    public String kind(){
        return "утка";
    }
    public String say(){
        return "кря-кря";
    }

    @Override
    public FoodKind getFoodKind(){
        corn = FoodKind.valueOf("CORN");
        return corn;
    }

    @Override
    public double getFoodCoeff(){
        return 0.04;
    }

    public Color getColor() {
        return Color.GRAY;
    }
}