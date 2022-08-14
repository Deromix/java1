package ru.progwards.java1.lessons.arrays1;

public class Matrix {
    private int[][] array;

    public Matrix(int[][] matrix) {
        this.array = matrix;
    }

    public int maxInRow(int num) {
        int x = -100;
        for (int i = 0; i < array[num].length - 1;) {
            if (x < array[num][i]) {
                x = array[num][i];
                i++;
            }
            return x;
        }
        return x;
    }

    public int maxInCol(int num) {
        int x = -100;
        for (int i = 0; i < array.length - 1;) {
            if (x < array[i][num]) {
                x = array[i][num];
                i++;
            }
            return x;
        }
        return x;
    }

    public int max() {
        int x1 = 0;
        for (int i = 0; i < array.length - 1; i++) {
            maxInCol(x1++);
        }
        return x1;
    }

    public boolean isMatrix() {
        int i = 0;
        if (array[i].length == array[i + 1].length) {
            return true;
        } else {
            return false;
        }
    }

    public int[][] transposition() {
        if (isMatrix()) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println(" ");
            }
        } else {
            return null;
        }
        return null;
    }
}


