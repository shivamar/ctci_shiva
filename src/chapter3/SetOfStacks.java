package chapter3;

import java.util.ArrayList;
import java.util.Stack;

public class SetOfStacks {

	ArrayList<Stack> stackSet = new ArrayList<Stack>();
	
	public void push(int num)
	{
		Stack<Integer> latestStack;
		
		if(stackSet.isEmpty())
		{
			latestStack = new Stack<Integer>();		
			
			stackSet.add(latestStack);
		}
		else
		{
			
			latestStack = stackSet.get(stackSet.size()-1);
		}
		
		latestStack.push(num);		
	}
	
	public int pop()
	{
		Stack<Integer> latestStack;
		latestStack  = stackSet.get(stackSet.size()-1);
		
		if(latestStack == null) return -1;
		
		if(!latestStack.isEmpty()) return latestStack.pop();
		
		return -1;		
	}
	
	public static void main(String[] args)
	{
		SetOfStacks s = new SetOfStacks();
		s.push(3);
		s.push(4);
		
		print(s.pop());
	}
	
	public static void print(int a)
	{
		System.out.println(a);		
	}
	
}
