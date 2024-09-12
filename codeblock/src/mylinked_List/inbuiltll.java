package mylinked_List;
import java.util.*;
public class inbuiltll {
    public static void main(String[] args) {
    LinkedList<Integer> ls=new LinkedList<>();
    System.out.println(ls);
//add first element
    ls.addFirst(34);
    System.out.println(ls);
    ls.addFirst(20);
//add last element
    ls.addLast(56);
    System.out.println(ls);

//remove 1st ele
    ls.removeFirst();
    System.out.println(ls);
// remove last el
    ls.removeLast();
    System.out.println(ls);
//add in mid
    ls.add(0,1222);
    System.out.println(ls);
    ls.remove(1);
    System.out.println(ls);
    }
}
