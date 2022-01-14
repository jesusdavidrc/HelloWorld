package com.company;

public class HarmonicSum {
    public static void main(String[] args) {
        // Define variables
        final int MAX_DENOMINATOR = 12;  // Use a more meaningful name instead of n
        double sumL2R = 0.0;         // Sum from left-to-right
        double sumR2L = 0.0;         // Sum from right-to-left
        double absDiff;              // Absolute difference between the two sums

       for (int denominator = 1; denominator <= MAX_DENOMINATOR; ++denominator) {
            sumL2R += (1/(double)denominator);
            //System.out.println(denominator);
        }
        System.out.println("The sum from left-to-right is: " + sumL2R);

       for (int denominator2 = MAX_DENOMINATOR; denominator2 >= 1; --denominator2) {
           sumR2L += (1/(double)denominator2);
           //System.out.println(denominator2);
        }
        System.out.println("The sum from right-to-left is: " + sumR2L);

        absDiff = (sumL2R > sumR2L) ? sumL2R - sumR2L : sumR2L - sumL2R;

        System.out.println("absDiff = " + absDiff);



    }
}
