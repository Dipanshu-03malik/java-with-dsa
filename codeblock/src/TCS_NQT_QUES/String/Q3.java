/*
 *Problem Statement: Given a String, write a program to remove vowels from a given String.

Examples:

Example 1:
Input: Str = “take u forward”
Output: tk  frwrd
Explanation: All vowels are removed from the given String.

 */
package TCS_NQT_QUES.String;

public class Q3 {
    public static void main(String[] args) {
        String str ="TAKE YOU FORWARD";
        String results="";
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U' && ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') 
            {
                results+= str.charAt(i);
            }
        }
        System.out.println(results);

    }
}
