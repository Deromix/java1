package ru.progwards.java1.lessons.wrappers;

public class StringConverter {
    public static String fromByte(byte number){
        String str = Byte.toString(number);
        return str;
    }
    public static String fromShort(short number){
        String str = Short.toString(number);
        return str;
    }
    public static String fromInt(int number){
        String str = Integer.toString(number);
        return str;
    }
    public static String fromLong(long number){
        String str = Long.toString(number);
        return str;
    }
    public static String fromFloat(float number){
        String str = Float.toString(number);
        return str;
    }
    public static String fromDouble(double number){
        String str = Double.toString(number);
        return str;
    }
}
