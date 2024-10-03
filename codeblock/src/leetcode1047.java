import java.util.Scanner;
import java.util.Stack;

public class leetcode1047 {
     public static String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!st.isEmpty() && st.peek() == ch) {
                st.pop();
            } else {
                st.push(ch);
            }
        }
        char[] str = new char[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            str[i] = st.pop();
        }
        return new String(str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        System.out.println("Result: " + removeDuplicates(input));
        sc.close();
    }
}
