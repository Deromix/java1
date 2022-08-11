package ru.progwards.java1.lessons.arrays1;

public class ArraySort {

    public static void sort(int[] a){
        int i;
        int j;
        for(i = 1; i < a.length; i++ ){
            for(j = 0; j < a.length; j++){
            int l = 0;
            if(a[j] > a[i]) {
                l = a[j];
                a[j] = a[i];
                a[i] = l;
            }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {32,21,123,234,135,326,3,76,12,11,9};
        sort(b);
        for(int value: b){
            System.out.println(value);
        }
    }
}
