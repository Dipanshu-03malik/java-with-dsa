package pattern;
/* 
4 4 4 4
4 3 3 4
4 4 4 4
*/
import java.util.*;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || i==n-1 || j==0 || j==n-1)
                {
                    System.out.print(n+" ");
                }
                else
                {
                    System.out.print(n-1+" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
