package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("Sum of Digits: " + sumDigits(123));
        System.out.println("Sum of Digits: " + sumDigits(-123));
        System.out.println("Sum of Digits: " + sumDigits(1233));
        System.out.println("Sum of Digits: " + sumDigits(6));

        int number = 15351351;

        System.out.println(isPalindrome(number));

        System.out.println(sumFirstAndLastDigit(123));

    }

    public static int sumDigits(int number){

        int sumOfDigits = 0;

        if(number <= 9) return -1;

        while(number >0)
        {
            int digit = number % 10;
            sumOfDigits += digit;

            number /= 10;
        }

        return sumOfDigits;
    }

    public static boolean isPalindrome(int number){

        int reversedNumber = 0;
        int comparedNumber = number;

        while(number != 0)
        {
            int digit = number%10;
            reversedNumber += digit;

            if(comparedNumber == reversedNumber) return true;

            reversedNumber *= 10;
            number /= 10;


        }

        return false;
    }

    public static int sumFirstAndLastDigit(int number){

        if(number < 0) return -1;

        int sum = 0;

        for (int i = 0; number >0; i++){

            int digit = 0;

            digit = number % 10;

            if(i == 0 || number < 10) sum += digit;

            number /= 10;
        }
        return sum;
    }
}
