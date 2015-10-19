package question7;

import java.util.LinkedList;

public abstract class Animals {
	protected int order;
	protected String type;
	
	protected String getType()
	{
		return type;
	}
	
	protected void setType(String ty)
	{
		type = ty;
	}
	
	protected void setOrder(int ord)
	{
		order = ord;
	}
	
	protected int getOrder()
	{
		return order;
	}
	
//	public abstract void enqueue(Animals ani);
//	
//	public abstract void dequeue(String type);
}
