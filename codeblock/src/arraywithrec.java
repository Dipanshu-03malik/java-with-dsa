import java.util.Scanner;

public class arraywithrec {
    public static void Main(int[]arr,int index)
    {   if(index==arr.length)
        {
            return ;
        }
        System.out.println(arr[index]);
        Main(arr,index+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr=new int [size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int index=0;
        Main(arr,index);
        sc.close();
    }
}
