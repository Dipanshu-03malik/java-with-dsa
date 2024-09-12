import java.util.Scanner;

public class maxofarr {
    public static void main(String[] args) {
        int [] arr=new int [7];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<7;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(arr);
        int mxofarr=arr[0];
        for(int i=0;i<7;i++){
            if(mxofarr<arr[i]){
                mxofarr=arr[i];
            }
        }
        System.out.println("maximum of array" + mxofarr);
        sc.close();

    }
}
