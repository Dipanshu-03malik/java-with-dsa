package hashmap;

public class myclient {
    public static void main(String[] args) {
        MyHashMap m = new MyHashMap();
        m.put("Mohan", 45);
        m.put("Sohan",60);
        m.put("Rohan", 70);
        m.put("Karan", 80);
        System.out.println(m.get("Sohan"));
        System.out.println(m.containskey("Sahil"));
        m.put("Sohan", 100);
        System.out.println(m.get("Sohan"));
        System.out.println(m.getsize());
        System.out.println(m.toString());
    }
}
