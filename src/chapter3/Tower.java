package chapter3;

import java.util.Stack;

public class Tower{
	public Stack<Integer> st;
	
	public Tower()
	{
		st = new Stack<Integer>();		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub	
		Tower tw = new Tower();
		tw.st.push(5);
		tw.st.push(4);
		tw.st.push(3);
		tw.st.push(2);
		tw.st.push(1);
		
		Tower destination = new Tower();
		Tower buffer = new Tower();
		
		tw.moveTower(5, destination, buffer);
		
		for(int i=destination.st.pop(); i > 0;i = destination.st.pop())
			print(i);				
	} 
	
	public static void print(int a)
	{
		System.out.println(a);		
	}
	
	public void moveTop(Tower destination)
	{
		if(!st.isEmpty() && (destination.st.isEmpty() || st.peek() < destination.st.peek()))
		{
			int v = st.pop();
			
			destination.st.push(v);
			
			 System.out.println("moving disk "+v+" from"+ this.hashCode()+"to"+destination.hashCode());
		}
	}
	
	public void moveTower(int n, Tower destination, Tower buffer)
	{
		if(n > 0){
			moveTower(n-1, buffer, destination);
			moveTop(destination);
			buffer.moveTower(n-1, destination, this);
		}
	}
}
