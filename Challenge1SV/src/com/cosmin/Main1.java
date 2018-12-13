package com.cosmin;

import java.util.Scanner;


public class Main1 {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type 5 numbers:");

        int array[] = new int[5];

        for (int j = 0; j < array.length; j++) {

            array[j] = reader.nextInt();

        }

        int min = array[0];
        int max = array[0];


        for (int i = 1; i < array.length; i++) {

            if (min > array[i]) {

                min = array[i];

            } else if (max < array[i]) {

                max = array[i];

            }

        }

        int diff = max - min;
        System.out.println("The minimum number is: " + min);
        System.out.println("The maximum number is: " + max);
        System.out.println("The difference between max and min is: " + diff);

    }


}
