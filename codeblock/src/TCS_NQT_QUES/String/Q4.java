/*
Remove brackets from an algebraic expression

Write a program to remove brackets from an algebraic expression

Given an algebraic expression, we need to simplify the expression and remove the brackets.

Examples:

Example 1:
Input: “a+((b-c)+d)”
Output: “a+b-c+d”
Explanation: Removed all the brackets in the algebric expression.


 */
package TCS_NQT_QUES.String;

public class Q4 {
    public static void main(String[] args) {
        String str ="a+((b-c)+d)";
        String results="";
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch != '(' && ch != ')') 
            {
                results+= str.charAt(i);
            }
        }
        System.out.println(results);

    }
}
