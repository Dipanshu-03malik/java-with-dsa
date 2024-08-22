package priorityqueue;

public class clientforpriot {
    public static void main(String[] args) throws Exception {
        MyPriorityqueue pq =new MyPriorityqueue();
        pq.add(34);
        pq.add(12);
        pq.add(5);
        System.out.println(pq.peek());
        
    }
}
