package com.cosmin;



public class Main {

    public static void main(String[] args) {

        int array[] = {5, 7, 2, 4, 9};

        System.out.println("Method 1");
        System.out.println(java.util.Arrays.toString(array));
        System.out.println("The difference between the largest and smallest element is: " + (array[4] - array[2]));
        System.out.println();

        System.out.println("----------");

        System.out.println();

        System.out.println("Method 2");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");

        }
        System.out.println();
        System.out.println("The difference between the largest and smallest element is: " + (array[4] - array[2]));
        System.out.println();

        System.out.println("----------");

        System.out.println();

        System.out.println("Method 3");
        System.out.println(array[0] + " , " + array[1] + " , " + array[2] + " , " + array[3] + " , " + array[4]);
        System.out.println("The difference between the largest and smallest element is: " + (array[4] - array[2]));

    }
}