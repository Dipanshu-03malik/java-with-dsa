import java.util.*;
public class mergearray {
    public static void main(String[] args) {
        @SuppressWarnings("resource")                                                                                                                                                             
        Scanner sc = new Scanner(System.in);
        int size1=sc.nextInt();
        int [] arr=new int [size1];
        for(int i=0;i<size1;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int size2=sc.nextInt();
        int [] arr2=new int [size1];
        for(int i=0;i<size2;i++)
        {
            arr2[i]=sc.nextInt();
        }
        Arrays.sort(arr2);
        int size3=size1+size2;
        int [] newarr=new int [size3];
        int i=0,j=0,k=0;
        for(;i<size1 && j<size2;)
        {
            
            if (arr[i]<arr2[j])
            {
                newarr[k]=arr[i];
                i++;
            }
            else
            {
                newarr[k]=arr2[j];
                j++;
            }
            k++;
        }
        for(;i<size1;i++)
        {
            newarr[k]=arr[i];
            k++;
        }
        for(;j<size2;j++)
        {
            newarr[k]=arr[j];
            k++;
        }
        // Arrays.sort(newarr);
        for(int l=0;l<(size3);l++)
        {
            System.out.println(newarr[l]);
        }
        System.out.println();
        sc.close();
    }
}