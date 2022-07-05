package ru.progwards.java1.lessons.wrappers;

public class NumMetrics {
    public static Integer sumDigits(Integer number){
        int reverse = number % 10 ;
        number = number  / 10;
        int reverse1 = number % 10;
        number = number  / 10;
        int reverse2 = number % 10;
        return reverse2+reverse1+reverse;
    }
    public static Integer mulDigits(Integer number){
        int reverse = number % 10 ;
        number = number  / 10;
        int reverse1 = number % 10;
        number = number  / 10;
        int reverse2 = number % 10;
        return reverse2*reverse1*reverse;
    }
}
