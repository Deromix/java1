package ru.progwards.java1.lessons.arrays1;

public class Matrix {
    private int[][] array;

    public Matrix(int[][] matrix) {
        this.array = matrix;
    }

    public int maxInRow(int num) {
        int maxNum = Integer.MIN_VALUE;
        for (int value : array[num])  {
            if (value > maxNum)
                maxNum = value;
        }
        return maxNum;
    }

    public int maxInCol(int num) {
        int maxNum = Integer.MIN_VALUE;
        int i;
        for (i = 0; i < array.length; i++ )  {
            if (array[i][num] > maxNum)
                maxNum = array[i][num];
        }
        return maxNum;
        }

    public int max() {
        int maxNum = Integer.MIN_VALUE;
        int j = 0;
        for(int i = 0; i < array.length; i++){
            maxInRow(j);
            if(maxNum < maxInRow(j)){
                maxNum = maxInRow(j);
            }
            j++;
        }
        return maxNum;
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
        int [][]array = {{-2,31,3,14}, {4,37,0,12}, {10,6,3,36,32}};
        Matrix ar1 = new Matrix(array);
        System.out.println(ar1.maxInRow(1));
        System.out.println(ar1.maxInCol(3));
        System.out.println(ar1.max());

    }
}


