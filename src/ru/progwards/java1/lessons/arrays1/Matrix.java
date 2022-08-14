package ru.progwards.java1.lessons.arrays1;

public class Matrix {
    private int[][] array;

    public Matrix(int[][] matrix) {
        this.array = matrix;
    }

    public int maxInRow(int num) {
        int x = 0;
        for (int i = 0; i < array[num].length - 1; i++) {
            if (x < array[num][i]) {
                x = array[num][i];
            }
        }
        return x;
    }

    public int maxInCol(int num) {
        int x = 0;
        for (int i = 0; i < array.length - 1; i++ ) {
            if (x < array[i][num]) {
                x = array[i][num];
            }
        }
        return x;
    }

    public int max() {
        int x = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for(x = 0; x < array[i].length - 1; x++ ) {
                maxInCol(x);
            }
        }
        return x;
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

    public static void main(String[] args) {

    }
}


