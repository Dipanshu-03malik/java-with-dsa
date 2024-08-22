package mylinked_List.stackusingll;

import java.util.*;

public class mystack {
    LinkedList<Integer> ls;
    mystack()
    {
        ls=new LinkedList<>();
    }
    public void push(int val)
    {
        ls.addLast(val);
    }
    public void pop() throws Exception
    {
        if(ls.size()==0)
        {
            throw new Exception("empty");
        }
        ls.removeLast();
    }
    public int peek()
    {
        return ls.getLast();
    }
    public int size()
    {
        return ls.size();
    }
}

