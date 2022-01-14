package com.company;

public class Product1ToN {
    public static void main(String[] args) {

        long product = 1;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 14;
        
        for (int i = LOWERBOUND ; i <= UPPERBOUND; ++i){
            System.out.println("i = " + i);
            product *= i;

            System.out.println("product = " + product);
        }

    }
}
