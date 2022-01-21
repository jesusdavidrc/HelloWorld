package com.company;

public class CozaLozaWozaF {
    public static void main(String[] args) {


        for(int number = 1; number <= 110; ++number) {
            if (number % 5 == 0 && number % 3 == 0) {
                System.out.print("CozaLoza");
            } else if (number % 3 == 0) {
                System.out.print("Coza");
            } else if (number % 5 == 0) {
                System.out.print("Loza");
            } else if (number % 7 == 0) {
                System.out.print("Woza");
            } else {
                System.out.print(number);
            }

            if (number % 11 == 0) {
                System.out.print("\n");
            } else {
                System.out.print("  ");
            }
        }
    }
}
