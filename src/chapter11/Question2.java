package chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Question2 {
	/*
	 * Write a method to sort an array of strings so that all the anagrams are next to
each other
	 */
	public static void main(String[] args) {		
		String[] strArr = {"ana","bana","naa","raja","mala","alam"};
		
		strArr = sortAndGrpAnagrams(strArr);	
		
		for(String st : strArr)
			System.out.println(st);
	}
	
	public class AnagramComparator implements Comparator<String>
	{
		@Override
		public int compare(String arg0, String arg1) 
		{
			char[] char0 = arg0.toCharArray();
			char[] char1 = arg1.toCharArray();
			
			Arrays.sort(char0);
			Arrays.sort(char1);
			
			return new String(char0).compareTo(new String(char1));			
		}		
	}
	
	// input : pan,app,nap,ball,czetch,lbal
	//output: app,ball,lbal,czetch,nap,pan.
	//logic: count the characters and find and grp anagrams , with smallest value at the top. if no anagram just store the string.
	//sort the lists based on first value of the list.
	
	//convert the array to list and sort them = O(n) + O(nlogn)	
	//find the char count and put them in hashmap d build index = O(n) 
	//loop the hashmap and insert each of the value in a list and return the list = O(n)
	//OR
	//find the char count and put them in a hashmap and if it already contains insert right after the element owing the key of the entry=O(n)
	
	public static String[] sortAndGrpAnagrams(String[] inputStrArr)
	{
		Question2 q2 = new Question2();		
		
		Arrays.sort(inputStrArr, q2.new AnagramComparator());
				
		return inputStrArr;		
	}	
}