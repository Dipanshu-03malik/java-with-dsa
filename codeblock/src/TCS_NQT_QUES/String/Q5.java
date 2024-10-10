/*
 *Problem Statement: Given a string, calculate the frequency of characters in a string.

Examples:

Example 1:
Input: takeuforward
Output: a2 d1 e1 f1 k1 o1 r2 t1 u1 w1 
Explanation: Count of every character of string is printed.

 */
package TCS_NQT_QUES.String;

public class Q5 {
    public static void main(String[] args) {
        String str = "takeuforward";
        int[] frequency = new int[256];

        for (char ch : str.toCharArray()) 
        {
            frequency[ch]++;
        }

        String result = "";
        for (char ch = 'a'; ch <= 'z'; ch++) 
        {
            if (frequency[ch] > 0) 
            {
                result += ch + "" + frequency[ch] + " ";
            }
        }
        System.out.println(result);
    }
}
