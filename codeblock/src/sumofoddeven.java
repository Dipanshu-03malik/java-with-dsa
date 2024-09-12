import java.util.*;
public class sumofoddeven {
    public static void main(String[] args) {
        int [] arr=new int [100];
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array");
        int size= sc.nextInt();
        System.out.println("enter array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("sum of odd array :");
        int sumod=0;
        for(int j=1;j<size;j=j+2){
            sumod=sumod+arr[j];
        }
        System.out.println("sum is"+sumod);
        System.err.println("sum of even array :");
        int sumev=0;
        for(int j=0;j<size;j=j+2){
            sumev=sumev+arr[j];
        }
        System.out.println("sum of even array is;"+sumev);
        sc.close();

    }
    
}
