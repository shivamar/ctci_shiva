package chapter2;

import CTCILibrary.LinkedListNode;

public class Question7 {

	public Question7() {
		// TODO Auto-generated constructor stub
	}
	
	private boolean testYourCode()
	{
//		String pal = "Madam";
		
		LinkedListNode head = new LinkedListNode(1);
		
		head.next =  new LinkedListNode(2);
		head.next.next =  new LinkedListNode(3);
		head.next.next.next = new LinkedListNode(2);
		head.next.next.next.next = new LinkedListNode(1);
		head.next.next.next.next.next = null;

//		LinkedListNode head = giveLinkedList(pal);
		
		Result result = isPalindrome(head, head.length());
		
		if(result.res) return true;
		else return false;			
	}
	
	class Result{
		
		public Result(LinkedListNode node, boolean tr)
		{
			this.node = node;
			this.res = tr;
		}
		
		LinkedListNode node;
		boolean res;
	}
	
	private Result isPalindrome(LinkedListNode head, int length) 
	{
		if(length == 2)
		{
			return new Result(head.next, head.data == head.next.data);			
		}
		
		if(length == 1)
		{
			return new Result(head.next, true);									
		}
		
		if(head != null)
		{
			Result ans = isPalindrome(head.next, length - 2);
			
			if(!ans.res || ans.node == null) return ans;
			else
			{
				return new Result(ans.node.next, head.data == ans.node.data);
			}		
		}
	
		return null;
	}

//	private LinkedListNode giveLinkedList(String pal) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	public static void main(String[] args)
	{
		Question7 q7 =new Question7();
		if(q7.testYourCode()) System.out.println("true");
		else System.out.println("false");
	}	
}
