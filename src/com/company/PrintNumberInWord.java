package com.company;

public class PrintNumberInWord {
    public static void main(String[] args) {
        int number = 0;

        if (number == 1){
            System.out.println("ONE");

        }else if(number == 2){
            System.out.println("TWO");

        }else if(number == 3){
            System.out.println("THREE");

        }else if(number == 4){
            System.out.println("FOUR");

        }else if(number == 5){
            System.out.println("FIVE");

        }else if(number == 6){
            System.out.println("SIX");

        }else if(number == 7){
            System.out.println("SEVEN");

        }else if(number == 8){
            System.out.println("EIGHT");

        }else if(number == 9){
            System.out.println("NINE");

        }else if(number == 10){
            System.out.println("TEN");

        }else{
            System.out.println("OTHER");
        }

        switch (number){
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 10:
                System.out.println("Ten");
                break;
            default:
                System.out.println("Other");
        }
    }
}
