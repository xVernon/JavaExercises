package com.company;

public class Main {

    public static void main(String[] args) {

        //System.out.println(canPack(1,0,4));

        System.out.println(getLargestPrime(21));

    }

    public static int getLargestPrime(int number){

        if(number <= 1) return -1;

        int prime = 0;

        for(int i = 1; i < number; i++){

            if(i != 1 && (number % i) == 0) {
            }
            else {
                if(prime <= i) prime = i;
            }
        }

        return prime;

    }

    public static boolean canPack(int bigCount, int smallCount, int goal){

        //bigCount = 5kg
        //smallCount = 1kg

        if(bigCount < 0 || smallCount < 0 || goal < 0) return false;

        int weightValue = 0;

        while(weightValue < goal)
        {
            if((weightValue + 5) <= goal && bigCount > 0)
            {
                weightValue += 5;
                bigCount -= 1;
            }
            else if((weightValue + 1) <= goal && smallCount > 0)
            {
                weightValue += 1;
                smallCount -= 1;
            }
        }

        if(weightValue <= goal) return true;

        return false;
    }
}
