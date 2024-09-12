import java.util.*;
public class nobita {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter trestcases");
        int T=sc.nextInt();
        for(int i=0;i<T;i++)
        {
            System.out.println("enter the no of candel nobita take to his mom");
            int X=sc.nextInt();
            System.out.println("enter nobita friend");
            int N=sc.nextInt();
            int temp=0;
            int mod=X%N;
            if(mod>0)
            {
                temp=mod;
                System.out.println(temp);
            }
            else{
                System.out.println(temp);
            }
        }
        sc.close();
    }
}
