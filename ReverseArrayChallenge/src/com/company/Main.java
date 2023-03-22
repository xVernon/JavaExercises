package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {15, 42, 38, -2, 0};

        System.out.println("Normal " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed " + Arrays.toString(array));
    }

    private static void reverse(int[] array){

        int size = array.length-1;
        int[] cloneArray = new int[array.length];

        for(int i = 0; i < array.length; i++){
            cloneArray[i] = array[i];
        }

        for(int i = 0; i < array.length; i++){
            array[i] = cloneArray[size-i];
        }
    }

}
