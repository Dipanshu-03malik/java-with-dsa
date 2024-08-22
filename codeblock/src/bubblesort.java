import java.util.Scanner;;
public class bubblesort {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int [] ar=new int[size];
        for(int i=0;i<size;i++)
        {
            ar[i]=s.nextInt();
        }
        for(int j=1;j<size;j++)
        {
            for(int i=0;i<size-1;i++)
            {
                if(ar[i]>ar[i+1])
                {
                    int temp=ar[i];
                    ar[i]=ar[i+1];
                    ar[i+1]=temp;
                }
            }
        }
        System.out.println(" Bubble sort:");
        for(int i=0;i<size;i++)
        {
            System.out.print(ar[i]+"  ");
        }
        s.close();
    }
} 
