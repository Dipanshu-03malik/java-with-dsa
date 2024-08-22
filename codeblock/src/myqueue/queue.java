package myqueue;

public class queue {
    private int [] arr;
    private int front; // index of front ele
    private int rear;  // index of last ele
    queue(int size)
    {
        arr=new int[size];
        front=-1;
        rear=-1;
    }
    //data insertion
    public void enqueue(int val) throws Exception
    {
        if(isFull())
        {
            throw new Exception("overfloed");
        }
        else if(isEmpty())
        {
            front++;
            rear++;
            arr[rear]=val;
        }
        else{
            arr[rear]=val;
            rear++;
        }
    }
    // data deletion
    public void dequeue() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("empty queue");
        }
        else if(front==rear)
        {
            front--;
            rear--;
        }
        else
        {
            front++;
        }
    }
    //check empty
    public boolean isEmpty()
    {
        if(front==-1&&rear==-1)
        {
            return true;
        }
        return false;
    }
    public boolean isFull()
    {
        if(rear==arr.length-1)
        {
            return true;
        }
        return false;
    }
    //tell front element
    public int front()throws Exception{
        if(isEmpty())
        {
            throw new Exception("Queue is empty");
        }
        return arr[front];
    }
// returb\n array
    public int[] tostring()
    {
        return arr;
    }
    
}   
