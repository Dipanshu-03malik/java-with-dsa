import java.util.Scanner;

public class howmanyquestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count=0;
        for(int i=0;i<t;i++)
        {
            System.out.println("enter q of p in 0/1");
            int p=sc.nextInt();
            int v=sc.nextInt();
            int T=sc.nextInt();
            
            int val=p+v+T;
            if(val>=2)
            {
                count++;
            }
        }
        System.out.println(count);
        sc.close();

    }
}
