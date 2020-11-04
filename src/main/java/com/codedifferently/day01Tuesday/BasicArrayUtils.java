package com.codedifferently.day01Tuesday;

import java.sql.SQLOutput;

public class BasicArrayUtils {
    /**
     * @param stringArray an array of String objects
     * @return the first element in the array
     */
    public static String getFirstElement(String[] stringArray) {
        String firstElement = stringArray[0];
        return firstElement;
    }

    /**
     * @param stringArray an array of String objects
     * @return the second element in the array
     */
    public static String getSecondElement(String[] stringArray) {
        return stringArray[1];
    }

    /**
     * @param stringArray an array of String objects
     * @return stringArray with the elements in reverse order
     */
    public static String[] reverse(String[] stringArray) {
        String[] rev =new String[stringArray.length];

        int counter = 0;

        for(int index = stringArray.length - 1; index >= 0; index--) {
            rev[counter] = stringArray[index];
        counter++;
           System.out.println("index: " + index);
           System.out.println("stringArray[" + index + "]: " + stringArray[index]);
        }
        return rev;
   }

    /**
     * @param stringArray an array of String objects
     * @return String made up of the first character in each element of stringArray
     */
    public static String getFirstLetterOfEachElement(String[] stringArray) {
        String firstLetter = "";
        for(int i = 0; i < stringArray.length; i++){
            firstLetter += stringArray[i].charAt(0) +  "";

        }
        return firstLetter;
    }
}
