// import java.util.Scanner;
// public class running_max {
//     static void run_max(int []a,int r,int e){
//         int j=a.length;
//         int max=0;
//         for(int i=r;i<=e;i++){
//             max=a[i];
//             for(int l=0;l<=i;l++){
//                 if(max<a[l]){
//                     max=a[l];
//                 }
//             }
//         }
//         System.out.println("The max is :"+max);
//         for(int i=0;i<j;i++){
//             if(a[i]==max){
//                 System.out.println("The index is :"+i);
//             }
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the size of array");
//         int size= sc.nextInt();
//         System.out.println("Enter the elements of array");
//         int [] a= new int[size];
//         for(int i=0;i<size;i=i+1)
//         {
//             a[i]=sc.nextInt();
//         }
//         System.out.println("Enter the stating & Ending range");
//         int st_range=sc.nextInt();
//         int e_range=sc.nextInt();
//         run_max(a,st_range,e_range);
//         sc.close();
//     }
// }

