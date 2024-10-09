/*
 Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same.If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result. It does not matter what you leave beyond the first k elements.Note: Return k after placing the final result in the first k slots of the array.

 Example 1:
Input:
 arr[1,1,2,2,2,3,3]

Output:
 arr[1,2,3,_,_,_,_]
 */
package TCS_NQT_QUES;

import java.util.Arrays;
import java.util.Scanner;

public class Q9 {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        System.out.println("Enter the array:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int result = removeDuplicates(arr);
        System.out.print("Resulting array: ");
        for (int i = 0; i < result;i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i =result; i < size; i++)
        {
            System.out.print("_ ");
        }
        System.out.println();
        sc.close();
    }
}
