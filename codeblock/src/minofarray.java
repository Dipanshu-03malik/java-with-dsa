import java.util.Scanner;

public class minofarray {
    public static void main(String[] args) {
        int [] arr=new int [7];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<7;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(arr);
        int miofarr=arr[0];
        for(int i=0;i<7;i++){
            if(miofarr>arr[i]){
                miofarr=arr[i];
            }
        }
        System.out.println("minimum of array" + miofarr);
        for(int j=0;j<7;j++){
            if(miofarr==arr[j]){
                System.out.println("index"+j);
            }
        } 
        sc.close();

    }
}
