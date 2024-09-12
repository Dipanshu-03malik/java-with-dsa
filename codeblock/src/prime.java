import java.util.*;
public class prime {
    public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		long N=s.nextInt();
		if(N<2)
		{
			System.out.println("out of constraints");
		}
		else if(N==2)
		{
			System.out.println("Prime");
		}
		else 
		{	int check=0;
			if(N%2==0)
			{
				System.out.println("Not Prime");
				check=1;
			}
			else
			{
				for(int i=3;i<N;i+=2)
				{
					if(N%i==0)
					{
						System.out.println("Not Prime");
						check=1;
						break;
					}
				}
			}
			if(check==0)
			{					
				System.out.println("Prime");

			}
		}
        s.close();
    }
}