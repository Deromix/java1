package ru.progwards.java1.lessons.interfaces2;




class Cow extends Animal {
    FoodKind hay = FoodKind.HAY;
    public Cow(String name , double weight) {
        super(name,weight);
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


    public Color getColor() {
        return Color.RED;
    }

    public String getHome(){
        return "ферма" ;
    }
}