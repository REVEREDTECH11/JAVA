package org.example;// ========================================================================
// CSCI 3230 Data Structures
// Instructor: Yao Xu, Ph.D.
//
// Coding Quiz 7
//
// =========================== Requirements =============================== 
// Implement two versions of the quicksort algorithm, one using Hoare's 
// partition and the other using Lomuto's partition, to sort elements of 
// an ArrayList for generic data types.
// 
// You will need to complete the method bodies of:
// 		int partitionHoare(ArrayList<E> list, int l, int r)
//		int partitionLomuto(ArrayList<E> list, int l, int r)
//
// Your output may look as follows:
// ------------------------------------------------------------------------
// Original list: [3, 5, 2, 4, 1, 8, 7, 6, 9]
// Hoare's quicksort: [1, 2, 3, 4, 5, 6, 7, 8, 9]
// Lomuto's quicksort: [1, 2, 3, 4, 5, 6, 7, 8, 9]
// 
// Original list: [s, o, r, t, i, n, g]
// Hoare's quicksort: [g, i, n, o, r, s, t]
// Lomuto's quicksort: [g, i, n, o, r, s, t]
//
// ============================== Note ====================================
//
// 1. DO NOT MODIFY OR DELETE ANY GIVEN CODE OR COMMENTS!!!
// 2. You ONLY need to write code under each comment "YOUR CODE GOES HERE".
// 3. Modify the file name to "org.example.Quicksort.java" to compile and run.
//
// ========================================================================

import java.util.ArrayList;
import java.util.Collections;

public class Quicksort<E extends Comparable<E>> {
    
    // org.example.Quicksort using Hoare's partition
    public static <E extends Comparable<E>> void quicksortHoare(ArrayList<E> list, int l, int r) {
        // Sort the given ArrayList (of generic type E) into ascendin order
        if (l < r) {
            int p = partitionHoare(list, l, r);
            quicksortHoare(list, l, p);
            quicksortHoare(list, p+1, r);
        }
    }
    
    // org.example.Quicksort using Lomuto's partition
    public static <E extends Comparable<E>> void quicksortLomuto(ArrayList<E> list, int l, int r) {
        // Sort the given ArrayList (of generic type E) into ascending order
        if (l < r) {
            int p = partitionLomuto(list, l, r);
            quicksortLomuto(list, l, p-1);
            quicksortLomuto(list, p+1, r);
        }
    }
    
    // Hoare's partition (always select the first element as the pivot)
    public static <E extends Comparable<E>> int partitionHoare(ArrayList<E> list, int l, int r) {
        // YOUR CODE GOES HERE --Part 1/2--
        E x = list.get(l);

        int i = l - 1;

        int j = r + 1;

        while (true) {

            do {

                i++;

            } while (list.get(i).compareTo(x) < 0);

            do {

                j--;

            } while (list.get(j).compareTo(x) > 0);

            if (i >= j) {

                return j;

            }

            Collections.swap(list, i, j);

        }

    }

    // Lomuto's partition (always select the last element as the pivot)
    public static <E extends Comparable<E>> int partitionLomuto(ArrayList<E> list, int l, int r) {
        // YOUR CODE GOES HERE --Part 2/2--

        int i = l - 1;

        E x = list.get(r);

        for (int j = l; j < r; j++) {

            if (list.get(j).compareTo(x) <= 0) {

                i++;

                Collections.swap(list, i, j);

            }

        }

        Collections.swap(list, i + 1, r);

        return i + 1;

    }


    
    public static void main(String[] args) {
        int[] test1 = {3, 5, 2, 4, 1, 8, 7, 6, 9};
        char[] test2 =  "sorting".toCharArray();    

        // Sort test1 into ascending order
        ArrayList<Integer> hoareInput1 = new ArrayList<Integer>();
        for (int e : test1)
            hoareInput1.add(e);
        ArrayList<Integer> lomutoInput1 = new ArrayList<Integer>(hoareInput1);
        System.out.println("Original list: " + hoareInput1);
        
        // Apply Hoare's quicksort
        quicksortHoare(hoareInput1, 0, hoareInput1.size() - 1);
        System.out.println("Hoare's quicksort: " + hoareInput1);
        // Apply Lomuto's quicksort
        quicksortLomuto(lomutoInput1, 0, lomutoInput1.size() - 1);
        System.out.println("Lomuto's quicksort: " + lomutoInput1);
        System.out.println();

        // Sort test2 into ascending order
        ArrayList<Character> hoareInput2 = new ArrayList<Character>();
        for (char e : test2)
        	hoareInput2.add(e);
        ArrayList<Character> lomutoInput2 = new ArrayList<Character>(hoareInput2);        
        System.out.println("Original list: " + lomutoInput2);
        
        // Apply Hoare's quicksort
        quicksortLomuto(hoareInput2, 0, hoareInput2.size() - 1);
        System.out.println("Hoare's quicksort: " + hoareInput2);
        // Apply Lomuto's quicksort
        quicksortHoare(lomutoInput2, 0, lomutoInput2.size() - 1);
        System.out.println("Lomuto's quicksort: " + lomutoInput2);
        System.out.println();

    }
}
