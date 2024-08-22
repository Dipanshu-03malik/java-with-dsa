package mylinked_List.stackusingll;

public class clientfor_stack {
    public static void main(String[] args) throws Exception {
        mystack st=new mystack();
        st.push(3);
        st.push(5);
        st.push(6);
        System.out.println(st.peek());

        st.pop();
        System.out.println(st.peek());
        
        System.out.println(st.size());
    }
}
