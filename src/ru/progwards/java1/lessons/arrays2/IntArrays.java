package ru.progwards.java1.lessons.arrays2;


import java.util.Arrays;

public class IntArrays {
    public static String toString(int []a) {
        if (a == null)
            return "null";
        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";
        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(a[i]);
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
    }
    public static void sort(int[] a){
        int i;
        int j;
        for(i = 1; i < a.length - 1; i++ ){
            for(j = 0; j < a.length - 1; j++){
                int l = 0;
                if(a[j] > a[i]) {
                    l = a[j];
                    a[j] = a[i];
                    a[i] = l;
                }
            }
        }
    }

    public static boolean equals1(int[] a1, int[] a2) {
        if (a1.length == a2.length) {
            sort(a1);
            sort(a2);
            for (int i = 0; i < a1.length - 1; i++) {
                if (a1[i] == a2[i]) {
                    return true;
                }
            }
        }
        else {
            return false;
        }
        return false;
    }



    public static boolean equals2(int[] a1, int[] a2){
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1,a2);
    }


    public static void main(String[] args) {
        int [] z = {-71, -21, -13, 11, 20, 75, 77, 80, 86, 95};
        int [] y = {-71, -21, -13, 11, 20, 75, 77, 95, 86,80};
        System.out.println(toString(z));
        System.out.println(equals1(z,y));
        System.out.println(equals2(z,y));
    }
}
