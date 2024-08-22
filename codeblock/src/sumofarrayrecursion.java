import java.util.Scanner;

public class sumofarrayrecursion {
    public static void rev(int [] arr,int n,int j){
        if(n<j){
        int temp=arr[n];
        arr[n]=arr[j];
        arr[j]=temp;
        n++;
        j--;
        rev(arr,n,j);

        }

    }

        // public static int fun(int [] arr,int n)
        // {
        //     // n=arr.length;
        //     int sum=0;
        //     if(n<arr.length)
        //     {
        //         sum=arr[n]+ fun(arr,n+1);
                
        //     }
        //     return sum;
        // }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr=new int[size];
        for (int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        // int sum=fun(arr,0);
        rev(arr,0,size-1);
        // System.out.println(sum);
        sc.close();
    }
}
