package com.company;

public class SumAverageRunningIntW {
    public static void main(String[] args) {
        int sum = 0;
        double average;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        int number = LOWERBOUND;

        while (number <= UPPERBOUND) {
            sum += number;
            ++number;
        }

        average = (double)sum / (double)UPPERBOUND;

        System.out.println("The sum of 1 to 100 is: "+ sum +"\n The average is: "+ average);

    }
}
