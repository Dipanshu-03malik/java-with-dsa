/*
 Problem Statement – An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW). A company manager wants to make the production of both types of vehicle according to the given data below:
 1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
2nd data, Total number of wheels = W
The task is to find how many two-wheelers as well as four-wheelers need to manufacture as per the given data.
Example :

Input :
200  -> Value of V
540   -> Value of W

Output :
TW =130 FW=70

Explanation:
130+70 = 200 vehicles
(70*4)+(130*2)= 540 wheels

Constraints :

2<=W
W%2=0
V<W
Print “INVALID INPUT” , if inputs did not meet the constraints.
 */
package TCS_NQT_QUES;

import java.util.Scanner;

/**
 * Q10
 */
public class Q10 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int w=sc.nextInt();
        float res=((4*v)-w)/2;
        if(w>=2 && (w%2==0) && v<w)              
        System.out.println("TW= "+(int)(res)+" FW= "+(int)(v-res));
        else                
        System.out.println("INVALID INPUT");
        sc.close();
    }
}