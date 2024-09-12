import java.util.*;
public class maximuofeq {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter value you want to compare");
//         int N=sc.nextInt();
//         int x=0;
//         for(int i=1;i<N;i++)
//         {
//             if((i*i)>N)
//             {
//                 x=i-1;
//                 break;
//             }
//         }
//         System.out.println(x);
//         sc.close();
//     }
// }
// import java.util.Scanner;

/**
 * maxofeqwithbinary
 */

//     public static void main(String[] args) {
//          Scanner sc=new Scanner(System.in);
//         System.out.println("enter value you want to compare");
//         int N=sc.nextInt();
//         int x=0;
//         int low=1,high=N-1;
//         while(low<=high)
//     {   int mid=(low+high)/2;
//         if(mid*mid>N)
//         {   
//             high=mid-1;      
//         }
//         else{
//             x=mid;
//             low=mid+1;
//         }
        
//     }
//     System.out.println("value "+x);
    
//     sc.close();
// }
// }
/*recursive */
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value you want to compare:");
    int N = sc.nextInt();
    int result = fun(N,1, N - 1);
    System.out.println("Value: " + result);
    sc.close();
}

public static int fun(int N, int low, int high) {
    if (low > high) {
        return high;
    }
    int mid = (low + high) / 2;
    if (mid * mid == N) {
        return mid;
    } else if (mid * mid < N) {
        return fun(N, mid + 1, high);
    } else {
        return fun(N, low, mid - 1);
    }
}
}