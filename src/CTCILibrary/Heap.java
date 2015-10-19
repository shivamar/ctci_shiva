package CTCILibrary;

import java.util.Arrays;

public class Heap {

	private int[] arr;
	public int heapSize = 0;
	private int capacity = 0;
	String type = "";
	
	public Heap(String type, int size) {
		// TODO Auto-generated constructor stub
	  this.type = type;
	  capacity = size;
	  arr = new int[capacity];
	}
	
	public int[]  add(int x)
	{
		if(type == "max")
			return buildMaxHeap(x);
		else if(type == "min")			
			return buildMinHeap(x);
		
		return null;
	}
	
	//deleteMinORMax
	public int removeLast()
	{
		if(heapSize == 0) return -1;		
		
		int top = arr[0];
		int lastElement = heapSize - 1;
		arr[0] = arr[lastElement];
		heapSize--;
		
		percolateDown(0); //both for min and max
		
		return top;
	}
	
	public int count()
	{
		return heapSize-1;
	}
	
	
	private void percolateDown(int i) {
		int child1;
		int child2;
		
		if(type == "min"){		
			int min = -1;
			while(i < heapSize && min != i)
			{
				if(min != -1 && min != i){
					swap(i,min);
					i = min;
				}
				
				child1 = 2*i + 1;
				child2 = 2*i + 2;				
				
				if(child1 < heapSize && arr[child1] < arr[i])
				  min = child1;				 
				else min = i;
				
				if(child2 < heapSize && arr[child2] < arr[min]) min = child2;				 				
			}
		}
		else 
		{
			int max = -1;
			
			while(i < heapSize - 1 && max != i)
			{
				if(max != -1 && max != i)
				{
					swap(i,max);
					i = max;
				}
				
				child1 = 2*i + 1;
				child2 = 2*i + 2;
				
				if(child1 < heapSize && arr[child1] > arr[i]) max = child1;
				else
				max = i;				
					
				if(child2 < heapSize && arr[child2] > arr[max]) max = child2;
				
			}
		}		
	}

	public int[] buildMaxHeap(int x)
	{		
		if(heapSize == arr.length) resize(arr);
		
		arr[heapSize] = x;	
				
		if(heapSize == 0){
			heapSize++;
			return arr;
		}
		
		int parent_num = (heapSize - 1) / 2;		
		if(arr[parent_num] < arr[heapSize]) swap(parent_num,heapSize);
		
		do
		{		
			checkChild_MaxHeapProperty(parent_num);
			if(parent_num == 0) break;
			parent_num = (parent_num - 1) / 2;
		}
		while(parent_num >= 0);
		
		heapSize++;
		
		return arr;
	}
	
	private int[] resize(int[] arr2) {
		 arr = Arrays.copyOf(arr2, arr2.length * 2);
		 return arr;
	}
	

	private void checkChild_MaxHeapProperty(int parent_num) {
		// TODO Auto-generated method stub
		int child1 = 2 * parent_num + 1;
		int child2 = 2 * parent_num + 2;
		
		if(child1 <= heapSize)
		if(arr[parent_num] < arr[child1]) swap(parent_num, child1) ;
		
		if(child2 <= heapSize)
		if(arr[parent_num] < arr[child2]) swap(parent_num, child2) ;
		
		//if(arr[child1] < arr[child2]) swap(child1, child2);
	}

	private void swap(int parent_num, int curr) {
		int temp = arr[curr];
		arr[curr] = arr[parent_num];
		arr[parent_num] = temp;		
	}
	
	public int[] buildMinHeap(int x)
	{
				
		if(heapSize == arr.length) resize(arr);
		
		arr[heapSize] = x;
		
		if(heapSize == 0) {
			heapSize ++;
			return arr;
		}
		
		int parent_num = (heapSize - 1) / 2;
		if(arr[parent_num] > arr[heapSize]) swap(parent_num,heapSize);
		
		do
		{			
			checkChild_MinHeapProperty(parent_num);
			
			if(parent_num == 0) break;
			
			parent_num = (parent_num - 1) / 2;
		}
		while(parent_num >= 0);
		
		heapSize++;
		
		return arr;
		//return Arrays.copyOfRange(arr,1, arr.length); //arr
	}
	
	private void checkChild_MinHeapProperty(int parent_num) {
		// TODO Auto-generated method stub
		int child1 = 2 * parent_num + 1;
		int child2 = 2 * parent_num + 2;
		
		if(child1 <= heapSize)
		if(arr[parent_num] > arr[child1]) swap(parent_num, child1) ;
		
		if(child2 <= heapSize)
		if(arr[parent_num] > arr[child2]) swap(parent_num, child2) ;
		
		//if(arr[child1] > arr[child2]) swap(child1, child2);
	}

	public int peekTop() {
		// TODO Auto-generated method stub
		if(count() > -1)
			return arr[0];
		else
			return -1;
			
	}
	
}