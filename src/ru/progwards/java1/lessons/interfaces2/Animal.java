package ru.progwards.java1.lessons.interfaces2;



public abstract class Animal implements Comparable<Animal>, IColor, Home, ToString {
    String name;
    double weight;

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
    public abstract String kind();
    public abstract String say();

    public String getString(){
        return toString();
    }
    @Override
    public String toString() {
        return "Это " + kind() + " " + this.name + " " + this.weight + " " + this.getColor();
    }

    public void setWeight(double weight) {
        this.weight = weight;

    }
    public double getWeight() {
        return weight;
    }
    @Override
    public int compareTo(Animal o) {
        return Double.compare(this.weight, o.weight);
    }
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Animal)) {
            return false;
        }
        Animal animal = (Animal) o;
        return (this.name.equals(animal.name))
                && (this.kind().equals(animal.kind()))
                && (this.weight == animal.weight);
    }
    public enum FoodKind {
        HAY,
        CORN,
    }
    abstract public FoodKind getFoodKind();

    abstract public double getFoodCoeff();

    public double calculateFoodWeight() {
        return this.weight * this.getFoodCoeff();
    }

    public double calculateFoodPrice() {
        FoodKind hay = FoodKind.HAY;
        hay = FoodKind.valueOf("HAY");
        FoodKind corn = FoodKind.CORN;
        corn = FoodKind.valueOf("CORN");
        if (getFoodKind() == corn)
            return calculateFoodWeight() * 15;
        else {
            return calculateFoodWeight() * 2;
        }
    }


    abstract public Color getColor();;

    public abstract String getHome();
}



