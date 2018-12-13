package com.cosmin;

import java.util.Scanner;


public class Main2 {


    public static void show(int[] array) {

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
        System.out.println();
        System.out.println("The minimum number is: " + min);
        System.out.println("The maximum number is: " + max);
        System.out.println("The difference between max and min is: " + diff);

    }

    public static int[] getArray() {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type 5 numbers:");
        int array[] = new int[5];

        for (int j = 0; j < array.length; j++) {

            array[j] = reader.nextInt();

        }

        return array;

    }


    public static int[] getArray2() {

        int array[] = {5, 7, 2, 4, 8, 13, 6};
        System.out.println("The predefined array is:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        return array;

    }


    public static void main(String[] args) {

        show(getArray());
        System.out.println("------------------------------------------");
        show(getArray2());
    }

}