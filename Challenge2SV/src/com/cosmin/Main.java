package com.cosmin;

import java.util.*;


public class Main {


    public static String getInput() {
        Scanner reader = new Scanner(System.in);

        System.out.print("Tasteaza ceva: ");
        String inputText = reader.nextLine();
        System.out.println("Ai tastat: " + inputText);

        return inputText;
    }

    public static Dictionary countCharacters(String input) {
        Hashtable<Character, List<Integer>> data = new Hashtable<>();

        for (int i = 0; i < input.length(); i++) {

            if (data.get(input.charAt(i)) != null) {

                (data.get(input.charAt(i))).add(i);

            } else {

                data.put(input.charAt(i), new ArrayList(Arrays.asList(i)));

            }

        }

        printResult(data);
        return data;
    }


    public static void printResult(Hashtable<Character, List<Integer>> data) {
        data.entrySet().forEach(entry -> {
            String key = String.valueOf(entry.getKey());
            List<Integer> indexes = data.get(entry.getKey());
            System.out.println(key + " apare" + getCountMessage(indexes.size()) + getCountPositions(indexes));

        });

    }


    public static String getCountPositions(List<Integer> positions) {
        return positions.size() > 1 ?
                " pe pozitiile " + Arrays.toString(positions.toArray()) :
                " pe pozitia [" + positions.get(0) + "]";
    }


    public static String getCountMessage(Integer count) {
        return count > 1 ?
                " de " + count + " ori" :
                " 1 data";
    }


    public static void main(String[] args) {

        countCharacters(getInput());

    }


}
