package ru.progwards.java1.lessons.useclasses;

public class TimeTest {
    public static void main(String[] args) {
        Time t0 = new Time(0, 0, 0);
        Time time0 = t0;
        time0.toString();;
        System.out.println(time0);
        Time t1 = new Time(1, 2, 3);
        Time time1 = t1;
        time1.toString();
        System.out.println(time1);;
        Time t2 = new Time(11, 12, 13);
        Time time2 = t2;
        time2.toString();
        System.out.println(time2);
        System.out.println("в time0 " + time0.toSeconds() + " секунд");
        System.out.println("в time1 " + time1.toSeconds() + " секунд");
        System.out.println("в time2 " + time2.toSeconds() + " секунд");
        System.out.println("разница между time0 и time1 равна " + time0.secondsBetween(time1));
        System.out.println("разница между time2 и time0 равна " + time2.secondsBetween(time0));
        System.out.println("разница между time1 и time2 равна " + time1.secondsBetween(time2));
    }
}
