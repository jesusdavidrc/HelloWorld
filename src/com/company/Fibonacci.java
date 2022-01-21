package com.company;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 3;          // The index n for F(n), starting from n=3, as n=1 and n=2 are pre-defined
        int fn = 0;             // F(n) to be computed
        int fnMinus1 = 1;   // F(n-1), init to F(2)
        int fnMinus2 = 1;   // F(n-2), init to F(1)
        int nMax = 20;      // maximum n, inclusive
        int sum = fnMinus1 + fnMinus2;  // Need sum to compute average
        double average = 0.0;

        System.out.print("The first " + nMax + " Fibonacci numbers are: \n"+fnMinus1+" " + fnMinus2);


        while (n <= nMax) {  // n starts from 3
            // n = 3, 4, 5, ..., nMax
            // Compute F(n), print it and add to sum
            fn = fnMinus1 + fnMinus2;

            sum = sum + fn;

                    // Increment the index n and shift the numbers for the next iteration
            ++n;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;

            System.out.print(" "+fn);

        }

        average = (double)sum / (double)nMax;
        System.out.println("\n average is = " + average);


    }
}
