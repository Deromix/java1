package ru.progwards.java1.lessons.arrays1;

import java.util.Arrays;

public class Eratosthenes {
    boolean[] sieve;

    public Eratosthenes(int N) {

        this.sieve = new boolean[N];
        Arrays.fill(sieve, true);
        sift();
    }

    private void sift() {
        sieve[0] = false;
        sieve[1] = false;
        for (int i = 2; i < sieve.length; i++) {
            if (sieve[i]) {
                for (int j = 2; i * j < sieve.length; j++) {
                    sieve[i * j] = false;
                }
            }
        }
    }

    public boolean isSimple(int n) {
        return sieve[n];
    }

    public static void main(String[] args) {
        Eratosthenes simple = new Eratosthenes(100);
        System.out.println(simple.isSimple(13));
    }
}
