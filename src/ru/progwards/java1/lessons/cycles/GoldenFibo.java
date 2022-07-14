package ru.progwards.java1.lessons.cycles;

public class GoldenFibo {
    public static int fiboNumber(int n) {
        int f1 = 1;
        int f2 = 1;
        int f = 1;
        for (int i = 0; i < (n - 2); i++) {
            f = f2 + f1;
            f1 = f2;
            f2 = f;
        }
        return f;
    }
    public static boolean isGoldenTriangle(int a, int b, int c) {
        if (a == b && (b != c && a != c)) {
            if (1.61703 <= (double) b / (double) c && (double) b / c <= 1.61903 || 1.61703 <= (double) a / (double) c && (double) a / (double) c <= 1.61903)
                return true;
        }
        if (a == c && c != b) {
            if (1.61703 <= (double)c / (double)b && (double)c / (double)b <= 1.61903 || 1.61703 <= (double)a / (double)b && (double)a / (double)b <= 1.61903)
                return true;
        }
        if (b == c && c != a) {
            if (1.61703 <= (double) c / (double) a && (double) c / (double) a <= 1.61903 || 1.61703 <= (double) b / (double) a && (double) b / (double) a <= 1.61903)
                return true;
        }
            return false;
    }
    public static void main(String[] args) {
        for(int i = 1; i <= 15; i++)
            System.out.println(fiboNumber(i));
        for (int i = 1; fiboNumber(i) <= 100; i++)
            System.out.println(isGoldenTriangle(fiboNumber(i),fiboNumber(i), fiboNumber(++i)));
        System.out.println(isGoldenTriangle(55,55,34));
    }
}
