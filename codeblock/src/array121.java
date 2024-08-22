import java.util.Scanner;

public class array121 {
    public static void main(String[] args) {
        
        int [] arr=new int [100];
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int sub;
        int max=0;
        System.out.println("enter array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<7;i++){
            for(int j=i+1;j<size;j++){
                sub=arr[j]-arr[i];
                if(sub>max){
                    max = sub;
                    System.out.println("maximim "+sub);
                }
                
            }

        }
        
        sc.close();
    }
}
