import java.util.Scanner;

public class linearsercusingrec {
    public static boolean rec(int [] arr,int n,int targer)
    {
        if(arr[n]==targer)
        {
            return true;
        }
        else if(n==arr.length-1)
        {
            return false;
        }
        n++;
        return rec(arr,n,targer);
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr=new int[size];
        for (int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int target=8;
        boolean x=rec(arr,0,target);
        if(x==true)
        {
            System.out.println("target found");
        }
        else{
            System.out.println("not found");
        }
        sc.close();
    }
}
