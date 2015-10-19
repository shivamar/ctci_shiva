package chapter9;

import java.util.HashMap;
import java.util.Map;

public class Question1 {

	public Question1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[])
	{
		HashMap<Integer, Integer> recMap = new HashMap<Integer,Integer>();		
		for(int a = 0; a < 38;a++) recMap.put(a,-1);
		
		System.out.println(CountWays(37,recMap));
	}
	
	public static int CountWays(int n, HashMap<Integer,Integer> recMap)
	{
		if(n<0) return 0;
		else if(n==0) return 1;
		else if(n > 0){			
			if(recMap.get(n) != -1) return recMap.get(n);
			
			recMap.put(n, CountWays(n-1, recMap) +
					CountWays(n-2, recMap)+
					CountWays(n-3, recMap));
			
			return recMap.get(n);
		}
		return 0;
	}
}
