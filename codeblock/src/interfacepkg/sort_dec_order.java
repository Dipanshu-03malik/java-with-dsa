//sort wrt second digit tens place of an integer.
package interfacepkg;
import java.util.*;
class cmp1 implements Comparator<Integer>
{

    @Override
    public int compare(Integer o1, Integer o2) {
        
        int seconddigit_o1=(o1%100)/10;
        int seconddigit_o2=(o2%100)/10;
        if(seconddigit_o1>seconddigit_o2)
        {
            return -1;
        }
        else{
            return 1;
        }
    }
    
}
public class sort_dec_order {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1000);
        arr.add(96);
        arr.add(83);
        arr.add(20);
        
        Collections.sort(arr,new cmp1());
        System.out.println(arr);
    }
}