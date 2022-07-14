package ru.progwards.java1.lessons.cycles;

public class DigitCheck {
    public static boolean containsDigit(int number, int digit){
        if (number > digit)
            return false;
        for (; digit <= number; digit++)
            if (number == digit)
                return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDigit(12345,0));
    }
}
