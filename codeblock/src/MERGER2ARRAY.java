import java.util.Arrays;
import java.util.Scanner;

/**
 * MERGER2ARRAY
 */
public class MERGER2ARRAY {
    public static void Mergearr(int arr[],int arr2[])
    {
        Arrays.sort(arr);
        Arrays.sort(arr2);
        int n= arr.length;
        int [] arr3= new int [n+n];
        int i = 0, j = 0, k = 0;
        while (i < n && j < n) {
            if (arr[i] <= arr2[j]) {
                arr3[k++] = arr[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }
        while (i < n) {
            arr3[k++] = arr[i++];
        }
        while (j < n) {
            arr3[k++] = arr2[j++];
        }
        System.out.println(Arrays.toString(arr3));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Arr");
        int size=sc.nextInt();
        System.out.println("enter element of arr");
        int [] arr = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter element of arr2");
        int [] arr2 = new int[size];
        for(int i=0;i<size;i++)
        {
            arr2[i]=sc.nextInt();
        }
        Mergearr(arr,arr2);
        sc.close();
    }
}