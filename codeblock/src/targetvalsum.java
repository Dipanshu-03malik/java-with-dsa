import java.util.*;

public class targetvalsum {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("emter text cases ");
        int testcase=sc.nextInt();
        for(int l=1;l<=testcase;l++){
        System.out.println("enter size of array");

        int size= sc.nextInt();
        int [] arr=new int [size];
        System.out.println("enter array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        // int temp;
        Arrays.sort(arr);
        // for(int i=0;i<size-1;i++)
        // {
        //     for(int j=i+1;j<size;j++){
        //     temp=arr[i]+arr[j];
        //     if(temp==target)
        //     {
        //         System.out.println("the sum of"+arr[i]+"and"+arr[j]+"is equa; to target");
        //     }
        // }
        // }
        
        int i=0,j=arr.length-1,price=0,price1=0;
        int temp=Integer.MAX_VALUE;

            while(i<j)
            {
            int sum=arr[i]+arr[j];
            if(sum>target)
            {
                j--;
            }
            else if(sum<target)
            {
                i++;
            }
            else
            {   int neww= arr[j]-arr[i];
                if(neww<=temp){
                    temp=neww;
                    price=arr[i];
                    price1=arr[j];
                }
                j--;
                i++;
            }
            }
        System.out.println("the sum of"+price+"and"+price1+"is equa; to target");
        if (testcase < l - 1) {
            System.out.println();
        }
        
    }
    
    
        sc.close();
    }
    }

