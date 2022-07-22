package ru.progwards.java1.lessons.useclasses;

public class CountTest {

    public static void testInc(int count) {
        Count c1 = new Count(0);
        for (; c1.count != count; ) {
            if (count > 0) {
                c1.inc();
                System.out.print(c1.getCount() + " ");
            }
            if (count < 0) {
                c1.dec();
                System.out.print(c1.getCount() + " ");
            }
        }
        System.out.println("тест inc окончен");
    }

    public static void testDec(int count) {
        Count c1 = new Count(2);
        for (;!c1.dec(); ) {
                c1.dec();
                System.out.print(c1.getCount() + " ");
                if (c1.dec())
                System.out.println("\ncount равен 0");
                break;
        }
        System.out.println("тест dec окончен");
    }


    public static void main(String[] args) {
        testDec(6);
    }
}
