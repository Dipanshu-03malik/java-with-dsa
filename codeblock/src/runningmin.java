import java.util.Scanner;

public class runningmin {
    public static void main(String[] args) {
        int [] arr=new int [7];
        Scanner sc= new Scanner(System.in);
        System.out.println("enter array...");
        for(int i=0;i<7;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(int i=1;i<7;i++){
            
            for(int j=0;j<7;j++){
                if(min<arr[j])
                {
                    min= arr[j];
                }

            }
            arr[i]=min;
            
        }
        for(int i=0;i<7;i++)
        {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
