package chapter9;

import java.util.ArrayList;
import java.util.List;

public class Question2 {

	public Question2() {
		
	}

	static int ccc = 0;
	public static void main(String[] args)
	{					
		ArrayList<String> li = new ArrayList<String>();		

		li = getPermutationString("abcde");
		
		System.out.println(li);	
		
		System.out.println(ccc);	
	}

	
	private static ArrayList<String> getPermutationString(String str)
	{			
		ArrayList<String> li = new ArrayList<String>();
		
		if(str.length() == 1) li.add(str);
		
		for(int count = 0;count < str.length(); count++)
		{ 
			ccc++;//complexity count!!
			if(count==0) {
				li.addAll(appendListnString(str.charAt(count),getPermutationString(str.substring(count+1))));
			}
			else if(count == str.length()-1) {
				li.addAll(appendListnString(str.charAt(count), getPermutationString(str.substring(0,count))));
			}			
			else {
				li.addAll(appendListnString(str.charAt(count), getPermutationString(str.substring(0,count)+str.substring(count+1))));
			}
		}
		
		return li;
	}

	private static ArrayList<String> appendListnString(char charAt, ArrayList<String> li) {
		for(int i=0;i<li.size();i++)
			li.set(i, charAt+li.get(i)); 
		
		return li;
	}	
}
