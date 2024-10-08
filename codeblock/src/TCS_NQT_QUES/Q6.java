//Find the count of element whose value is greater then the prior elemem\nt

package TCS_NQT_QUES;

import java.util.Scanner;

public class Q6 {
    public static void fun(int [] arr)
    {
        int count=0;
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            if(arr[i]<arr[i-1])
            {
                count++;
            }
        }
        System.out.println(count);
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

