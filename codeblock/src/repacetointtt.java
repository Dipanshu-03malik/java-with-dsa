import java.util.Scanner;

public class repacetointtt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int a = scanner.nextInt();
        boolean isNegative = a < 0;
        if(isNegative==true){
            a=Math.abs(a);
        }
        int temp = 0;
        int placeValue = 1;

        while (a > 0) {
            int digit = a % 10;
            if (digit == 0) {
                temp += 5 * placeValue;
            } else {
                temp += digit * placeValue;
            }
            placeValue *= 10;
            a/= 10;
        }
        if (isNegative) {
            temp = -temp;
        }

        System.out.println("Number after replacing 0 with 5: " + temp);

        scanner.close();
    }
}
