package ru.progwards.java1.lessons.params;

import java.util.Arrays;

public class ArrayInteger {
    byte[] digits;
    ArrayInteger(int n) {
        char [] chars = String.valueOf(n).toCharArray();   // переводим n  массив char, чтобы узнать длинну
        digits = new byte[chars.length];   // присваиваем массиву digits длиннну
        for (int i = 0; i < digits.length; i++) {   // заполняем массив
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
        for (int i = 0; i < this.digits.length; i++){    // сложение значений массивов и сохранение в исходный объект
            this.digits[i] = (byte) (this.digits[i] + num.digits[i]);
        }
        for(int i = 0; i < this.digits.length; i++){    // проверка на переполнение
            if(this.digits[i] >= 10 )
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayInteger ai1 = new ArrayInteger(10767558);
        ArrayInteger ai2 = new ArrayInteger(10767558);
        System.out.println(ai1.toString());
        System.out.println(ai1.add(ai2));
        System.out.println(ai1);
    }
}
