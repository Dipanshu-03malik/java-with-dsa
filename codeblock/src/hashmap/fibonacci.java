package hashmap;

import java.util.*;

public class fibonacci {
    public static int fibo(int n, HashMap<Integer, Integer> brain)
    {
        
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        if(brain.containsKey(n))
        {
            return brain.get(n);
        }
        int ans1=fibo(n-1,brain);
        int ans2=fibo(n-2,brain);
        brain.put(n,ans1+ans2);
        return(ans1+ans2);
    }
    public static int Fibo_With_ARR(int n,int [] brain)
    {
        //top to bottom
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        if(brain [n]!=0)
        {
            return brain[n];
        }
        int ans1=Fibo_With_ARR(n-1,brain);
        int ans2=Fibo_With_ARR(n-2,brain);
        brain[n]=ans1+ans2;
        return brain[n];
    }
    public static void main(String []args)
    {
        // HashMap<Integer, Integer> brain = new HashMap<>();
        // System.out.println(fibo(5,brain));
        int n=6;
        int [] brain =new int [n+1];
        System.out.println(Fibo_With_ARR(5,brain));

    }
}
