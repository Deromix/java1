package ru.progwards.java1.lessons.params;

import java.util.Arrays;

public class ArrayInteger {
    byte[] digits;
    ArrayInteger(int n) {
        char [] chars = String.valueOf(n).toCharArray();
        digits = new byte[chars.length];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = (byte) (n % 10);
            n = n / 10;
        }
    }

    void fromString(String value){
        digits = Arrays.copyOf(digits, digits.length + 1);
        digits[digits.length - 1] = Byte.parseByte(value);
    }

    @Override
    public String toString(){
        return Arrays.toString(digits);
    }
    public byte[] getDigits(){
        return digits;
    }

    boolean add(ArrayInteger num){
        for (int i = 0; i < num.digits.length; i++){
            num.digits[i] = (byte) (num.digits[i] + this.digits[i]);
        }
        for(int i = 0; i < num.digits.length; i++){
            if(num.digits[i] >= 10 )
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayInteger ai1 = new ArrayInteger(123);
        ArrayInteger ai2 = new ArrayInteger(321);
        System.out.println(ai1.toString());
        ai1.add(ai2);
        System.out.println(ai2);



    }
}
