package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number){
        int reverse = number % 10 ;
        System.out.print(reverse);
        reverse = number / 10;
        reverse = reverse % 10;
        System.out.print(reverse);
        reverse = number / 100;
        reverse = reverse % 10;
        System.out.println(reverse);
        return reverse;
    }
}
