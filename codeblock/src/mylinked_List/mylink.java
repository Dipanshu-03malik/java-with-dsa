package mylinked_List;

public class mylink {
    node head;

    //BEHAVIOURS

    // Insert at beginning
    void insatbegin(int val)
    {
        node newnode=new node(val);
        //create link
        newnode.next=head;
        head=newnode;
    }

    //display function
    void display()
    {
        node n=head;
        while(n!=null)
        {
            System.out.print(n.data+"->");
            n=n.next;
        }
    }
    //insert at end
    public void InsertAtEnd(int val) {
		if(head==null) 
        { // LinkedList is Empty

			insatbegin(val);
			return;
		}
		node temp=head;
		while(temp.next !=null) 
        {
			temp=temp.next;
		}
		// Create a New Node
		node newNode= new node(val);
		temp.next=newNode;	
	}
    //insert at Index
    public void InsertatIndex(int index,int val2)
    {
        int ind=index-1;
        node temp=head;
        node temp1;
        node newnode=new node(val2);
        while(ind>0)
        {       
            temp=temp.next;
            ind--;
        }
        temp1=temp.next;
        newnode.next=temp1;
        temp.next=newnode;
    }
    //remove at any index
    public void removeAtAnyIndex(int index) throws Exception
    {
        if(head==null)
        {
            throw new Exception("Null Pointer Exception");
        }
        if(head.next==null)
        {
            head=null;
            return;
        }
        int ind=index-1;
        node temp=head;
        while(ind>0)
        {
            temp=temp.next;
            ind--;
        }
        node temp1=temp.next;
        temp.next=temp.next.next;
        temp1.next=null;
    }
    //remove from begining
    void remove_frombegin()throws Exception
    {
        if(head==null)
        {
            throw new Exception("Null Pointer Excepion");
        }
        node n=head;
        head=head.next;
        n.next=null;
    }
    //size of the linked list
    public int retsize()
    {
        node temp=head;
        int count=-1;
        while(temp.next!=null)
        {
            temp=temp.next;
            count++;
        }
        return count;
    }
    //remove from end
    void remove_fromend()throws Exception
    {
        if(head==null)
        {
            throw new Exception("Null Pointer Exception");
        }
        if(head.next==null)
        {
            head=null;
            return;
        }
        node temp=head;
        while (temp.next.next!=null)
        {
            temp=temp.next;   
        }
        temp.next=null;
    }
}