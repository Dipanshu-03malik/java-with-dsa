import java.util.*;
public class subsequanceofstring {
    public static void subsequance(String s,String ans)
    {
        if(s.length()==0)
        {
            System.out.println(ans);
            return;
        }
        char ch=s.charAt(0);
        
        String minstr=s.substring(1);
        subsequance(minstr, ans+ch);
        subsequance(minstr, ans+"");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.next();
        subsequance(s,"");
        sc.close();
    }
}
