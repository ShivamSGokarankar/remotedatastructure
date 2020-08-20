package linkedList.single;

import linkedList.Node;

public class LinkedList 
	{
	 
	
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
			Node x=head;
				while(x.next!=null)
				{
					x= x.next;
				}
				x.next=n;
			
			}
	}
	public void inserAtBeginning(int data)
	{
		Node n= new Node(); //Node creation
		
		if(head==null)
		{
			head=n;
			n.data=data;
			n.next=null;
		}
		else
		{
		n.data=data;
		Node x=head;
		head=n;
		n.next=x;
		}
	}
	public int count()
	{ 
		
		int count;
	Node i;
	i=head;
	count=1;
	
		while(i.next!=null)
		{
			count++;
			i=i.next;
			
		}
	
		return count;
	}	
	public void insertAtPosition(int data,int pos)
	{
		
		
				if(pos==0)
					{
					System.out.println("there is no node to insert at given position");	
					return ;
					}
				else if(pos==1)
					{
						inserAtBeginning(data);
						
						return;
					}

				
				if(count()<pos)
				{
					System.err.println("position cannot be reached to insert node ");
					System.out.println("Inserting node to end");
					insertAtEnd(data);
				}
				else
				{
					Node n= new Node();
					n.data=data;
					Node x,y;
					y=null;
					x=head;
					int counter=1;
					while(x.next!=null)
					{
						if(counter==pos)
						{
							break;
						}
						y=x;
						x=x.next;
						counter++;
					}
					
					y.next=n;
					n.next=x;
					
				}
				
			}
	public void show() 
	{
		if(head==null)
		{
			return;
		}
		else
		{
		Node node=head;
			while(node.next!=null) 
			{
				System.out.print("["+node.data + "]" + "-->");
				node=node.next;
			
			
			}
			System.out.println("["+node.data + "]");
		
		}
	}
	public void findNode(int value)
	{
		Node i =head;
		int count=1;
		//boolean flag=false;
		while(i.next!=null)
		{
			if(i.data==value)
			{
				
				System.out.println("Value found at Node " + count+" ");
				//flag=true;
				
			}
			
			count++;
			i=i.next;
		}
	    if(i.data==value)
	    {
	    	//flag=true;
	    	System.out.println("Value found  Node " + count+" ");
	    }
	    else
	    {
	    	System.out.println("Not found");
	    }
//		if(flag==false)
//		{
//			System.out.println("Value not found !");
//		}
	    
		
		
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
	
	/*Driver Method    */

	public static void main(String[] args) throws InterruptedException
	{
		LinkedList list= new LinkedList();

       
        list.insertAtEnd(30);
        list.insertAtEnd(20);
        list.insertAtEnd(60);
        list.insertAtEnd(60);
        list.insertAtEnd(70);
        
	
		list.show();
		}
	
}
