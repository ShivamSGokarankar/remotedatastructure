package linkedList.circulatLinkList;
import linkedList.*;
public class CLinkList {

	Node head;


	public void insertAtEnd(int data)
	{
		Node n = new Node();
		n.data=data;
		if (head==null)
		{
			head=n;
			n.next=n;

		}
		else
		{
			Node x=head;

			while(x.next!=null)
			{
				x=x.next;
			}
			x.next=n;

		}

	}

	public void show()
	{
	    Node x = head;
		while(x.next!=null)
		{
			System.out.print("[" +x.data+ "]-->");
			x=  x.next;
		}
		x.next=head;
		System.out.print("[" +x.data+ "]");
	}
	public static void main(String[] args) {

		CLinkList c= new CLinkList();
		c.insertAtEnd(10);
      
		c.show();



	}
}
