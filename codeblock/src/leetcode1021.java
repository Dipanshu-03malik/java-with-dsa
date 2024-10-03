import java.util.Scanner;

public class leetcode1021 {
    public static String removeOuterParentheses(String s) {
        String str = "";
        char[] a = s.toCharArray();
        int n = a.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == '(') {
                if (count > 0) {
                    str += "(";
                }
                count++;
            } else {
                count--;
                if (count > 0) {
                    str += ")";
                }
            }
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        System.out.println("Result: " + removeOuterParentheses(input));
        sc.close();
    }
}
