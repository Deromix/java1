package ru.progwards.java1.lessons.compare;

public class TriangleSimpleInfo {
    public static int maxSide(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        }
        if (b > a && b > c) {
            return b;
        }
        if (c > a && c > b) {
            return c;
        }
        return c;
    }
    public static int minSide(int a, int b, int c){
        if (a < b && a < c) {
            return a;
        }
        if (b < a && b < c) {
            return b;
        }
        if (c < a && c < b) {
            return c;
        }
        return c;
    }
    public static boolean isEquilateralTriangle(int a, int b, int c){
        if (a == b && b == c)
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(maxSide(2,3,4));
        System.out.println(minSide(2,3,4));
        System.out.println(isEquilateralTriangle(2, 2, 2));
    }
}
