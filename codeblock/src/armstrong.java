import java.util.*;
public class armstrong {
     public static boolean isArmstrongNumber(int number) {
        int numDigits = (int) Math.log10(number) + 1;
        int sumOfPowers = 0;
        int tempNumber = number;
        while (tempNumber > 0) {
            int digit = tempNumber % 10;
            sumOfPowers += Math.pow(digit, numDigits);
            tempNumber /= 10;
        }
        return sumOfPowers == number;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any no :");
        int No=sc.nextInt();
        System.out.println(isArmstrongNumber(No));
    
    sc.close();
    }
}


