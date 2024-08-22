import java.util.Scanner;

public class runningsumofarray {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter size");
            int size = sc.nextInt();
            System.out.println("enter elements");
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            int sum=0;
            int[] arr2 = new int[size];
            for(int i=0;i<size;i++)
            {
                sum=sum+arr[i];
                arr2[i]=sum;

            }
            System.out.println(sum);
            for (int i = 0; i < size; i++) {
                System.out.print(arr2[i] + " ");
            }
            sc.close();
    }
}
