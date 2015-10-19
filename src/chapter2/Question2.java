package chapter2;
import CTCILibrary.*;

public class Question2 {	

	public static int printKthToEnd_Recursive(LinkedListNode list, int k) 
	{		
		if(list == null) return 0;
		
		int n;
		
		 n = printKthToEnd_Recursive(list.next, k) + 1;
		
		if(n-1 == k) System.out.println(list.data);
		
		return n;
	}
	
	public class IntWrapper{
		public int val;
	}
	
	//O(n) space O(n) time
	public static LinkedListNode findKthToEnd_Recursive2(LinkedListNode list, int k, IntWrapper n) 
	{		
		if(list == null) return null;
				
		LinkedListNode node = findKthToEnd_Recursive2(list.next, k, n);
		n.val++; 		 
		
		if(n.val - 1 == k) return list;
		
		return node;
	}
	
	//O(n) time O(1) space
	public static LinkedListNode findKthToEnd_Iterative(LinkedListNode list, int k)
	{
		LinkedListNode second = list;
		LinkedListNode runner = list;
		
		for(int i=0;i<k;i++)
		{
			runner = runner.next;
		}
		
		while(runner.next != null)
		{
			second = second.next;
			runner = runner.next;
		}
		
		return second;		
	}

	public static void main(String[] args) {
		LinkedListNode list = new LinkedListNode(2);
		list.addToTail(3);
		list.addToTail(4);
		list.addToTail(5);
		list.addToTail(6);
		list.addToTail(7);
		
		LinkedListNode.printForward(list);
		System.out.println("...Question 2 - the kth node from last...");
		
		System.out.println("...recursive solution 1...");
		
		printKthToEnd_Recursive(list, 2);
		Question2 q = new Question2();
		
		System.out.println("...recursive solution 2...");
		
		IntWrapper intWrapper = q.new IntWrapper();
		
		LinkedListNode ansNode = findKthToEnd_Recursive2(list, 2, intWrapper);		
		System.out.println(ansNode.data);
		
		System.out.println("...iterative solution...");
		ansNode = findKthToEnd_Iterative(list, 2);		
		System.out.println(ansNode.data);
	}

}