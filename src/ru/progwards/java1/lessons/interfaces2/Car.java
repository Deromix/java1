package ru.progwards.java1.lessons.interfaces2;

public class Car implements CompareWeight {
    double weight;
    public Car(double weight){
        this.weight = weight;
    }

    @Override
    public CompareResult compareWeight(CompareWeight smthHasWeight) {
        CompareResult less = CompareResult.LESS;
        less = CompareResult.valueOf("LESS");
        CompareResult equal = CompareResult.EQUAL;
        equal = CompareResult.valueOf("EQUAL");
        CompareResult greater = CompareResult.GREATER;
        greater = CompareResult.valueOf("GREATER");
        if(this.getWeight() < smthHasWeight.getWeight())
            return less;
        if(this.getWeight() > smthHasWeight.getWeight())
            return greater;
        else
            return equal;
    }

    public double getWeight(){
        return weight;
    }
    public String toString(){
        return "Это автомобиль грузоподъемностью " + getWeight();
    }
}
