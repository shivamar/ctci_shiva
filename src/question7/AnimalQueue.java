package question7;

import java.util.LinkedList;

public class AnimalQueue {
	
	protected LinkedList<Dog> dogQ;
	protected LinkedList<Cat> catQ;
	
	private static int order;
	
	public void animalEnQueue(Animals ani) {
		ani.order = getOrderOfNext();
		switch(ani.type)
		{
			case "Dog":
				dogQ.add((Dog) ani);
			break;
			case "Cat":
				catQ.add((Cat) ani);
			break;
		}
	}
	
//	private Animals animalDeQueue(String type)
//	{
//		switch(type)
//		{
//		case "Dog":
//			if(!dogQ.isEmpty())
//				return (Animals)dogQ.removeFirst();
//			break;
//			
//		case "Cat":
//			if(!catQ.isEmpty())
//				return (Animals)catQ.removeFirst();
//			break;
//		}
//		return null;
//	}
	
	private int getOrderOfNext() {
		
		return ++order;
	}

	public Dog dequeueDog()
	{
		if(!dogQ.isEmpty())
			return dogQ.removeFirst();
		
		else return null;
	}
	
	public Cat dequeueCat()
	{
		if(!dogQ.isEmpty())
			return catQ.removeFirst();
		
		else return catQ.poll();
	}
	
	public Animals dequeueAny()
	{
		int dogOrder = 0;
		int catOrder = 0;
		
		String[] a = {"A","s","sasaa"};
		
		
		if(!dogQ.isEmpty()) dogOrder = dogQ.getFirst().order;
		if(!catQ.isEmpty()) dogOrder = catQ.getFirst().order;
		
		if(dogOrder == catOrder && dogOrder == 0) return null;
		
		if(dogOrder > catOrder)
		{			
			return dogQ.getFirst();
		}
		else
		{
			return catQ.getFirst();
		}
	}
	
}
