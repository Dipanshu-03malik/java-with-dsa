import java.util.Scanner;

public class subarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int [] a= new int[size];
        for(int i=0; i<size ; i++){
            a[i]=sc.nextInt();
        }
        int sum=a[0];
        for(int i=0; i<size; i++){
            // System.out.print(a[i]+',');
            for(int j=i; j<size ; j++){
                int sum1=0;
                for(int k=i; k<=j ; k++){
                    System.out.print(a[k]);
                    sum1=sum1+a[k];
                //System.out.print(",");
                }

                System.out.print(",");
                if(sum1>sum){
                    sum=sum1;
                }
            }
            System.out.println("\n");
        } 
        System.out.println(sum);
        sc.close();
    }
}
