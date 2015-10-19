package chapter11;

public class Question5 {
	
	//Find a location of a given string 
	public Question5() {
		// TODO Auto-generated constructor stub
	}
	
	//find String out of empty strings
	public static int findString(String[] stringSorted, String str)
	{
		int low = 0;
		int len = stringSorted.length;
		int high = len -1;
		
		int mid = 0;
		
		while(low <= high)
		{
			mid = (high+low)/ 2;
			
			while(stringSorted[mid].equals("") && mid < len) mid = mid+1;
			
			if(stringSorted[mid].equals(str)) return mid;
			
			if(stringSorted[mid].compareTo(str) > 0) {
				high = mid;
			}
			
			if(stringSorted[mid].compareTo(str) < 0) {
				low = mid;
			}					
		}	
		
		return -1;
	}

	public static void main(String[] args) 
	{
		String[] str = {"aba","","","ball","cat","","","mada","lak","man","nappa","opp","ram","sat","utv","vat","war","z"};
		int ans = findString(str, "z");
		
		System.out.println(ans);
	}
}
