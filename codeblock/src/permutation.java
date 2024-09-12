import java.util.Scanner;

public class permutation {
    public static void spermutation(String str,String ans)
    {
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            String str2=str.substring(0, i)+str.substring(i+1);
            spermutation(str2, ans+ch);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        spermutation(str,"");
        sc.close();
    }
}
