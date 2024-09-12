import java.util.Scanner;

public class Carrycount{

    public static int NumberOfCarries(int num1, int num2) {
        int carryCount = 0;
        int carry = 0;
        
        while (num1 > 0 || num2 > 0 || carry > 0) {
            int digit1 = num1 % 10;
            int digit2 = num2 % 10;
            
            int sum = digit1 + digit2 + carry;
            
            if (sum > 9) {
                carryCount++;
                carry = 1;
            } else {
                carry = 0;
            }
            
            num1 /= 10;
            num2 /= 10;
        }
        
        return carryCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        int result = NumberOfCarries(num1, num2);
        System.out.println("Number of carries: " + result);
        
        scanner.close();
    }
}
