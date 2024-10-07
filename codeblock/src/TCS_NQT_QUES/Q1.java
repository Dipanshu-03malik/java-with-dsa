//CHECK NO IS DIVISIBLE BY 3 OR NOTE

package TCS_NQT_QUES;

import java.util.Scanner;

public class Q1 {
    public static boolean fun(int no)
    {
        int sum=0;
        while(no>0)
        {
            int digit=no%10;
            sum +=digit;
            no=no/10;
        }
        if(sum %3==0)
        {
            return true;
        }
        else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        int number=sc.nextInt();
        boolean result=fun(number);
        System.out.println(result);
        sc.close();
    }
}
