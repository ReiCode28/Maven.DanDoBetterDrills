package com.zipcodewilmington.danny_do_better_exercises;

/**
 * Created by dan on 6/14/17.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {
        return "Hello World";
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment){
        return firstSegment + secondSegment;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment){
        return firstSegment + secondSegment;
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input){
        return input.substring(0,3);
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input){
        return input.substring(input.length() - 3);
    }

    /**
     * @param inputValue the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue){
        return inputValue.equals(comparableValue);
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue){


        //length() method gets the total number of characters and calculates if it has any remainders
        // if a number is divisible by 2 it is even otherwise it is odd
        // In this particular code, if the amount of letters in the string is even (true),
        // then it will execute the code in line 72, otherwise it will execute the code in line 77
        if (inputValue.length() % 2 == 0) {

            //this code returns character at a given index. The given index here is
            // the total number of characters divided by 2 then subtracted by 1
            return inputValue.charAt(inputValue.length() / 2 - 1);
        }

        //this code returns a character at the given index of the
        // total number of characters divided by 2
        return inputValue.charAt(inputValue.length() / 2);
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString){
        String[] words = spaceDelimitedString.split(" ");
        return words[0];
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){

        //Declared an array of strings named words and initialized a split() method
        //the split(" ") method splits the words
        String[] words = spaceDelimitedString.split(" ");

        //then returned the array at the index of 1 which would be the second word because index always starts at 0
        return words[1];
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse){

        StringBuilder str = new StringBuilder(stringToReverse);
        StringBuilder reverseStr = str.reverse();

        return reverseStr.toString();
    }
}
