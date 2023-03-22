package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = getIntegers(5);

        System.out.println("Array before sort: ");
        printArray(array);

        sortIntegers(array);
        System.out.println("\n" + "Array after sort: ");
        printArray(array);

        scanner.nextLine();

    }

    public static int[] getIntegers(int n){

        int[] arrayValue = new int[n];
        System.out.println("Enter " + n + " integer values:\r");
        for(int i = 0; i<arrayValue.length; i++){
            arrayValue[i] = Integer.parseInt(scanner.nextLine());
        }
        return arrayValue;
    }

    public static void printArray(int[] array){

        for(int i = 0; i<array.length; i++){
            System.out.println("Element " + i + "contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){

        for(int i = 0; i<array.length; i++){
            for(int j = i+1; j<array.length; j++){
                int tmp = 0;
                if(array[i] < array[j]){
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }

        return array;
    }
}
