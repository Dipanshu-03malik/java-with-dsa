package myqueue;

public class client {
    public static void main(String[] args) throws Exception {
        queue q= new queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        System.out.println(q.front());
        q.dequeue();
        System.out.println(q.front());
        System.out.println(q.isEmpty());
        q.enqueue(3333);

    }
}
