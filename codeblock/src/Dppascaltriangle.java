import java.util.ArrayList;
import java.util.List;

public class Dppascaltriangle {
    public static List<List<Integer>> generatePascalsTriangle(int n)
    {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1); 
                } else {
                    row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
                }
            }
            triangle.add(row);
        }
        return triangle;
    }
    public static void printPascalsTriangle(List<List<Integer>> triangle) 
    {
        for (List<Integer> row : triangle)
        {
            System.out.println(row);
        }
    }
    
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> Triangle = generatePascalsTriangle(n);
        printPascalsTriangle(Triangle);
    }
}
