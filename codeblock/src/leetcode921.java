import java.util.Scanner;

public class leetcode921 {
    public static int minAddToMakeValid(String s)
    {
        int openNeeded = 0;  
        int closeNeeded = 0; 
        for (char c : s.toCharArray()) 
        {
            if (c == '(') 
            {
                closeNeeded++;  
            }
            else if (c == ')') 
            {
                if (closeNeeded > 0) 
                {
                    closeNeeded--;  
                } 
                else 
                {
                    openNeeded++; 
                }
            } 
            else {
                System.out.println("Invalid character encountered: " + c);
                return -1; 
            }
        }

        return openNeeded + closeNeeded;  
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter a string of parentheses:");
        String input = sc.nextLine();  
        
        int result = minAddToMakeValid(input);
        
        if (result != -1) {
            System.out.println("Minimum number of moves to make the string valid: " + result);
        } else {
            System.out.println("Please enter a valid parentheses string.");
        }
        
        sc.close();
    }
}
