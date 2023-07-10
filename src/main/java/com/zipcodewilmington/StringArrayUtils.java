package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (String s : array) {
            if (Objects.equals(s, value)) {
                return true;
            }

        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reverse=new String[array.length];

        for (int i = 0; i < array.length ; i++) {
            reverse[i] = array[array.length-1-i];
        }
        return reverse;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String palin=array[0];
        String reverse= new StringBuilder(palin).reverse().toString();

        return palin.equals(reverse);


    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        String pangram= Arrays.toString(array).toLowerCase();//makes a new string with all lowercase letters

        boolean flag=true; //assumes its true unless proven not

        for (char i = 'a'; i <= 'z'; i++) {
            if (!pangram.contains(String.valueOf(i))) {//checks the whole array for the value i
                flag = false;
                break;
            }
        }
        return flag;
        }


    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int occurrence=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==value){
                occurrence++;
            }
        }
        return occurrence;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        List<String> list = new ArrayList<String>(Arrays.asList(array));
        list.remove(valueToRemove);
        array = list.toArray(new String[0]);
        return array;

    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        List<String> newArr = new ArrayList<>();

        for (int i = 0; i < array.length - 1; i++) {
            String current = array[i];
            String next = array[i + 1];

            //if the element after it is the same as it
            if (!current.equals(next)){
                //remove the element.
                newArr.add(current);
            }
            if (i == array.length-2){
                newArr.add(next);
            }

        }

        return newArr.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        List<String> newArray = new ArrayList<>(Arrays.asList(array));

        for(int i = 0; i < newArray.size() - 1; i++){
           //newArray.get(i) is current char i+1 is next
            if (newArray.get(i).charAt(0) == newArray.get(i+1).charAt(0)){
                newArray.set(i, newArray.get(i) + newArray.get(i+1));
                newArray.remove(newArray.get(i+1));
                i--;
            }
        }

        return newArray.toArray(new String[0]);
    }
    }




