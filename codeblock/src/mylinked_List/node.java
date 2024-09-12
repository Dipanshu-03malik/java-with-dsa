package mylinked_List;

public class node {
    
    int data; 
    node next;
    
    node(int data)
    {
        this.data=data;
    }

    node(int data,node next)
    {
        this.data=data;
        this.next=next;
    }
    
}