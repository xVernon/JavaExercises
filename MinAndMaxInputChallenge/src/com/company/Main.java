package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean firstNumber = true;

        while(true){

            System.out.println("Enter number: ");

            boolean isInt = scanner.hasNextInt();

            if(isInt)
            {
                int number = scanner.nextInt();

                if(firstNumber){
                    firstNumber = false;
                    min = number;
                    max = number;
                }

                if(min > number) min = number;
                else if(max < number) max = number;
            }
            else
            {
                System.out.println("Invalid Number");
                break;
            }
            scanner.nextLine();

        }
        System.out.println("MIN: " + min + "\nMAX: " + max);
        scanner.close();
    }
}
