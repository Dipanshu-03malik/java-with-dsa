import java.util.Scanner;

public class repeatarray {
    public static void main(String[] args) {
        int [] arr=new int [100];
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array");
        int size= sc.nextInt();
        System.out.println("enter array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=1;j<size;j++)
        {
            for(int i=0;i<size-1;i++)
            {
                if(arr[i]>arr[i+1])
                {
                    int temp2=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp2;
                }
            }
        }
        System.out.println("sorted array :");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+"  ");
        }
        int temp=0;
        for(int i=0;i<size;i++){
            if(arr[i]==arr[i+1])
            {
                temp=temp+1;
                arr[0]=arr[i+1];
                for(int j=arr[0];j<size;j++)
                {
                    if(arr[j]==arr[j+1])
                    {
                        temp =temp+1;
                        if(temp==3)
                        {
                            System.out.println("the repeated no in arraye more than 3 is...."+arr[j]);
                        }
                       
                    }

                }
            }
            sc.close();
        }

    }
}
