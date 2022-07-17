package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number){
        int reverse = number % 10 ;
        number = number  / 10;
        int reverse1 = number % 10;
        number = number  / 10;
        int reverse2 = number % 10;
        return reverse*100+reverse1*10+reverse2;
    }
}
