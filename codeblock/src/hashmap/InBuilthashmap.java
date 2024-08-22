package hashmap;

import java.util.HashMap;

public class InBuilthashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> m=new HashMap<>();
        //student->marsks

        //add the (key,value)
        m.put("Mohan",45);
        m.put("Sohan",60);
        m.put("Mohan", 70);
        
        System.out.println(m);
        //read any value
        System.out.println(m.get("Sohan"));

        //remove 
        m.remove("Sohan");
        System.out.println(m);

        //size
        System.out.println(m.size());

        //check present or nor
        System.out.println(m.containsKey("Mohniii"));
    }
}
