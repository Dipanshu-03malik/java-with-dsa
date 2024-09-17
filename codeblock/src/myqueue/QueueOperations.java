package myqueue;

import java.util.Scanner;

public class QueueOperations {
    public static boolean valid(int [] arr)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
            {
                count ++;
            }
            else
            {
                if (count == 0) 
                {
                    return false;
                }
                count--;
            }
        }
        return true;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        int testcase=sc.nextInt();
        for(int i=0;i<testcase;i++)
        {
            int size = sc.nextInt();
            
            int [] arr = new int [size];
            for(int j=0;j<size;j++)
            {
                arr[j]=sc.nextInt();
            }
            if (valid(arr)) 
            {
                System.out.println("Valid");
            } 
            else 
            {
                System.out.println("Invalid");
            }
        }
        sc.close();
    }
}
