package chapter2;

import CTCILibrary.LinkedListNode;

public class Question6 {

	public Question6() {
		// TODO Auto-generated constructor stub
	}
	
	private static LinkedListNode findHeadOfLoop(LinkedListNode head){
		LinkedListNode slow = head;
		LinkedListNode fast = head;
		do
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		while(slow != fast);
		
		//now at collison point at end of loop
		
		slow = head;
		
		do
		{
			slow = slow.next;
			fast = fast.next;
		}while(slow != fast);
		//at end of loop
		
		return slow;
	}

	public static void main(String[] args) {
		LinkedListNode headOfLoopedLL = giveLinkedListWithLoop();
		
		LinkedListNode startOFLoop = findHeadOfLoop(headOfLoopedLL);
		
		System.out.println(startOFLoop.data);
		
	}
	
	private static LinkedListNode giveLinkedListWithLoop()
	{
		LinkedListNode l = new LinkedListNode(1);
		l.next = new LinkedListNode(2);
		l.next.next = new LinkedListNode(3);
		
		LinkedListNode four = new LinkedListNode(4);
		l.next.next.next = four;
		
		four.next = new LinkedListNode(5);
		four.next.next = new LinkedListNode(6);
		
		LinkedListNode sev = new LinkedListNode(7);
		four.next.next.next = sev;
		
		sev.next = four;
			
//		LinkedListNode eight = new LinkedListNode(8);
//		eight.next = four;
		
		//four.next.next.next.next = eight;
		
		return l;
	}

}
