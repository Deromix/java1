package ru.progwards.java1.lessons.classescompare;

public abstract class Animal {
    String name;
    double weight;
    public Animal(String name){
        this.name = name;

    }
    public abstract String kind();
    public abstract String say();
    @Override
    public String toString(){
        return "Это " + kind() + " " + name;
    }

    public void setWeight(double weight){
        this.weight = weight;

    }
    public double getWeight(){
        return weight;
    }
    int compareTo(Animal animal){
        return Double.compare(weight, animal.weight);
    }

    public boolean equals(Object o){
        if (this == o) {
            return true;
        }
        if (!(o instanceof Animal)) {
            return false;
        }
        Animal animal = (Animal) o;
        return  (this.name.equals(animal.name))
                && (this.kind().equals(animal.kind()))
                && (this.weight == animal.weight);
    }
    public enum FoodKind{
        HAY,
        CORN,
    }
    abstract public FoodKind getFoodKind();

    abstract public double getFoodCoeff();

    public double calculateFoodWeight(){
        return this.weight *  this.getFoodCoeff();
    }

    public double calculateFoodPrice(){
        FoodKind hay = FoodKind.HAY;
        hay = FoodKind.valueOf("HAY");
        FoodKind corn = FoodKind.CORN;
        corn = FoodKind.valueOf("CORN");
        if (getFoodKind() == hay)
            return calculateFoodWeight() * 2;
        return calculateFoodWeight() * 15;
    }


}

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

class Hamster extends Animal{
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
}

class Duck extends Animal{
    FoodKind corn = FoodKind.CORN;
    public Duck(String name) {
        super(name);
    }
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
}


