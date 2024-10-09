/*
 Problem Statement – Given a string S(input consisting) of ‘*’ and ‘#’. The length of the string is variable. The task is to find the minimum number of ‘*’ or ‘#’ to make it a valid string. The string is considered valid if the number of ‘*’ and ‘#’ are equal. The ‘*’ and ‘#’ can be at any position in the string.
Note : The output will be a positive or negative integer based on number of ‘*’ and ‘#’ in the input string.

                                        (*>#): positive integer
                                        (#>*): negative integer
                                        (#=*): 0
Example 1:
Input 1:

###***   -> Value of S
Output :

0   → number of * and # are equal
 */
package TCS_NQT_QUES.String;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        int count1=0,count2=0;
        String str = sc.next();
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch=='*')
            {
                count1++;
            }
            else if( ch=='#')
            {
                count2++;
            }
            else{
                System.out.println("INVALID INPUT");
                return;
            }
            
        }
        System.out.println(count1-count2);
        
    }
    
}
