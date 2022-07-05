package ru.progwards.java1.lessons.basics;

public class Distance3D {           //AB = √((xb - xa)2 + (yb - ya)2 + (zb - za)2)
    public static double distance(double x1, double y1,double z1, double x2, double y2, double z2){
        double x = (x1 - x2) * (x1 - x2);
        double y = (y1 - y2) * (y1 - y2);
        double z = (z1 - z2) * (z1 - z2);
        double exp = x + y + z;
        return Math.sqrt(exp);
    }
}
