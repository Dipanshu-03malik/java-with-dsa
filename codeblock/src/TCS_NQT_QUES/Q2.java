//Given  an array of integer nums and an integer k, return the number of unique diff pairs in array
package TCS_NQT_QUES;

import java.util.Scanner;

public class Q2 {
    public static int fun(int [] arr,int k)
    {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) == k) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size= sc.nextInt();
        System.out.println("Enter the array: ");
        int [] arr = new int [size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter k element");
        int k=sc.nextInt();
        int result=fun(arr,k);
        System.out.println(result);
        sc.close();
    }
}
