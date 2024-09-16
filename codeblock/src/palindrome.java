import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        int len=str.length();
        for(int i=0;i<len/2;i++)
        {
            if (str.charAt(i) != str.charAt(len - i - 1)) 
            {
                 break;
            }
            else
            {
                System.out.println(str+" is palindrome ");
            }
        }
     
    }
    
}
