import java.util.*;
public class Main {
    static void pairsum(int [] a, int t)
    {
    int i = 0;
    int j = a.length-1;
    while (i < j)
    {
        int sum=a[i]+a[j];
        if(sum > t) 
        {
            j--;
        }
        else if(sum < t)
        {
            i++;
        }
        else
        {
            System.out.println ( a[i] +" prime prime and "+a[j]);
            j--;
            i++;
        }
    }

}
public static void main(String args[]) 
{ 
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    int []a=new int[n]; 
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    Arrays.sort(a);
    int target=sc.nextInt();
    pairsum(a,target);
    sc.close();
    }
}
