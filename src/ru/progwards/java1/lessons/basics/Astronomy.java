package ru.progwards.java1.lessons.basics;

public class Astronomy {
    static double pi = 3.14;
    public static Double sphereSquare(Double r){
        double s = 4*pi*(r*r);
        return s;
    }
    public static Double earthSquare(){
        sphereSquare(6371.2);
        return sphereSquare(6371.2);
    }
    public static Double mercurySquare(){
        sphereSquare(2439.7);
        return sphereSquare(2439.7);
    }
    public static Double jupiterSquare(){
        sphereSquare(71492.0);
        return sphereSquare(71492.0);
    }
    public static Double earthVsMercury(){
        double sub = earthSquare() - mercurySquare();
        return sub;
    }
    public static Double earthVsJupiter(){
        double sub = earthSquare() - jupiterSquare();
        return sub;
    }
}
