package ru.progwards.java1.lessons.classescompare;

class Cow extends Animal{
    FoodKind hay = FoodKind.HAY;
    public Cow(String name) {
        super(name);
    }
    @Override
    public String kind(){
        return "корова";
    }
    public String say(){
        return "мууууууу";
    }

    @Override
    public FoodKind getFoodKind(){
        hay = FoodKind.valueOf("HAY");
        return hay;
    }

    @Override
    public double getFoodCoeff(){
        return 0.05;
    }
}