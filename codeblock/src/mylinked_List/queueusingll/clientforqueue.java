package mylinked_List.queueusingll;

public class clientforqueue{
    public static void main(String[] args) throws Exception
    {
        myqueue queue =new myqueue();
        queue.enqueue(55);
        queue.enqueue(56);
        queue.enqueue(57);
        queue.enqueue(58);
        queue.enqueue(59);
        System.out.println(queue.front());
        queue.dequeue();
        System.out.println(queue.front());

        
    }
}
