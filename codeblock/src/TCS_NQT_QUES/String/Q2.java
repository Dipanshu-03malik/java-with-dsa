/*
 Problem Statement: Given a string, write a program to remove all the whitespaces from the string.

Example 1:
Input: str = “Take you forward” 
Output: Takeyouforward
Explanation: After removing all the whitespaces Takeyouforward is the result
 */
package TCS_NQT_QUES.String;

public class Q2 {
    public static void main(String[] args) {
        String str ="TAKE YOU FORWARD";
        String results="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) != ' ')
            {
                results+= str.charAt(i);
            }
        }
        System.out.println(results);

    }
}
