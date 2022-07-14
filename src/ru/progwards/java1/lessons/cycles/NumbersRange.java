package ru.progwards.java1.lessons.cycles;

public class NumbersRange {
    public static long sumNumbers(int start, int finish){
        long result = 0;
        for (;start <= finish; start++)
            result = result + start;
        return result;
    }
    public static int sumOdd(int start, int finish) {
        int result = 0;
        for (; start <= finish; start++){
            if(start % 2 == 0){
                result = result + start;
            }
        }
        return result;
    }
    public static long sumEvenIdx(int start, int finish){
        int result = 0;
        int n = 0;
        for (; start <= finish; start++) {
            n++;
            if (start % 2 == 0) {
                result = result + start - (start - n);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sumNumbers(12,22));
        System.out.println(sumOdd(12,22));
        System.out.println(sumEvenIdx(12,22));
    }
}
