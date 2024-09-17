// import java.util.HashSet;
import java.util.*;

public class MissingElementInSortedArray {
    public static int missingele(int arr[],int n)
    {
        Arrays.sort(arr);
        HashSet<Integer> hashSet = new HashSet<Integer>(); 
        for (int i = 0; i < n-1; i++) {
            hashSet.add(arr[i]);
        }
        for (int i = 1; i <= n; i++) {
            if (!hashSet.contains(i)) {
                return i;
            }
        }
        return n+1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size= sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter array");
        for (int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int missingno=missingele(arr,size);
        System.out.println("Missing no  is"+missingno);
        sc.close();
    }
}
