import java.util.*;

public class watertap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter testcase");
        int testcase=sc.nextInt();
        for(int l=1;l<=testcase;l++){
            System.out.println("enter unit of wt");
            int size = sc.nextInt();
            System.out.println("enter wall elements");
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            int i=0;
            int j=size-1;
            int temp=0;
            int leftmax=0,rightmax=0;
            while(i<=j)
            {
                if(arr[i]<=arr[j])
                {
                    if(arr[i]>=leftmax)
                    {
                        leftmax=arr[i];
                    }
                    else
                    {
                        temp +=leftmax-arr[i];
                    }
                    i++;
                }
                else
                {
                    if(arr[j]>=rightmax)
                    {
                        rightmax=arr[j];
                    }
                    else
                    {
                        temp +=rightmax-arr[j];
                    }
                    j--;
                }
            }
            System.err.println(temp);
        }
        sc.close();
    }
}
