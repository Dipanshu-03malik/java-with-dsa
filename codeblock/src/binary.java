import java.util.*;
public class binary {
    public static void main(String args[]) {
        System.out.println("enter size of array");
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int [] arr=new int [size];
        System.out.println("enter array");
        for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
        }
        System.out.println("enter no u want to search");
        int value=sc.nextInt();
        int low=0,high=arr.length-1;
    while(low<high)
    {   int mid=(low+high)/2;
        if(value==arr[mid])
        {   int k=mid;
            while(arr[k]==value){
                k--;
            }
            System.out.println("value found at"+(k+1));
            break;
        }
        else if(value>arr[mid])
        {
            low=mid+1;
        }
        else
        {
            high=mid-1;
        }
    }
    sc.close();
}
}     
