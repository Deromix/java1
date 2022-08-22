package ru.progwards.java1.lessons.arrays2;

import java.util.Arrays;

public class DIntArray {
    private int[] count;

    public DIntArray(int[] array) {
    }

    public void add(int num) {
        int[] countCopy = Arrays.copyOf(count, count.length + 1);
        countCopy[count.length + 1] = num;
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
        int j = 0;
        int[] countCopy = Arrays.copyOf(count, count.length);
        for (j = pos; j < countCopy.length - 1; j++)
            if (countCopy[j] == pos)
                break;
        for (int k = j; k < countCopy.length - 1; k++)
            countCopy[k] = countCopy[k + 1];
    }

    public int at(int pos) {
        Arrays.sort(count);
        return Arrays.binarySearch(count, pos);
    }
}