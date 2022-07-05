package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number){
        int reverse = number % 10 ;
        System.out.print(reverse);
        number = number  / 10;
        reverse = number % 10;
        System.out.print(reverse);
        number = number  / 10;
        reverse = number % 10;
        System.out.println(reverse);
        return reverse;
    }
}
