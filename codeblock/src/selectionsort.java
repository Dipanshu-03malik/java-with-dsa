import java.util.Scanner;

public class selectionsort {
    public static void SELECTIONSORT(int[]arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min])
                {
                    min = j;
                }

            }
            int temp= arr[min];
            arr[min]=arr[i];
            arr[i]=temp;

        }
        System.out.println("Sorted Array:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size:");
        int size= sc.nextInt();
        System.out.println("enter the array:");
        int [] arr = new int[size];
        for (int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        SELECTIONSORT(arr);
        sc.close();
    }
}
