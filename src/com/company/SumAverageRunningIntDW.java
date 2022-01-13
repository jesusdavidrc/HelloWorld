package com.company;

public class SumAverageRunningIntDW {
    public static void main(String[] args) {
        int sum = 0;
        double average;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;

        int number = LOWERBOUND;
        do {
            sum += number;
            ++number;
        } while (number <= UPPERBOUND);

        average = (double)sum / (double)UPPERBOUND;

        System.out.println("The sum of 1 to 100 is: "+ sum +"\n The average is: "+ average);

    }
}
