import java.util.Scanner;

public class printseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int N1 = sc.nextInt();

        System.out.println("Enter the no to left:");
        int N2 = sc.nextInt();

        generateSeries(N1, N2);

        sc.close();
    }

    public static void generateSeries(int N1, int N2) {
        int count = 0; 

        for (int n = 1; count < N1; n++) {
            int term = 3 * n + 2;
            if (term % N2 != 0) {
                System.out.print(term + " ");
                count++;
            }
        }
    }
}
