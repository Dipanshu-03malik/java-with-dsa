/*
 Problem Statement –

A chocolate factory is packing chocolates into the packets. The chocolate packets here represent an array  of N number of integer values. The task is to find the empty packets(0) of chocolate and push it to the end of the conveyor belt(array).

Example 1 :

N=8 and arr = [4,5,0,1,9,0,5,0].

There are 3 empty packets in the given set. These 3 empty packets represented as O should be pushed towards the end of the array

Input :

8  – Value of N

[4,5,0,1,9,0,5,0] – Element of arr[O] to arr[N-1],While input each element is separated by newline

Output:

4 5 1 9 5 0 0 0

Example 2:

Input:

6 — Value of N.

[6,0,1,8,0,2] – Element of arr[0] to arr[N-1], While input each element is separated by newline

Output:

6 1 8 2 0 0
 */
package TCS_NQT_QUES;

import java.util.Scanner;

public class Q8 {
    public static void fun(int [] arr)
    {
        int n=arr.length;
        int count =0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                arr[count]=arr[i];
                count++;
            }

        }
        for(int i=count;i<n;i++)
        {
            arr[i]=0;
        }
        System.out.print("new array is :");
        for(int i:arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size:");
        int size= sc.nextInt();
        System.out.println("enter the array:");
        int [] arr = new int[size];
        for (int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        fun(arr);
        sc.close();
    }
}
