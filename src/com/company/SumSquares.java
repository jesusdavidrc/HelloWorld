package com.company;

//Modify the program to produce two sums: sum of odd numbers and sum of even numbers from 1 to 100. Also computer their absolute difference.

public class SumSquares {
    public static void main(String[] args) {

        int sumOdd  = 0;   // Accumulating sum of odd numbers
        int sumEven = 0;   // Accumulating sum of even numbers
        int absDiff;       // Absolute difference between the two sums

        for (int number = 1; number <= 100; ++number) {
            //System.out.println("number = " + number);
            
            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }
        }

        absDiff = (sumOdd > sumEven) ? sumOdd - sumEven : sumEven - sumOdd;

        System.out.println("sum even: "+sumEven+" sum odd: "+sumOdd+" la absDiff es: "+absDiff);

    }
}
