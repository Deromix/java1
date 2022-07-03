package ru.progwards.java1.lessons.static1;

public class CalcTime {
    static double distance;
    static double speed;
    static String cityFrom;
    static String cityTo;
    public static void printTime(){
        System.out.println("Если ехать из " + cityFrom + " в " + cityTo + " со скоростью " + speed + " км/ч, то " + distance + " км проедем за " + distance/speed + " часов");
    }
    public static void MoscowToPiter(){
        CalcTime.distance = 712;
        CalcTime.speed = 80;
        CalcTime.cityFrom = "Москва";
        CalcTime.cityTo = "Питер";
    }
    public static void LissabonToVladivostok(){
        CalcTime.distance = 13090;
        CalcTime.speed = 75;
        CalcTime.cityFrom = "Лиссабон";
        CalcTime.cityTo = "Владивосток";
    }
    public static void MurmanskToAlmata(){
        CalcTime.distance = 5413;
        CalcTime.speed = 60;
        CalcTime.cityFrom = "Мурманск";
        CalcTime.cityTo = "Алмата";
    }
    public static void printTimes(){
        MoscowToPiter();
        printTime();
        LissabonToVladivostok();
        printTime();
        MurmanskToAlmata();
        printTime();
    }
}