package ru.progwards.java1.lessons.compare;

public class TriangleInfo {
    public static boolean isTriangle(int a, int b, int c){
        if ( a < b + c && b < a + b && c < a + b )
            return true;
        return false;
    }
    public static boolean isRightTriangle(int a, int b, int c){
        if ((a * a) == (b * b) + (c * c) || (b * b) == (a * a) + (c * c) || (c * c) == (a * a) + (b * b))
            return true;
        return false;
    }
    public static boolean isIsoscelesTriangle(int a, int b, int c){
        if  ( a == b && b != c || c == a && a != b ||  c == b && b != a)
            return true;
        else if (a == b && b == c)
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isTriangle(4,5,6));
        System.out.println(isRightTriangle(2, 3, 4));
        System.out.println(isIsoscelesTriangle(3, 3, 3));
    }
}
