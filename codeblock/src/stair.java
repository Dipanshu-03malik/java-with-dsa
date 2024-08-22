import java.util.Scanner;

public class stair {
    public static void stair2(int n,String str)
    {
        if(n==0)
        {
            System.out.println(str);
            return;
        }
        if(n<0)
        {
            return;
        }
        // stair2(n-1,str+"1");
        // stair2(n-2,str+"2");
        // stair2(n-3,str+"3");
        // stair2(n-4,str+"4");
        // stair2(n-5,str+"5");
        // stair2(n-6,str+"6");
        for (int i=1;i<=6;i++)
        {
            stair2(n-i,str+i);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int stair=sc.nextInt();
        stair2(stair,"");
        sc.close();
    }
}
