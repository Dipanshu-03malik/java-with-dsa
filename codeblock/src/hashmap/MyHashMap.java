package hashmap;

import java.util.LinkedList;

public class MyHashMap {
    LinkedList<Entry> []arr;
    @SuppressWarnings("unchecked")
    MyHashMap(){
        arr=new LinkedList[5];
        for(int i=0;i<5;i++){
            arr[i]=new LinkedList<>();
            //System.out.println(arr[i]);
        }
    }
    public int hashFunction(String key){
        int hashvalue=key.hashCode();
        int index=Math.abs(hashvalue)%arr.length;
        return index;
    }

    //Behaviour
    //Checking if the hashmap contains key
    public boolean containskey(String key){
        int index = hashFunction(key);
        LinkedList<Entry> list=arr[index];
        for(Entry e:list){
            if(e.key.equals(key)){
                return true;
            }
        }
        return false;
    }

    //inserting a new key
    public void put(String key,int value){
        int index=hashFunction(key);
        LinkedList<Entry>list=arr[index];
        if(containskey(key)==true){
            for(Entry e:list){
                if(e.key.equals(key)){
                    e.value=value;
                }
            }
        }
        else{
            Entry e = new Entry(key, value);
            list.add(e);
        }
    }

    //Getting the key value
    public int get(String key){
        int index = hashFunction(key);
        LinkedList<Entry> list = arr[index];
        for(Entry e:list){
            if(e.key.equals(key)){
                return e.value;
            }
        }
        return-1;
    }

    //Calculating size of Hashmap
    public int getsize(){
        int count =0;
        for(int i=0;i<arr.length;i++){
            int size=arr[i].size();
            count+=size;
        }
        return count;
    }
    @Override
    public String toString(){
        String ans ="[";
        for(int i=0;i<arr.length;i++){
            LinkedList<Entry> list =arr[i];
            for(Entry e: list){
                String currEntry="{"+e.key+"="+ e.value+ "}";
                ans+=currEntry;
            }
        }
        ans+="]";
        return ans;
    }
}
