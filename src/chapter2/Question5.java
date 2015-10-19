package chapter2;
import java.util.Random;

import CTCILibrary.*;

public class Question5 {

	public static LinkedListNode giveSum(LinkedListNode list1, LinkedListNode list2)
	{
		LinkedListNode result = new LinkedListNode();
		int carryover = 0;
		int d1,d2,d3;
		
		while(list1 != null || list2 != null)
		{			
			d1 = list1.data;
			list1 = list1.next;
			d2 = list2.data;
			list2 = list2.next;
						
			carryover = 0;
			d3 = d1+d2+carryover;
			if(d3 > 9) carryover = 1;
			
			result.addToTail(d3);
		}
		
		LinkedListNode pendingList = new LinkedListNode();
		
		if(list1 == null && list2 != null) 
			pendingList = list2;
		else if(list2 == null && list1 != null)
			pendingList = list1;
		
		while(pendingList != null)
		{
			int data  = pendingList.data;
			
			result.addToTail(data);
			
			pendingList = pendingList.next;
		}
		
		return result;
	}
	
	public Question5() {
		// TODO Auto-generated constructor stub
		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub			
		Random ra = new Random();
		
		LinkedListNode list1 = new LinkedListNode();
		LinkedListNode list2 = new LinkedListNode();
		int i = 0,k = 0;
		
		while(i < 3)
		{
			list1.addToTail(ra.nextInt(10));
			list2.addToTail(ra.nextInt(10));
			
			i++;
		}
		
		LinkedListNode res = giveSum(list1, list2);
		
		LinkedListNode.printForward(list1);
		System.out.println("------------");
		LinkedListNode.printForward(list2);
		System.out.println("------------");
		LinkedListNode.printForward(res);
	}
 }
