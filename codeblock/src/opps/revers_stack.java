package opps;
import java.util.Stack;

public class revers_stack {
    public static void insatbottom(Stack<Integer> st,int val)
    {
        if(st.size()==0)
        {
            st.push(val);
            return;
        }
        int temp=st.pop();
        insatbottom(st,val);
        st.push(temp);

    }
    public static void reverse(Stack<Integer> st)
    {
        if(st.size()==0)
        {
            return;
        }
        int pop=st.pop();
        reverse(st);
        insatbottom(st,pop);
        
    }
    public static void main(String [] args)
    {
        Stack<Integer> st=new Stack<Integer>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    } 
}