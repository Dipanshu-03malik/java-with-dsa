/*
 Question -: In a Super market we will find many variations of the same product. In the same way we can find many types of rice bags which differ in its quantity, price, brand, and type of rice in it.Many variations of same products exist in a super market. Consider rice for example. We get it in varying quantities (q) and at different prices (p).Thus rice bag is unique combination of {q,p}. Customers want to buy the rice bags of their own choices. Each bag has two attributes price and the quantity of rice. The customers have some conditions for buying the rice bags, they have a specific price and quantity that have to be compared with the rice bags before buying them. If the price of rice bag is less than or equal to the customer’s preference and if the quantity is more than given preference, then he/she will buy it. There is only one bag of each type and each customer can buy at most one bag.


 Given n,m representing the number of customers and rice bags respectively, along with the variations of rice bags available in the market and the preferences of customers, find the maximum number of bags that can be sold by the end of the day.

                                            Constraints
                                            1 <= n, m <= 1000
                                            1 <= a, b <= 10^5
                                            1 <=p, q<= 10^5

Input
The first line contains two space separated integers n and m denoting the number of customers and number of rice bags respectively.
Next n lines consist of two space separated integers a and b denoting customer’s preferences viz. customer’s quantity and cost preferences, respectively.
Lastly, the next m lines consist of two space separated integers q and p denoting the bags quantity and cost, respectively.

Output
Print the maximum number of rice bags that can be sold.

Time Limit (secs)
1

Examples

Example 1
Input
5 4
35 2400
70 5500
87 6000
20 1700
12 500
50 2500
75 4875
100 7000
25 1250
Output
2
 */
package TCS_CODE_VITA_PYQ;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int custumer = sc.nextInt();
        int riceBags = sc.nextInt();

        int [] customerQuantity = new int [custumer];
        int [] customerPrice = new int [custumer];

        for(int i=0;i<custumer;i++)
        {
            customerQuantity[i]=sc.nextInt();
            customerPrice[i]=sc.nextInt();
        }

        int [] riceQuantity = new int [riceBags];
        int [] ricePrice = new int [riceBags];

        for(int i=0;i<riceBags;i++)
        {
            riceQuantity[i]=sc.nextInt();
            ricePrice[i]=sc.nextInt();
        }

        boolean [] soldbags= new boolean[riceBags];
        int bags=0;
        for(int i=0;i<custumer;i++)
        {
            for(int j=0;j<riceBags;j++)
            {
                if(!soldbags[j] && ricePrice[j] <= customerPrice[i] && riceQuantity[j] > customerQuantity[i])
                {
                    soldbags[j]=true;
                    bags++;
                    break;
                }
            }
        }
        System.out.println(bags);
        sc.close();
    }
    
}
