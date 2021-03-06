package com.interview.array;

import java.util.*;
/*
 * Reference: https://leetcode.com/problems/relative-sort-array/
 * Category: Easy, Tricky
 * Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.

Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2.  Elements that don't appear in arr2 should be placed at the end of arr1 in ascending order.

 

Example 1:

Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
Output: [2,2,2,1,4,3,3,9,6,7,19]
 

Constraints:

1 <= arr1.length, arr2.length <= 1000
0 <= arr1[i], arr2[i] <= 1000
All the elements of arr2 are distinct.
Each arr2[i] is in arr1.
 */
public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int len2 = arr2.length;
        int len1 = arr1.length;
        int start = 0;
        for (int i = 0; i < len2; i++) {

            for (int j = 0; j < len1; j++) {
                if (arr1[j] == arr2[i]) {
                    //System.out.println("2 arra" + arr2[i]);
                    //move it 
                    int temp = arr1[start];
                    arr1[start] = arr1[j];
                    //System.out.println(arr1[start] );
                    start++;
                    arr1[j] = temp;
                } 
                
                
            }
        }
        //after array 2 exhasted
        List<Integer> list = new ArrayList<>();
        for (int j = start ; j < len1; j++) {
            list.add(arr1[j]);
        }
        //sort list
        Collections.sort(list, (a, b) -> {
            return a -b;
        });
        for (int elm : list) {
            arr1[start] = elm;
            start++;
            
        }
        return arr1;
        
    }
}
