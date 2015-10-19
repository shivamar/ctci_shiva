package CTCILibrary;

public class LinkedListNode {
	public int data;
	public LinkedListNode next;
	
	public LinkedListNode(int val) {
		data = val;		
	}
	
	public LinkedListNode(){		
	}
	
	public int length()
	{
	
		LinkedListNode head = this;
		int len = 0;
		
		while(head!=null)
		{
			len++;
			head = head.next;
		}
		
		return len;
	}
	
	public LinkedListNode addToHead(int a)
	{	
		LinkedListNode li;
		if(this.data != 0 && this.next != null)		
		{
			li = new LinkedListNode(a);		
			li.next = this;
		}		
		else
		{
			this.data = a;
			li = this;
		}

		return li;
	}
	
	public LinkedListNode addToTail(int a)
	{	
		LinkedListNode head = this;
		
		if(this.data == 0 &&this.next==null)
		{
			this.data =a;
		}
		else
		{		
			LinkedListNode curr = this;
			
			while(curr.next != null)
			{
				curr = curr.next;
			}
			
			curr.next = new LinkedListNode(a);
		}
		return head;
	}
	
	public static void printForward(LinkedListNode head){
		while(head != null)
		{
			System.out.println(head.data);
			head = head.next;
		}
	}

}
