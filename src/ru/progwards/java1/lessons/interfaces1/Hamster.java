package ru.progwards.java1.lessons.interfaces1;



class Hamster extends Animal {
    FoodKind corn = FoodKind.CORN;
    Hamster(String name, double weight) {
        super(name, weight);
    }
    @Override
    public String kind(){
        return "хомяк";
    }
    public String say(){
        return "хрум-хрум-хрум";
    }

    @Override
    public FoodKind getFoodKind(){
        corn = FoodKind.valueOf("CORN");
        return corn;
    }

    @Override
    public double getFoodCoeff(){
        return 0.06;
    }

    public Color getColor() {
        return Color.BEIGE;
    }
}

