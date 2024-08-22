import java.util.Scanner;

public class insertion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int [size];
        for(int j=0;j<size;j++)
            {
                arr[j]=sc.nextInt();
            
            }
        for(int i=1;i<size;i++)
        {
            int j=i-1;
            int temp=arr[i];
            while (j>=0&&arr[j]>temp)
            {
                    arr[j+1]=arr[j];
                    j--;
            }
            arr[j+1]=temp;
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sc.close();
    }
}
