package mylinked_List.queueusingll;
import java.util.*;
public class myqueue {
    LinkedList <Integer> ls;
    myqueue()
    {
        ls=new LinkedList<>();
    }
    public void enqueue(int val)
    {
        
        ls.addLast(val);
    }
    
    public void dequeue()
    {
        
        ls.removeFirst();
    }
    
    public int front()
    {
        return ls.getFirst();
    }
    public int size()
    {
        return ls.size();
    }
}
