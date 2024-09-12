// // import java.util.Scanner;

// import java.util.Scanner;

// public class rotatingarray {
   
//     public static void Rotatetoright(int[] arr, int n, int k) {
//         int[] temp = new int[k];
//         for (int i = n - k; i < n; i++) {
//           temp[i - n + k] = arr[i];
//         }
//         for (int i = n - k - 1; i >= 0; i--) {
//           arr[i + k] = arr[i];
//         }
//         for (int i = 0; i < k; i++) {
//           arr[i] = temp[i];
//         }
//       }
//       public static void main(String args[])
//     {
//         int n = 7;
//         int [] arr=new int [7];
//         Scanner sc= new Scanner(System.in);
//         System.out.println("enter array.......");
//         for(int i=0;i<7;i++){
//             arr[i]=sc.nextInt();
//         }
//         int k = 3;
//         Rotatetoright(arr, n, k);
//         System.out.println("After Rotating the elements to right..........");
//         for (int i = 0; i < n; i++) {
//           System.out.print(arr[i] + " ");
//         }
//         sc.close();
    
//     }
// }
class rotatingarray {
    public static void rotate(int[] nums, int k,int n) {
        int[] temp = new int[k];
        for (int i = n - k; i < n; i++) {
          temp[i - n + k] = nums[i];
        }
        for (int i = n - k - 1; i >= 0; i--) {
          nums[i + k] = nums[i];
        }
        for (int i = 0; i < k; i++) {
          nums[i] = temp[i];
        }
    }
      public static void main(String args[])
    {
        int n = 7;
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums, n, k);
        System.out.println("After Rotating the elements to right..........");
        for (int i = 0; i < n; i++) {
          System.out.println(nums[i] + " ");
        }
        
    
    }
}