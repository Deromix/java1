package ru.progwards.java1.lessons.cycles;

public class DigitCheck {
    public static boolean containsDigit(int number, int digit) {
        while (number > 0) {
            if (number % 10 == digit)
                break;
            number = number / 10;
        }
        return number > 0;
    }
        public static void main(String[] args) {
        System.out.println(containsDigit(12345,9));
    }
}
