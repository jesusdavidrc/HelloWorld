package com.company;

public class ComputePI {
    public static void main(String[] args) {
        double sum = 0.0D;
        int MAX_DENOMINATOR = 1000;

        for(int denominator = 1; denominator <= MAX_DENOMINATOR; denominator += 2) {
            if (denominator % 4 == 1) {
                sum += 1.0D / (double)denominator;
            } else if (denominator % 4 == 3) {
                sum -= 1.0D / (double)denominator;
            } else {
                System.out.println("Impossible!!!");
            }
        }

    }
}
