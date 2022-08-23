package ru.progwards.java1.lessons.arrays2;

import java.util.Arrays;

public class DIntArray {
    private int[] count = {1,2,3,4,5};

    public DIntArray() {
    }

    public void add(int num) {
        int [] countCopy = Arrays.copyOf(count, count.length + 1);
        countCopy[countCopy.length - 1] = num;
    }

    public void atInsert(int pos, int num) {
        int[] countCopy = Arrays.copyOf(count, count.length);
        int j = 0;
        for (int i = 0; i < countCopy.length - 1; i++) {

            if (i == pos) {
                countCopy[i] = num;
            } else {
                countCopy[i] = count[j];
                j++;
            }
        }
    }

    public void atDelete(int pos) {
        int i = 0;
        int[] countCopy = Arrays.copyOf(count, count.length);
        for (i = 0; i < pos; i++) {
            if (countCopy[i] == pos)
                break;
        }
        for (int j = i; j < countCopy.length - 1; j++)
            countCopy[j] = countCopy[j + 1];
    }

    public int at(int pos) {
        Arrays.sort(count);
        return Arrays.binarySearch(count, pos);
    }

    public static void main(String[] args) {
    }
}