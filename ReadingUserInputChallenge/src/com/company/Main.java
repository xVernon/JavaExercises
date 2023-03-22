package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // boolean isItNumber = true;

        int sum = 0;
        int i = 1;

        while(i < 11)
        {
            System.out.println("Enter number #" + i);
            if(scanner.hasNextInt()){
                int number = scanner.nextInt();
                //scanner.nextLine();
                sum += number;
                i++;
            }
            else
            {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();

        }

        scanner.close();
        System.out.println("Sum of Numbers = " + sum);

    }
}
