import java.util.Scanner;
public class sumofarray{
    public static void main(String[] args) {
        int [] arr=new int [7];
        Scanner sc= new Scanner(System.in);
        System.out.println("enter arrray");
        for(int i=0;i<7;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("sum is");
        int sum=0;
            for(int j=sum;j<7;j++){
                sum=sum+arr[j];
                System.out.println(sum);
            }
    sc.close();
}
}