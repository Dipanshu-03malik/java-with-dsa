package priorityqueue;

import java.util.ArrayList;

public class MyPriorityqueue {
    ArrayList<Integer> arr;
    MyPriorityqueue()
    {
        arr=new ArrayList<>();
    }
    private int ParentIndex(int ci)
    {
        int pi=(ci-1)/2;
        return pi;
    }
    private int leftChild(int pi)
    {
        return (2*pi) +1;
    }
    private int rightChild(int pi)
    {
        return (2*pi) +2;
    }
    public void add(int val)
    {
        arr.add(val);
        unheapify(arr.size()-1);
    }
    private void swap(int pi,int ci)
    {
        int temp=arr.get(pi);
        arr.set(pi,arr.get(ci));
        arr.set(ci,temp);
    }
    public void unheapify(int ci)
    {
        if(ci==0)
        {
            return; 
        }
        int pi=ParentIndex(ci);
        if(arr.get(pi)>arr.get(ci))
        {
            swap(pi,ci);
            unheapify(pi);
        }
    }
    public int peek()throws Exception
    {
        if(arr.size()==0)
        {
            throw new Exception("Priority Queue is Empty");
        }
        return arr.get(0);
    }
    public void downheapify(int pi)
    {
        int left=leftChild(pi);
        int right=rightChild(pi);
        int minvalueindex=pi;
        if(left>= arr.size() && right >= arr.size())
        {
            return;
        }
        if(left <arr.size() && arr.get(minvalueindex) >arr.get(left))
        {
            minvalueindex=left;
        }
        if(right <arr.size() && arr.get(minvalueindex) >arr.get(right))
        {
            minvalueindex=right;
        }
        if(minvalueindex !=pi)
        {
            swap(minvalueindex,pi);
            downheapify(minvalueindex);
        }
    }
    public void remove()throws Exception
    {
        if(arr.size()==0)
        {
            throw new Exception("Priority Queue is Empty");
        }
        swap(0,arr.size()-1);
        downheapify(0);
    }
}
