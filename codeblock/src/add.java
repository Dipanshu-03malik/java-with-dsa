import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        int [] arr=new int [7];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<7;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<7;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
        sc.close();
    }
}
