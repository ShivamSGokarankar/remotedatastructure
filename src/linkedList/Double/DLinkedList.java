package linkedList.Double;
import linkedList.Node;

public class DLinkedList {

	Node head;
	 
	public void insertAtEnd(int data)
	 {
		 Node n= new Node();
		 n.data=data;
		 if(head==null)
		 {
			 head=n;
		 }
		 else
		 {
			 Node i=head;
			 n.next=null;
			 Node j =n;
			 while(i.next!=null)
			 {
				 i=i.next;
			 }
			 i.next=j;
			 j.prev=i;
		  }
	 }
	public void insertAtBeginning(int data)
	{
		Node n = new Node();
		n.data=data;
		n.prev=null;
		Node a=head;
		head=n;
		n.next=a;
		a.prev=n;
	}
	public void insertAtPosition(int data,int pos )
	{
		Node i ;
		i=head;
		 if(i==null || pos==0)
		 	{		
			 	System.err.println("Position not found!!");
			 	return;
		 	}
		 else if(pos==1)
		 	{
			 	insertAtBeginning(data);
		 	}
		 
		 if(count()<pos)
		 {
			 
			 System.out.println("Link List have \"" + count() + "\" Nodes ");
			 System.out.println("Position \""+pos+"\" cannot be reached to insert Node");
			 System.out.println("Inserting at end");
			 insertAtEnd(data);
		 }
		 else
		 {
			 Node n = new Node();
			 Node x= head;
			 Node y=null;
			 
			 n.data=data;
			 int count=1;
			 while(x.next!=null)
			 {
				 if(count==pos)
				 {
					 break;
				 }
				 y=x;
				 x=x.next;
				 count++;
			 }
			 y.next=n;
			 x.prev=n;
			 n.prev=y;
			 n.next=x;
		 }
		 
		
	}
	public int count()
	{
		Node x= head;
		int counter=1;
		while(x.next!=null)
		{
			counter++;
			x=x.next;
		}
		//System.out.println("Total Nodes are " + counter);
	   return counter;
	}
	public void show()
	 {
		 Node x=head;
		 while(x.next!=null)
		 {
			 System.out.print("["+x.data+"]<-->");
			 x=x.next;
		 }
		 System.out.println("["+x.data+"]");
		 
	 }
	public void reverselist()
	{
		
	      Node c = head;
	      Node p =null;
	      Node n=null;
	      while(c!=null)
	      {
	    	  n=c.next;
	    	  c.next=p;
	    	  p=c;
	    	  c=n;
	    	  
	      }
	      head=p;
	      
	  		
	  		
	  		
	  			
	
	}
	public void findNode(int value)
	{
		Node i =head;
		int count=1;
		boolean flag=false;
	
	   
	    while(i.next!=null)
		{
			if(i.data==value)
			{
				System.out.println("Value found at Node " + count+" ");
				flag=true;
				
			}
			
			count++;
			
			i=i.next;
		}
	    if(i.data==value)
	    {
	    	flag=true;
	    	System.out.println("Value found at Node " + count+" ");
	    }
		if(flag==false)
		{
			System.out.println("Value not found !");
		}
		
		
	}
	public static void main(String[] args) {
		DLinkedList d= new DLinkedList();
		d.insertAtEnd(40);
		d.insertAtEnd(33);
		d.insertAtEnd(42);
		d.insertAtEnd(39);
		d.insertAtEnd(30);
		d.insertAtEnd(73);
		d.insertAtEnd(82);
		d.insertAtEnd(19);
		d.reverselist();
		d.show();
		
	
		
	}

}
