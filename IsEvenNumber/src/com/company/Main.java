package com.company;

public class Main {

    public static void main(String[] args) {

        int number = 4;
        int finish = 20;
        int numbersOfEven = 0;

        while(number <= finish){

            number++;
            if(!isEvenNumber(number)) continue;

            System.out.println("Even number is: " + number);
            numbersOfEven ++;

            if(numbersOfEven == 5) {
                System.out.println("numbersOfEven = " + numbersOfEven);
                break;
            }

        }
    }

    public static boolean isEvenNumber(int number){

        if((number % 2) == 0) return true;

        return false;
    }
}
