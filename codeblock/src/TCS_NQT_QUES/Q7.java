//Adding element in an array
package TCS_NQT_QUES;

import java.util.Scanner;

public class Q7 {
    public static int[] fun(int[] arr, int newElement) {
        int n = arr.length;
        int[] newArr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            newArr[i] = arr[i];
        }
        newArr[n] = newElement;
        return newArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the element to add:");
        int newElement = sc.nextInt();
        
        arr = fun(arr, newElement);
        
        System.out.println("Array after adding the new element:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            
        }
        sc.close();
    }
}
