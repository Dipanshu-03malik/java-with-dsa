import java.util.Scanner;
public class fibonacii {
    public static int fibo(int n)
    {
        
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        int ans1=fibo(n-1);
        int ans2=fibo(n-2);
        return(ans1+ans2);
    }
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int fib=fibo(n);
        System.out.println(fib);
        s.close();
    }

}

