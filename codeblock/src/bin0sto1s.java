
import java.util.*;
public class bin0sto1s{
    public static int bintostr(String str)
    {
        int result= Character.getNumericValue(str.charAt(0));
        for(int i=1;i<str.length();i +=2)
        {
            char ch=str.charAt(i);
            int nextDigit=Character.getNumericValue(str.charAt(i+1));
            switch (ch) {
                case 'A': 
                    result = result & nextDigit;
                    break;
                case 'B': 
                    result = result | nextDigit;
                    break;
                case 'C': 
                    result = result ^ nextDigit;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operation character: " +ch);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        // System.out.println("hello, world");
        Scanner sc= new Scanner(System.in); 
        System.out.print("Enter a string: ");  
        String str= sc.nextLine();
        int result = bintostr(str); 
        System.out.println("The result of the binary string operation is: " + result);   
        sc.close();
    }
}
