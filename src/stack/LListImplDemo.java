package stack;
import linkedList.Node;
public class LListImplDemo {

	Node head;
	Node top ;
	Node prev;
  int counter=0;
	public void push(int data)
	{
		
		Node  n = new Node();
		n.data=data;
		
		if(isEmpty())
		{
			head=n;
			}
		else
		{
			top.next=n;
			prev=top;
		}
		top=n;
		counter++;
		
	}
	
	public void pop()
	{
		if(top==head || isEmpty())
		{
			head=top=prev=null;
		}
		
		else
		{
				Node i = head;
				while(i.next!=null)
				{
					prev =i ;
					i=i.next;
				}
				prev.next=null;
				top =prev;
				
				counter--;
				
				
				
			
		}
		
	}
	
	public void show()
	{
		if(isEmpty() )
		{
			System.out.println("Stack is empty");
			return;
		}
		else
		{
			
			int arr[]= new int[counter];
			Node i =head;
			for(int x=counter-1; x>=0;x--)
			{
				arr[x]=i.data;   ////
				i=i.next;
			}
			
			for(int c =0;c<arr.length;c++)
			{
				System.out.println(arr[c]);
			}
			}
			
			
			
			
//			Node i =head;
//		while(i.next!=null)
//		{
//			System.out.print(" " + i.data);
//			i=i.next;
//		}
//		System.out.print(" " + i.data);
//		
		
		System.gc();
		}
		
	
	public boolean isEmpty()
	{
		if(head==null)
		{
			return true;
		}
		else
		{
		return false;
		}
		
	}
	public static void main(String[] args) {
		
		LListImplDemo l = new LListImplDemo();
		l.push(10);
	   	l.push(20);
	   	l.push(30);
		l.push(40);
	
		l.pop();
		l.pop();
	
		l.show();
	
	
	

   
		
	}
}
