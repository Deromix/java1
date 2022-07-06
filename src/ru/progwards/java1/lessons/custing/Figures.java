package ru.progwards.java1.lessons.custing;

public class Figures {
    public static double pi = 3.14;
    public static double circle(double d){                    // Площать круга S = 4πR2(r в степени 2)
        double s = 4 * pi * ((d/2)*(d/2));                     //d/2 - радиус
        return s;
    }
    public static double square(double n){                  // площадь квадрата S = n*n
        double s = n * n;
        return s;
    }
    public static Double triangle(double k){                // площадь треугольника S = √(p * (p-a) * (p-b) * (p-c))
        double p = (k + k + k)/2;
        double s = Math.sqrt((p * (p-k)*(p-k)*(p-k)));
        return s;
    }
    public static double squareVsTraiange(double p){        // sквадрат - sтреугольника
        return  square(p) / triangle(p);

    }
    public static double squareVsCircle(double p){          // sквадрат - sкруга

        return square(p) / circle(p);

    }
    public static double triangleVsCircle(double p){        // sтеругольника - sкруга
        return triangle(p) / circle(p);
    }

    public static void main(String[] args) {
        System.out.println(squareVsTraiange(2));
        System.out.println(squareVsCircle(2));
        System.out.println(triangleVsCircle(2));
    }
}
