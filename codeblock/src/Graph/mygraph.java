package Graph;

import java.util.ArrayList;

public class mygraph {
    ArrayList<Integer>[]arr;
    @SuppressWarnings({ "unchecked", "rawtypes" })
    mygraph(){
        arr=new ArrayList[6];
        for(int i=0;i<arr.length;i++){
            arr[i]=new ArrayList();
            System.out.println(arr[i]);
        }
    }
    public void addEdge(int u,int v){
        arr[u].add(v);
        arr[v].add(u);
    }
    public void display(){
        for(int i=0;i<arr.length;i++){
            System.out.println(i+"->");
            ArrayList<Integer> list=arr[i];
            for(Integer nb : list){
                System.out.println(nb+",");
            }
            System.out.println();
        }
    }
}
