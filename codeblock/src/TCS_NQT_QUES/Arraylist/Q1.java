/*
Given an array of integers and an integer sum, return the total number of subarrays whose sum equals to sum.
A subarray is a contiguous non-empty sequence of elements within an array.

Example 1:
Input: nums = [3, 4, –7, 1, 3, 3, 1, 4], sum = 7
Output: 4
([3,4], [3,4,–7,1,3,3], [1,3,3], [3,3,1])

Example 2:
Input: nums = [3 4–7 1 3 3 1 4], sum = 0
Output: 2
([3,4,-7], [1,–7,1,3,3])
 */
package TCS_NQT_QUES.Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
    public static int fun(ArrayList<Integer> arr, int target) {
        int count = 0;
        int size = arr.size();

        for (int i = 0; i < size; i++) {
            int currentSum = 0; 
            for (int j = i; j < size; j++) {
                currentSum += arr.get(j); 

                if (currentSum == target) {
                    count++; 
                    System.out.print("Subarray found: ");
                    for (int k = i; k <= j; k++) {
                        System.out.print(arr.get(k) + " ");
                    }
                    System.out.println(); // Move to the next line after printing the subarray
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println("Enter the target sum:");
        int target = sc.nextInt();

        int result = fun(arr, target);
        System.out.println("Total number of subarrays with sum " + target + " is: " + result);
        
        sc.close();
    }
}
