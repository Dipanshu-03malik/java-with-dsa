import java.util.Scanner;

public class reverse_array{
    public static void main(String[] args) {
        int [] arr=new int [100];
        Scanner sc= new Scanner(System.in);
        // int n;
        System.out.println("enter size of array");
        
            
        int p=sc.nextInt();
        
        for(int k=0;k<p;k++){
            arr[k]= sc.nextInt();
        }
        // int j=4;
    
        for(int m=0;m<p/2;m++){
            int temp=arr[m];
            arr[m]=arr[p-1-m];
            arr[p-1-m]=temp;
        }
        for(int j=0;j<p;j++){
            System.out.println(arr[j]);

        }
        
        sc.close();
    }
}
