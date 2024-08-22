import java.util.*;
public class linsearch {
    public static int lineSrc(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        System.out.println("enter size of array");
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int [] arr=new int [size];
        System.out.println("enter array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter no u want to search");
        int value=sc.nextInt();
        int index=lineSrc(arr,value);
        
        if (index != -1) {
            System.out.println("Element " +value + " found at index: " + index);
        } else {
            System.out.println("Element " + value+ " not found in the array.");
        }
        sc.close();
    }
}

