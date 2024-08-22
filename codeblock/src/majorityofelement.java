import java.util.*;

public class majorityofelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr=new int [size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int temp=1;
        for(int i=0;i<size;i++)
        {   
            for(int j=arr[i+1];j<size;j++)
            {
                if(arr[i]==arr[j])
                {   
                    temp=temp+1;
                    if(temp>=(size/3))
                    {
                        System.out.println(arr[j]);
                    }
                }
            }
        }
        sc.close();
    }
}
