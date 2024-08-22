
import java.util.*;
public class oddevenkejriwal {
    public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int [] cnum=new  int[n];
		for(int i=0;i<n;i++)
		{
			cnum[i]=s.nextInt();
		}
		for(int j=0;j<n;j++)
		{	int sum1=0;
			int sum2=0;
			for(int k=1;cnum[j]!=0;k++)
			{
				int temp=cnum[k]%10;
				if(temp%2==0)
				{
					sum1=sum1+temp;
				}
				else 
				{
					sum2=sum2+temp;
				}
				cnum[j]=cnum[j]/10;
			}
			if(sum1%4==0 || sum2%3==0)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
		}
        s.close();
    }
}