package ru.progwards.java1.lessons.interfaces2;

public interface CompareWeight {
    public enum CompareResult{
        LESS,
        EQUAL,
        GREATER
    }
    public CompareResult compareWeight(CompareWeight smthHasWeight);

    public double getWeight();
    public static void sort(CompareWeight[] a){
        for(int i = 1; i < a.length; i++){
            for(int j = 0; j < a.length; j++) {
                CompareWeight l;
                if (a[j].getWeight() > a[i].getWeight()) {
                    l = a[j];
                    a[j] = a[i];
                    a[i] = l;
                }
            }
        }
    }
}
