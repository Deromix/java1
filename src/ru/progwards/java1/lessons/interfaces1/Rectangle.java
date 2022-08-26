package ru.progwards.java1.lessons.interfaces1;

public class Rectangle implements Area{
    double width;
    double length;

    Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }

    @Override
    public double getArea() {
        return this.getLength() * this.getWidth();
    }
}
