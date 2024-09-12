/**
 * arraycompareele
 */
import java.util.*;
public class arraycompareele {
    
    public static void main(String[] args) {
    System.out.println("enter size of array");
    Scanner sc= new Scanner(System.in);
    int size= sc.nextInt();
    int [] arr=new int [size];
    System.out.println("enter array");
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    } 
    int temp=0;
    System.out.println("enter size of array2");
    int size2= sc.nextInt();
    int [] arr2=new int [size];
    System.out.println("enter array");
    for(int i=0;i<size;i++){
        arr2[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    Arrays.sort(arr2);
    int j=0;
    for(int i=0;i<size;i++)
    {   
        for( ;j<size2;j++)
        {
            if(arr[i]>arr2[j])
            {
                temp = temp+1;
                // System.out.println("small no are"+temp);
            }
            else{
                break;
            }
        }
        System.out.println(arr[i]+">"+temp);

    }
    sc.close();

    }
    
}