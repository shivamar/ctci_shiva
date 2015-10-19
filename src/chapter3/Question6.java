package chapter3;

import java.util.*;

public class Question6 {
/*
 * Sort an stack in ascending order without using array. Only a second additional stack may be used.
 * Sort with the largest number on top of the stack
 */
	public Question6() {
		// TODO Auto-generated constructor stub
	}

	public static Stack sort(Stack<Integer> st)
	{
		Stack<Integer> s2 = new Stack<Integer>();
		
		while(!st.isEmpty())
		{
			int top = st.pop();
			
			while(!s2.isEmpty() && s2.peek() > top ) 
			{
				st.push(s2.pop());				
			}
			
			s2.push(top);
		}
		
		
		return s2;	 	
	}
	
	public static void main(String[]  args)
	{
		int[] num = new int[2];
	
		print(Math.log(8)/Math.log(2));
		
		System.out.println(isPerfectNumber(10.1));
		
	    Stack<Integer> s = new Stack<Integer>();
	    int[] a = {11,22,3,4,15,60};
	    for(int i : a) s.push(i);
	    
	    Stack<Integer> ans = sort(s);
	    
	    while(!ans.isEmpty()) print(ans.pop());
	    
	}
	
	public static void print(double a)
	{
		System.out.println(a);
	}
	
    public static boolean isPerfectNumber(double number){
        
     if(number % 1 == 0) return true;
     
     else
    	 return false;
    }
}
