package ru.progwards.java1.lessons.params;

class ByteInteger extends AbsInteger {
    private byte val;

    public int getValue() {
        return val;
    }

    public ByteInteger(byte val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return String.valueOf(val);
    }
}