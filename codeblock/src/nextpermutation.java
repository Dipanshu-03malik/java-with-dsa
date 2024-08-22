import java.util.*;

public class nextpermutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        int T=sc.nextInt();
        for (int t=0;t<T;t++) {
            int N = sc.nextInt(); 
            int[] arr = new int[N];
            for (int i=0;i<N;i++) {
                arr[i] = sc.nextInt();
            }
            int i,j;
            for (i=N-2;i>=0;i--) {
                if (arr[i]<arr[i+1]) {
                    break;
                }
            }
            if (i>=0) {
                for (j=N-1;j>i;j--) {
                    if (arr[j]>arr[i]) {
                        break;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            for(int m=0;m<N-1;m++){
                int temp=arr[m];
                arr[m]=arr[N-1-m];
                arr[N-1-m]=temp;
            }
            for (int k=0;k<N; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
