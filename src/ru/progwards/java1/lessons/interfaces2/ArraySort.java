package ru.progwards.java1.lessons.interfaces2;

public class ArraySort implements CompareWeight {

    @Override
    public CompareResult compareWeight(CompareWeight smthHasWeight) {
        CompareResult less = CompareResult.LESS;
        less = CompareResult.valueOf("LESS");
        CompareResult equal = CompareResult.EQUAL;
        equal = CompareResult.valueOf("EQUAL");
        CompareResult greater = CompareResult.GREATER;
        greater = CompareResult.valueOf("GREATER");
        if(this.getWeight() < smthHasWeight.getWeight())
            return less;
        if(this.getWeight() > smthHasWeight.getWeight())
            return greater;
        else
            return equal;
    }


    @Override
    public double getWeight() {
        return 0;
    }

    public static void sort(CompareWeight[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                CompareWeight l;
                if (a[j].getWeight() > a[i].getWeight()) {
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
        for(int value: b){
            System.out.println(value);
        }
    }
}
