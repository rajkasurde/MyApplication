package com.masteroogway.myapplication.Logical;

public class AddeToArrays {

    public static void main(String... args) {
        char[] numeric = {'1', '2', '3', '4'};
        char[] alphabet = {'a', 'b', 'c', 'd'};
        char[] strings = new char[numeric.length + alphabet.length];
        int intArrayCounter = 0;
        for (int i = 0; i < strings.length; ) {
            if (numeric.length - intArrayCounter > 0) {
                strings[i] = numeric[numeric.length - intArrayCounter - 1];
                i++;
            }
            if (alphabet.length - intArrayCounter > 0) {
                strings[i] = alphabet[intArrayCounter];
                i++;
            }
            intArrayCounter++;
        }

        //Print to see the values
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i]);
        }
    }
}
