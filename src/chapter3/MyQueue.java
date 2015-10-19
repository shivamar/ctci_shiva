package chapter3;

import java.util.Stack;

public class MyQueue {

	Stack<Integer> s1;
	Stack<Integer> s2;
		
	public MyQueue() {
		s1 = new Stack<Integer>();
		s2 = new Stack<Integer>();		
	}

	public void queue(int i){
		s1.add(i);
	}
	
	public int dequeue() throws Exception{		
		if(s2.isEmpty()){
			while(!s1.isEmpty()){
				int v = s1.pop();
				s2.push(v);				
			}						
		}
		
		if(!s2.isEmpty()) return s2.pop();
		else throw new Exception("Empty Queue");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		try 
		{		
			MyQueue q = new MyQueue();
			
			q.queue(1);
			q.queue(10);
			System.out.println(q.dequeue());
			q.queue(100);			
			q.queue(1000);
			q.queue(2);
			System.out.println(q.dequeue());
			System.out.println(q.dequeue());
			System.out.println(q.dequeue());
			System.out.println(q.dequeue());
			System.out.println(q.dequeue());
		}	
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}		
	}	
}
