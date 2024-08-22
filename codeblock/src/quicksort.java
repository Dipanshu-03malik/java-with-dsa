import java.util.Scanner;

public class quicksort {
    public static int partition(int []ar1,int start,int end)  // range ki last value pivot ki trh use krke usko uski position pr pohchake return krra h uska index;
    {
        int pivot=ar1[end];
        int index=start;            //choti value ko jiske sath swap krna h
        for(int i=start;i<end;i++)
        {
            if(ar1[i]<pivot)       
            {
                int temp=ar1[index];
                ar1[index]=ar1[i];
                ar1[i]=temp;
                index++;

            }
            else
            {
                continue;
            }
        }
        int temp=ar1[index];            //vha swap hora h jha pivot ke left sare chote aur right sare bde.
        ar1[index]=pivot;
        ar1[end]=temp;

        return index;
    }
    public static void quick(int [] ar,int st,int en)
    {
        if(st>=en)
        {
            return;
        }
        int index=partition(ar,st,en);

        quick(ar,st,index-1);
        quick(ar,index+1,en);
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int size= s.nextInt();
        int [] arr=new int[size];
        System.out.println();

        for(int i=0;i<size;i++)
        {
            arr[i]=s.nextInt();
        }

        // function call
        quick(arr,0,arr.length-1);           
        
        // print output
        System.out.println();
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        s.close();
    }
}