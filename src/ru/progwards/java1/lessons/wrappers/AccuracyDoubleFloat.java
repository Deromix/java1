package ru.progwards.java1.lessons.wrappers;

public class AccuracyDoubleFloat {
    public static Double volumeBallDouble(Double radius){
        double pi = 3.14;
        double V = 4/(3*pi*(radius*radius*radius));
        return V;
    }
    public static Float volumeBallFloat(Float radius){
        float pi = 3.14f;
        float V = 4/(3*pi*(radius*radius*radius));
        return V;
    }
    public static Double calculateAccuracy(Double radius){
        radius = 6371.2;
        Float f1 = radius.floatValue();
        return volumeBallDouble(radius) - volumeBallFloat(f1);
    }
}
