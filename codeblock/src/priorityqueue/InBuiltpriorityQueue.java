package priorityqueue;

import java.util.PriorityQueue;

/**
 * InBuiltpriorityQueue
 */
public class InBuiltpriorityQueue {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(12);
        pq.add(34);
        pq.add(10);
        pq.add(37);
        System.out.println(pq.peek());


        // System.out.println(pq.remove());


        
        System.out.println(pq.peek());
        System.out.println(pq.size());
        System.out.println(pq);
    }
}