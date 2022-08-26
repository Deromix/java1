package ru.progwards.java1.lessons.interfaces1;

public abstract class Animal implements IColor{
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
        if (getFoodKind() == corn)
            return calculateFoodWeight() * 15;
        else  {
            return calculateFoodWeight() * 2;
        }
    }

    public abstract Color getColor();
}




