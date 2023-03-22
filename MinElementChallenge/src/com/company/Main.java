package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter count:");\
        int count = scanner.nextInt();
        scanner.nextLine();
        int[] array = readIntegers(count);

        System.out.println(findMin(array));
    }

    private static int findMin(int[] array){

        int min = array[0];

        for(int i = 0; i < array.length; i++){
            if(min >= array[i]) min = array[i];
        }

        return min;
    }

    private static int[] readIntegers(int n){

        int[] arrayValue = new int[n];
        System.out.println("Enter " + n + " integer values:\r");
        for(int i = 0; i<arrayValue.length; i++){
            int number = scanner.nextInt();
            scanner.nextLine();
            arrayValue[i] = number;
        }
        return arrayValue;
    }

    public static void printArray(int[] array){

        for(int i = 0; i<array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
}
