package ru.progwards.java1.lessons.interfaces2;

public class TestString {
    public static void print(ToString any){
        System.out.println(any.getString());
    }

    public static void main(String[] args) {
        Cow cow1 = new Cow("Пеструшка",0.0);
        Duck duck1 = new Duck("Даша", 0.0);
        Hamster ham1 = new Hamster("Поликарп" , 0.0);
        Time time = new Time(1,12,55);
        ComplexNum cn = new ComplexNum(22,5);
        print(cow1);
        print(duck1);
        print(ham1);
        print(time);
        print(cn);
    }
}
