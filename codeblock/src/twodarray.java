import java.util.Scanner;

public class twodarray {
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
        for(int i=0;i<m;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<n;j++){
                    System.out.print(arr[j][i]+" ");
  
                }
            }
            else
            {
                for(int j=n-1;j>=0;j--){
                    System.out.print(arr[j][i]+" ");
  
                }
            }
        }
        sc.close();
        
    }
    }
