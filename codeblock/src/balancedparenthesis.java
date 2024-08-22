import java.util.Scanner;

public class balancedparenthesis {
    public static void paren(int n,int n2,String an)
    {   
        if(n2<0 || n<0)//negatve
        {
            return;
        }
        if(n2==0 && n==0)///main
        {
            System.out.println(an);
            return;
        }
        if(n>n2)//backtracking
        {
            return;
        }
        // an=an+"(";
        // an=an+")";
        
        // paren(n, n2+1, an);
        paren(n-1, n2, an+"(");
        paren(n, n2-1, an+")");
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        paren(n,n,"");
        sc.close();
    }
}
