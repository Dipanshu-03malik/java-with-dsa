import java.util.Scanner;

public class productofarrayexceptself {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int size = sc.nextInt();
        System.out.println("enter elements");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) 
        {
            arr[i] = sc.nextInt();
        }
        int n= size;
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = 1;
        }
        int temp = 1;
        for (int i = 0; i < n; i++) {
            arr2[i] = arr2[i]* temp;
            temp = temp * arr[i];
        }
        int temp2 = 1;
        for (int i = n - 1; i >= 0; i--) {
            arr2[i] = arr2[i]* temp2;
            temp2 = temp2 * arr[i];
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        sc.close();

    }
}
