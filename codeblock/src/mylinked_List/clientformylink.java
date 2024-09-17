package mylinked_List;

public class clientformylink {
    public static void main(String [] args) throws Exception
    {
        mylink list=new mylink();
        list.insatbegin(10);
        list.insatbegin(20);
        list.insatbegin(30);
//for remove
        list.display();
        list.reverse();
        list.display();

        // list.remove_fromend();
        // list.display();


        // list.InsertatIndex(2, 1220);
        // System.out.println();
        // list.display();

        // list.removeAtAnyIndex(0);
        // list.display();
    }

}