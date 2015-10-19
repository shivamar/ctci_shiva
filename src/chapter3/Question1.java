package chapter3;

public class Question1 {
	//Describe how you could use a single array to implement three stacks.
	
	int[] arr_stack = new int[30];
	
	int top1;
	int top2;
	int top3;
	
	void push(int data, int stackNumber)
	{
		if(stackNumber == 0)
		{
			if(top1 <= 9)
			{				
				arr_stack[top1] = data;
				top1++;
			}			
		}
		
		else if(stackNumber == 1)
		{
			if(top2 <= 9)
			{				
				arr_stack[top2 + 10] = data;
				top2++;
			}
		}
		
		else if(stackNumber == 2)
		{
			if(top3 <= 9)
			{				
				arr_stack[top3 + 20] = data;
				top3++;
			}
		}
		
	}
	
	int pop(int stackNumber)
	{	
		if(stackNumber == 0)
		{
			if(top1 > 0)
			{
				int temp = arr_stack[top1];
				top1--;
				return temp;				
			}			
		}
		
		else if(stackNumber == 1)
		{
			if(top2 > 0)
			{
				int temp = arr_stack[top2];
				top2--;
				return temp;
			}
		}
		
		else if(stackNumber == 2)
		{
			if(top3 > 0)
			{
				int temp = arr_stack[top3];
				top3 --;
				return temp;
			}
		}

		return Integer.MAX_VALUE;
	}
	
	void peek(int stackNumber)
	{		
		int i = 0;
		
		switch(stackNumber)
		{
			case 0:
				if(top1 > 0)
				i = top1;
				
				break;
			case 1:
				if(top2 > 0)
				i = top2 + 10;
				
				break;
			case 2:
				if(top3 > 0)
				i = top3 + 20;
				
				break;
		}
		
		if(i > 0)
		System.out.println(arr_stack[i-1]);
		
	}
	
	public Question1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question1 q = new Question1();
		
		q.push(10, 0);
		q.push(20, 0);
		q.push(30, 0);
		
		q.push(1, 1);
		q.push(2, 1);
		q.push(3, 1);
		
		q.push(5, 2);
		
		q.push(6, 2);
		q.push(7, 2);
		
		q.pop(0);		
		q.peek(0);		
	}

}
