import java.util.Scanner;

public class inverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr=new int [size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < size ; i++) {
            int temp = arr[i];
            arr[i] = arr[size - 1 - i];
            arr[size - 1 - i] = temp;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
