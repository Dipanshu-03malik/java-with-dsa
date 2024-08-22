package hashmap;

import java.util.HashMap;

public class twosum {
    public static void main(String[] args) {
        int a[]={2,11,7,5};
        int t=9;
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<a.length;i++){
            int diff=t-a[i];
            if(m.containsKey(diff)){
                System.out.println("["+m.get(diff)+","+i+"]");
            }
            else{
                m.put(a[i],i);
            }
        }
    }
}
