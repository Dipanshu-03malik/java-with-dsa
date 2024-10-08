// sum of unique element of array
package TCS_NQT_QUES;

import java.util.Scanner;

public class Q3 {
    public static void fun(int []arr)
    {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            boolean isunique=true;
            for(int j=0;j<n;j++)
            {
                if (arr[i] == arr[j] && i != j)
                {
                    isunique = false;
                    break;
                }
            }
            if (isunique) {
                sum += arr[i];
            }
            
        }
        System.out.println(sum);
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
