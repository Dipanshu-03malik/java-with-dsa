import java.util.Scanner;
public class celtofer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit.");
        
        sc.close();
    }
}
 