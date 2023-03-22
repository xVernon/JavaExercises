package com.company;

public class Main {

    public static void main(String[] args) {


        System.out.println(getDigitCount(100));

        //System.out.println(reverse(100));


        numberToWords(100);
    }

    public static int getDigitCount(int number){

        if(number < 0) return -1;

        int numberOfDigits = 1;

        while(number > 9){
            number /= 10;
            numberOfDigits += 1;
        }

        return numberOfDigits;
    }

    public static int reverse(int number){

        int reversedNumber = 0;
        int digit;

        while(number > 0){
            digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return reversedNumber;
    }

    public static void numberToWords(int number){

        if(number < 0) System.out.println("Invalid Value");

        int reversedNumber = reverse(number);
        int digit = 0;

        for(int i = 0; i < getDigitCount(number); i++)
        {
            digit = reversedNumber%10;
            reversedNumber /= 10;
            switch(digit){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
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
                default:
                    System.out.println("Zero");
                    break;
            }
        }
    }
}
