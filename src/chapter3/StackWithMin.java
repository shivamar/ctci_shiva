package chapter3;

import java.util.Stack;

@SuppressWarnings("serial")
public class StackWithMin extends Stack<Integer> {

	Stack<Integer> s2 = new Stack<Integer>();
		
	void push(int num)
	{
		int new_min = Math.min(num,min());
		
		if(new_min != min()) s2.push(num);
		
		super.push(num);
	}
	
	int min()
	{
		if(s2.empty())
		{
			return Integer.MAX_VALUE;
		}
		else
			return s2.peek();
	}
	
	public Integer pop()
	{
		int num = super.peek();
		if(s2.peek()==super.peek()) s2.pop();
		
		super.pop();
		
		return num;
	}
	
	public static void main(String[] args)
	{
		
		StackWithMin st = new StackWithMin();
		st.push(3);
		st.push(7);
		st.push(10);
		System.out.println(st.min());
		st.push(17);
		st.push(72);
		st.push(1);
		st.push(73);
		st.push(23);
		
		System.out.println(st.min());
		st.pop();
		st.pop();
		System.out.println(st.min());
		st.pop();
		st.pop();
		System.out.println(st.min());
		System.out.println(st.min());
		
		
//		Stack<Integer> s3 = new Stack<Integer>();
//				
//		s3.push(34);
//		s3.push(3);
//		s3.push(4);
//		s3.push(41);	
//		s3.pop();
//		s3.peek();
//		print(s3.peek());		
	}
	
	public static void print(int a)
	{
		System.out.println(a);		
	}
	
	public StackWithMin() {
		// TODO Auto-generated constructor stub
	}
}
