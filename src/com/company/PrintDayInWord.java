package com.company;

public class PrintDayInWord {
    public static void main(String[] args) {
        int nDay = 10;

        if (nDay == 0){
            System.out.println("Sunday");

        }else if(nDay == 1){
            System.out.println("Monday");

        }else if(nDay == 2){
            System.out.println("Tuesday");

        }else if(nDay == 3){
            System.out.println("Wednesday");

        }else if(nDay == 4){
            System.out.println("Thursday");

        }else if(nDay == 5){
            System.out.println("Friday");

        }else if(nDay == 6){
            System.out.println("Saturday");

        }else{
            System.out.println("Not a valid day");
        }

        switch (nDay){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Not a valid day");
        }
    }

}
