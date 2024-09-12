package hashmap;

import java.util.HashMap;

public class freq {
    public static void main(String[] args) {
        int [] a={1,1,1,2,2,3,4,4,3,3,6};
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int val:a){
            if(m.containsKey(val)){
                int old_fre=m.get(val);
                m.put(val, old_fre+1);
            }
            else{
                m.put(val,1);
            }
        }
        // for(Integer key : m.keySet()){
        //     System.out.print(key+"->"+m.get(key)+"  ");
        // }
        System.out.println(m.toString());

        String str ="Heello";
        HashMap<Character,Integer> p=new HashMap<>();
        int n=str.length();
        for(int i=0;i<n;i++){
            char val=str.charAt(i);
            if(p.containsKey(val)){
                int old_freq=p.get(val);
                p.put(val,old_freq+1);
            }
            else{
                p.put(val, 1);
            }
        }
        System.out.println(p.toString());
    }
}
