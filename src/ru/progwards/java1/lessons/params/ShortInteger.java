package ru.progwards.java1.lessons.params;

class ShortInteger extends AbsInteger {
    private short val;

    public int getValue() {
        return val;
    }

    public ShortInteger(short val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return String.valueOf(val);
    }
}