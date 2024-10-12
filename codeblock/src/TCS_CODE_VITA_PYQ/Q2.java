/*
 Problem Description

Elections are going on, and there are two candidates A and B, contesting with each other. There is a queue of voters and in this queue some of them are supporters of A and some of them are supporters of B. Many of them are neutral. The fate of the election will be decided on which side the neutral voters vote. Supporters of A and supporters of B make attempt to win the votes of neutral voters.

The way this can be done is explained below:

1. The voter queue is denoted by three characters, viz {-, A, B}. The – denotes neutral candidate, A denotes supporter of candidate A and B denotes supporter of candidate B.

2. Supporters of A can only move towards the left side of the queue.

3. Supporters of B can only move towards the right side of the queue.

4. Since time is critical, supporters of both A and B will move simultaneously.

5. They both will try and influence the neutral voters by moving in their direction in the queue. If supporter of A reaches the neutral voter before supporter of B reaches him, then that neutral voter will become a supporter of candidate A.

6. Similarly, if supporter of B reaches the neutral voter before supporter of A reaches him, then that neutral voter will become a supporter of candidate B.

7. Finally, if both reach at the same time, the voter will remain neutral. A neutral vote cannot decide the outcome of the election.

8. If finally, the queue has more votes for candidate A, then A wins the election. If B has more votes, then B wins that election. If both have equal votes, then it will be a coalition government.

Refer Examples section for understanding the dynamics of how the supporters influence the neutral voters.

Your task is to find the outcome of the election.

Note: There are no test cases where all votes are neutral
Input :14
–AB–AB—A–

Output : A


Input : 4
A—

Output : A
*/
package TCS_CODE_VITA_PYQ;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner((System.in));
        int  N = sc.nextInt();
        System.out.println("INPUT FORMAT (A B -):");
        String queue = sc.next();
        char [] ch = queue.toCharArray();
        int countA=0,countB=0;
        for(int i=0;i<N;i++)
        {
            if (ch[i]=='A')
            {
                countA++;
            }
            else if(ch[i]=='B')
            {
                countB++;
            }
            else if (ch[i]== '-') 
            {
                int leftDistance = Integer.MAX_VALUE;
                int rightDistance = Integer.MAX_VALUE;
                for (int j = i - 1; j >= 0; j--) 
                {
                    if (ch[j] == 'A') 
                    {
                        leftDistance = i - j; 
                        break;
                    }
                }
                for (int j = i + 1; j < N; j++) {
                    if (ch[j] == 'B') {
                        rightDistance = j - i; 
                        break;
                    }
                }
                if (leftDistance < rightDistance) 
                {
                    countA++;
                } 
                else if (rightDistance < leftDistance) 
                {
                    countB++;
                }
            }
            else{
                System.out.println("INVALID INPUT");
                return;
            }
        }
        if (countA>countB)
        {
            System.out.println("A");
        }
        else if(countB>countA)
        {
            System.out.println("B");
        }
        else{
            System.out.println("coalition government");
        }
        sc.close();
    }
}
