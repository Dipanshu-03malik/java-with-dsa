// 12345
// 23451
// 34512
// 45123
// 54321
package pattern;

/**
 * pattern3
 */
public class pattern3 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print((i+j)%n);
            }
            System.out.println();
        }
    }
}