import java.util.*;

public class sqofsortarray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter size");
            int size = sc.nextInt();
            System.out.println("enter elements");
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);

            for(int i=0;i<size;i++)
            {
                arr[i]=arr[i] * arr[i];
            }
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            sc.close();
        }
}
