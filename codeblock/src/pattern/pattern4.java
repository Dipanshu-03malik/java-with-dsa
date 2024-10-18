/*
 *      2
 *     4 6 8
 *    10 12 14 16
 * 
 * 
 */
package pattern;

// import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        int rows = 3;
        int num = 2;
        for (int i = 1; i <= rows; i++) 
        {
            
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // Print numbers
            for (int k = 1; k <= i * 2; k++) {
                System.out.print(num + " ");
                num += 2;
            }
            System.out.println();
    }

    }}