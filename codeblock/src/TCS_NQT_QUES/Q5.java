// Find all the palindrome in the range A-B
package TCS_NQT_QUES;

import java.util.Scanner;

public class Q5 {
    public static boolean isPalindrome(int num)
    {
        int orgnum=num;
        int revnum=0;
        while (num>0) 
        {
            int digit = num % 10;
            revnum = revnum * 10 + digit;
            num /= 10;
        }
        return orgnum==revnum;

    }
    public static void fun(int A, int B)
    {
        for(int i=A;i<=B;i++)
        {
            if (isPalindrome(i)) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A:");
        int A = sc.nextInt();
        System.out.println("ENTER B: ");
        int B = sc.nextInt();
        fun(A,B);
        sc.close();
    }
}
