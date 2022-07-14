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
        if (((a == b) && b != c) || ((a == c) && c != b) || ((b == c) && c != a)) {
            if ((a == b) && b != c) {
                if (1.61703 <= b / c && b / c <= 1.61903)
                    return true;
            }
            if ((a == c) && c != b) {
                if (1.61703 <= c / b && c / b <= 1.61903)
                    return true;
            }
            if ((b == c) && c != a) {
                if (1.61703 <= c / a && c / a <= 1.61903)
                    return true;
            } else
                return false;
        }
        return false;
    }
    public static void main(String[] args) {
        for(int i = 1; i <= 15; i++)
            System.out.println(fiboNumber(i));
        for (int i = 1; fiboNumber(i) <= 100; i++)
            System.out.println(isGoldenTriangle(fiboNumber(i),fiboNumber(i), fiboNumber(++i)));
    }
}
