package com.yuanhang.interview_questions;

import java.util.Arrays;
import java.util.Comparator;



public class Main {
    public static void main(String[] args){
        String [] sa = {"one", "two", "three", "four"};
        Arrays.sort(sa);
        for(String s : sa){
            System.out.print(s + " ");
        }
        System.out.println("\none = " + Arrays.binarySearch(sa, "one"));
 
        System.out.println("now reverse sort");
        ReSortComparator rs = new ReSortComparator();
        Arrays.sort(sa, rs);//re-sort the array using the Comparator. sort(sa, rs)
        for(String s : sa){
            System.out.print(s + " ");
        }
        System.out.println("\none = " + Arrays.binarySearch(sa, "one"));//doesn't pass the binarySearch() method the Comparator we used to sort the array, so get an incorrect answer
        System.out.println("one = " + Arrays.binarySearch(sa,"one", rs));//passing the Comparator to binarySearch(), so get correct answer
    }
    static class ReSortComparator implements Comparator<String>{//define the Comparator, it's ok for this to be an inner class
        public int compare(String a, String b){
            return b.compareTo(a);
        }		
    }
}