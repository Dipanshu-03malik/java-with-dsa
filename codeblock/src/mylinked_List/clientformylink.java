package mylinked_List;

public class clientformylink {
    public static void main(String [] args) throws Exception
    {
        mylink list=new mylink();
        list.insatbegin(10);
        list.insatbegin(20);
        list.insatbegin(30);
        list.insatbegin(40);
        
        // Display the list: Output will be 40->30->20->10->
        list.display();
        System.out.println();  // Print a newline for clarity
        
        // Check if the list has a cycle: Expected Output -> No cycle.
        list.cyclic(list.head);
        
        // Manually create a cycle by connecting last node to one of the earlier nodes
        list.head.next.next.next = list.head.next;  // Creates a cycle (10 -> 20 -> 30 -> 20)
        
        // Check again if the list has a cycle: Expected Output -> Cycle detected.
        list.cyclic(list.head);
//for remove
       
        // list.reverse();
        // list.display();

        // list.remove_fromend();
        // list.display();


        // list.InsertatIndex(2, 1220);
        // System.out.println();
        // list.display();

        // list.removeAtAnyIndex(0);
        // list.display();
    }

}