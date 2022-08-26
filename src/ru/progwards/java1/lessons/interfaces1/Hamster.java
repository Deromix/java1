package ru.progwards.java1.lessons.interfaces1;



class Hamster extends Animal {
    FoodKind corn = FoodKind.CORN;
    Hamster(String name) {
        super(name);
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

    Color beige = Color.BEIGE;
    public Color getColor(){
        beige = Color.valueOf("BEIGE");
        return beige;
    }
}

