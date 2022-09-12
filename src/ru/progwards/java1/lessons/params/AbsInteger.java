package ru.progwards.java1.lessons.params;

public abstract class AbsInteger {
    public abstract int getValue();

    static AbsInteger add(AbsInteger num1, AbsInteger num2) {
        int res = num1.getValue() + num2.getValue();

        if (res >= Byte.MIN_VALUE && res <= Byte.MAX_VALUE)
            return new ByteInteger((byte) res);
        else if (res >= Short.MIN_VALUE && res <= Short.MAX_VALUE)
            return new ShortInteger((short) res);
        else
            return new IntInteger(res);

    }

    public static void main(String[] args) {
        ByteInteger b = new ByteInteger((byte) 123);
        System.out.println(b.toString());
        System.out.println(add(new IntInteger(12345), new ByteInteger((byte) 8)));
    }
}

