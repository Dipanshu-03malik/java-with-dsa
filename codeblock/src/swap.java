import java.util.Scanner;
public class swap{
    // public static void main (String[] args){
    //     int a,b;
    //     Scanner sc= new Scanner(System.in);
    //     a =sc.nextInt();
    //     Scanner sc= new Scanner(System.in);
    //     b= sc.nextInt();
    //     fun1(a,b);
    //     sc.close();
    // }
    // public static void fun1(int x,int y){
    //     int temp=x;
    //     x=y;
    //     y=temp;
    //     System.out.println("the a is now"+x+"b is now"+y);
    //     return(x,y);
    // }
    public static void main (String[] args){
        int a,b;
        Scanner sc= new Scanner(System.in);
        a =sc.nextInt();
        // Scanner sc= new Scanner(System.in);
        b= sc.nextInt();
        int c=fun1(a,b);
        a=c-a;
        b=c-b;
        System.out.println("the a is now"+a+"b is now"+b);

        sc.close();
    }
    public static int fun1(int x,int y){
        int sum=x+y;
        // System.out.println("the a is now"+x+"b is now"+y);
        return sum;
    }
}