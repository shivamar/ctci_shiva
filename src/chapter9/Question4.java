package chapter9;

import java.util.ArrayList;

public class Question4 {

	public Question4() {
		
	}
	
	//print all subsets
	//{}
	//{a1} - {} {a1} 
	//{a1,a2} - {} {a1} {a2} {a1 a2} 
	public static void main(String[] args){
		int[] arr = {1,2,3,4};
		
		ArrayList<ArrayList<Integer>> result = buildAllSubsets(arr);
		
		System.out.println(result);		
	}
	
	//complexity! 
	//time - O(2^n) exponential
	//space - O(2^n)
	
	//build from base case approach-- iterative way used! 
	public static ArrayList<ArrayList<Integer>>  buildAllSubsets(int[] set)
	{
		ArrayList<ArrayList<Integer>> allSubsets = new ArrayList<ArrayList<Integer>>();
		
		ArrayList<Integer> emptySet = new ArrayList<Integer>();
		allSubsets.add(emptySet);
				
		for(Integer i : set)
		{
			
			ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();			
			
			for(ArrayList<Integer> oldSet : allSubsets)
			{				
				ArrayList<Integer> newSet = new ArrayList<Integer>();
				newSet.addAll(oldSet);			
				newSet.add(i);				
				
				temp.add(newSet);
			}			
			
			allSubsets.addAll(temp);
		}
		
		return allSubsets;
	}
}
