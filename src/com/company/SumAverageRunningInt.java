package com.company;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        double average;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;

        for (int number = LOWERBOUND ; number <= UPPERBOUND; ++number){
            //  System.out.println(number);
            sum += number;
        }

        average = (double)sum / (double)UPPERBOUND;

        System.out.println("The sum of 1 to 100 is: "+ sum +"\n The average is: "+ average);

    }
}
