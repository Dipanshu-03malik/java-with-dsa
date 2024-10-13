/*
 Question 3: Moving Average
Problem Description

A stock price is dynamic. Its value can change multiple times in a fraction of a second or remain unchanged for several minutes. Analyzing the dynamics of stock price change can provide an indication for forth coming uptrend or downtrend in that stock. One such indicator is simple moving averages. Now, Harry wants to analyze the price trend of the stock on the basis of moving averages (MA).

Let’s consider a moving average of 2-day and 4-day respectively. A 2-day moving average is calculated by taking average of closing price of 2 consecutive days. A 4-day moving average is calculated by taking average of closing price of 4 consecutive days. Now, according to experts whenever a faster moving average curve (2-day MA) cuts the slower moving average (4-day MA) from below, then it is an indication of uptrend in the stock. Similarly, whenever a faster moving averages curve (2-day MA) cuts the slower moving average curve (4-day MA) from above, then it is an indication of downtrend in the stock.Help Harry in computing the number of uptrends and downtrends in the given time for which the data is provided.



In this graph, there are three lines indicating stock closing price, moving average of two days and four days .Now we can see that between 13th and 15th there is an intersection. It is known as downtrend when moving average of fewer days is cutting downwards the more days moving average and vice versa.

Note1 – There will be no day1 moving average for 2-day MA. Similarly there will be no day1, day2, day3 moving average for 4-day MA. In general there will be no X-1, X-2, Y-1, Y-2, etc day point for X-day and Y-day moving average curve.

Note2 – All the computation has to be accurate up to 6 digits after the decimal point.

Input

First line contains two space separated integers which are the moving average days X and Y.

Second-line contains an integer N denoting number of stock prices.

Third line contains N space separated decimal values denoting the closing price of the stock for N days.

Output

Print the total number of times the stock will give uptrend or downtrend.


Input : 3 5


11


4.55 5.4 5.65 5.4 5.2 4.85 4.95 5.05 4.9 4.9 4.95


Output : 3


Input : 2 4


14


69.849998 72.900002 74.449997 77.300003 75.050003 74.349998 75.449997 76.300003 74 69.349998 65.349998 67.349998 67.599998 68.449997


Output : 4


*/
package TCS_CODE_VITA_PYQ;
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();

        int size=sc.nextInt();

        double [] arr = new double[size];

        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextDouble();
        }

        double [] Xdays= new double[size];
        double [] Ydays= new double[size];

        for(int i=X-1;i<size;i++)
        {
            double sum =0;
            for(int j=0;j<X;j++)
            {
                sum += arr[i-j];
            }
            Xdays[i]=sum/X;
        }


        for(int i=Y-1;i<size;i++)
        {
            double sum =0;
            for(int j=0;j<Y;j++)
            {
                sum += arr[i-j];
            }
            Ydays[i]=sum/Y;
        }
        

        int uptrend=0,downtrend=0;
        for(int i=Y;i<size;i++)
        {
            if(Xdays[i-1]<Ydays[i-1] && Xdays[i]>Ydays[i])
            {
                uptrend++;
            }
            else if(Ydays[i-1]<Xdays[i-1] && Ydays[i]>Xdays[i])
            {
                downtrend++;
            }
        }


        System.out.println(uptrend+downtrend);
        sc.close();
    }
}
