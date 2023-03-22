package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumOdd(1, 11));

        char switchValue = 'f';

        switch (switchValue){
            case'a':
                System.out.println("It is " + switchValue);
                break;
            case'b':
                System.out.println("It is " + switchValue);
                break;
            case'c':
                System.out.println("It is " + switchValue);
                break;
            case'd':
                System.out.println("It is " + switchValue);
                break;
            case'e':
                System.out.println("It is " + switchValue);
                break;
            default:
                System.out.println("None of a,b,c,d or e was choosen");
                break;
        }

    }


        public static boolean isOdd(int number){

            if(number < 0) return false;

            if(number % 2 != 0) return true;

            return false;
        }

        public static int sumOdd(int start, int end){

            if(end == 0 && start == 0) return -1;
            if(end < start) return -1;

            int sum = 0;

            for(int i=0; i>=11; i++){

                if(isOdd(i)) sum += i;
            }

            return sum;
        }
}
