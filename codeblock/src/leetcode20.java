import java.util.Scanner;
import java.util.Stack;

public class leetcode20 {
     public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(')');
            } else if (s.charAt(i) == '{') {
                st.push('}');
            } else if (s.charAt(i) == '[') {
                st.push(']');
            } else if (st.isEmpty() || st.pop() != s.charAt(i)) {
                return false;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        System.out.println(isValid(input) ? "Valid" : "Invalid");
        sc.close();
    }
}
