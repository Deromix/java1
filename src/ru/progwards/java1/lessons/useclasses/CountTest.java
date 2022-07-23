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
        System.out.println("\nтест inc окончен");
    }

    public static void testDec(int count) {
        Count count1 = new Count(count);
        if (count > 0) {
            do {
                count1.dec();
                System.out.print(count1.getCount() + " ");
                if (count1.getCount() == 0) {
                    System.out.println();
                    System.out.print("count равен 0");
                }
            } while (count1.getCount() > 0);
            System.out.println();
            System.out.println("тест dec окончен");
        }
        if (count < 0) {
            do {
                count1.inc();
                System.out.print(count1.getCount() + " ");
                if (count1.getCount() == 0) {
                    System.out.println();
                    System.out.print("count равен 0");
                }
            } while (count1.getCount() < 0);
            System.out.println();
            System.out.println("тест dec окончен");
        }
    }





    public static void main(String[] args) {
        testInc(7);
        testInc(0);
        testInc(-1);
        testDec(9);
        testDec(0);
        testDec(-5);

    }
}
