package chapter2;
import java.util.Random;

import CTCILibrary.LinkedListNode;

public class Question4 {

	public Question4() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * partition around a number x given a linked list
	 */
	public static LinkedListNode partition(LinkedListNode li,int x)
	{
		LinkedListNode head = new LinkedListNode();			
		
		while(li.next != null)
		{
			int currData = 	li.data;
			
			if(currData >= x) 
				head = head.addToTail(currData);
			else head = head.addToHead(currData);
			
			li = li.next;
		}
		
		return head;
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub	
		
		Random ra = new Random();
		
		LinkedListNode list = new LinkedListNode();
		int i = 0;
		
		while(i < 10)
		{
			list.addToTail(ra.nextInt(20));
			i++;
		}
		
		LinkedListNode res = partition(list, 10);
		
		LinkedListNode.printForward(res);
	}
}
