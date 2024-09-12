import java.util.Scanner;

public class shoppinggame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of test cases:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            System.out.println(winner(M, N));
        }
        sc.close();
    }
    
    public static String winner(int M, int N) {
        int Aayush = 0;  
        int Harshit = 0; 
        int temp = 1; 
        
        while (true) {
            if (temp % 2 != 0) { 
                Aayush += temp;
                if (Aayush > M) { 
                    return "Harshit";
                    
                }
            } else {
                Harshit += temp;
                if (Harshit > N) { 
                    return "Aayush";
                }
            }
            temp++;
        }
    }
}
