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

    public static boolean equals1(int[] a1, int[] a2) {
        int i;
        int j;
        for (i = 1; i < a1.length; i++) {
            for (j = 0; j < a1.length; j++) {
                int l = 0;
                if (a1[j] > a1[i]) {
                    l = a1[j];
                    a1[j] = a1[i];
                    a1[i] = l;
                }
            }
        }
        for (i = 1; i < a2.length; i++) {
            for (j = 0; j < a2.length; j++) {
                int l = 0;
                if (a2[j] > a2[i]) {
                    l = a2[j];
                    a2[j] = a2[i];
                    a2[i] = l;
                }
            }
        }
        if (a1.length == a2.length) {
            for (i = 0; i < a1.length; i++) {
                if (a1[i] == a2[i]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean equals2(int[] a1, int[] a2){
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1,a2);
    }


    public static void main(String[] args) {
        int [] z = {2,3,4,5};
        int [] y = {2,3,4,5};
        System.out.println(toString(z));
        System.out.println(equals1(z,y));
        System.out.println(equals2(z,y));
    }
}
