import java.util.Scanner;

public class rotate {
    
        public static void transp(int[][] arr){
        int m=arr.length;
        for( int i=0;i<m;i++)
            {
                for(int j=i+1;j<m;j++)
                {
                    
                        int temp=arr[i][j];
                        arr[i][j]=arr[j][i];
                        arr[j][i]=temp;
                }
                
            }
        for(int k=0;k<m;k++)
        {   int i=m-1;
            for(int j=0;j<i;j++)
            {
                int temp2=arr[k][j];
                arr[k][j]=arr[k][i];
                arr[k][i]=temp2;
                i--;
            }
        }  
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();
        int[][] arr=new int [n][m];
        for(int l=0;l<n;l++){
          System.out.println("Enter the row"+l);
            for(int j=0;j<m;j++)
            {
                arr[l][j]=sc.nextInt();
            
            }
        }
        transp(arr);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}

