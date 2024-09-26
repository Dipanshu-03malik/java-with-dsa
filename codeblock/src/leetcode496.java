import java.util.Scanner;

public class leetcode496 {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int count=0;
         for(int i=0;i<nums1.length;i++){
             for(int j=0;j<nums2.length;j++){
                 if(nums1[i] == nums2[j]){
                     int temp = nums2[j];
                     count=0;
                     while(j<nums2.length-1){
                         j++;
                         if(nums2[j]>temp){
                             nums1[i] = nums2[j];
                             count++;
                             break;
                         }
                         
                     }
                 }
             }
             if(count == 0){
                 nums1[i] = -1;
             }
         }
         return nums1;
      
     }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size1= sc.nextInt();
        int [] arr1=new int [size1];
        for(int i=0;i<size1;i++)
        {
            arr1[i]=sc.nextInt();
        }
        int size2= sc.nextInt();
        int [] arr2=new int [size2];
        for(int i=0;i<size2;i++)
        {
            arr2[i]=sc.nextInt();
        }
        int[] result =nextGreaterElement(arr1, arr2);
        
        for (int val : result) {
            System.out.print(val + " ");
        }
        
        sc.close();
     }
}
