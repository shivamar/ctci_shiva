package chapter2;

import CTCILibrary.LinkedListNode;

public class Question3 {
	//delete a node given access only to that node in a singly linked list
	//simple copy over the next nodes values n link to itself
	public static void deleteNode(LinkedListNode node)
	{
		if(node == null || node.next == null) return; 
			
		node.data = node.next.data;
		
		node.next = node.next.next;			
	}
	
	public static void main(String[] args) {
		LinkedListNode list = new LinkedListNode(2);
		list.addToTail(3);
		list.addToTail(4);
		list.addToTail(5);
		list.addToTail(6);
		list.addToTail(7);
		LinkedListNode.printForward(list);
		
		System.out.println("...Question 3 - delete kth node from last...");
		deleteNode(list.next.next);
		
		LinkedListNode.printForward(list);
	}

}
