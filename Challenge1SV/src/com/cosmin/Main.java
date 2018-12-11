package com.cosmin;


public class Main {


    public static void main(String[] args) {

        int array[] = {5, 7, 2, 4, 8, 9, 6};
        int min = array[0];
        int max = 0;


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

            if (min > array[i]) {

                min = array[i];

            } else if (max < array[i]) {

                max = array[i];

            }

        }

        System.out.println();
        int diff = max - min;
        System.out.println("The difference between max and min is: " + diff);

    }

}

