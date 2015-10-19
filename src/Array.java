import java.util.*;

/**
 * @author Shiva
 *
 */
/**
 * @author Shiva
 *
 */
public class Array {

	public Array() {
		// TODO Auto-generated constructor stub
	}
	
	//Question number 1.1
	//Implement an algorithm to determine if a string has all unique characters. What
	//if you cannot use additional data structures?
	public Boolean isStringCharUnique(String inputStr){
		
		boolean [] charSet = new boolean[256];
		
		for(int k=0; k < inputStr.length(); k++){		
			int asciiCharNum = (int) inputStr.charAt(k);
			
			if(charSet[asciiCharNum] == true)
			{
				return false;
			}
			else			
			charSet[asciiCharNum] = true;		
		}
		return true;
	}	
	
	//Question number 1.2
	//Implement a function void reverse(char* str) in C or C++ which reverses a nullterminated
	//string.
		public String reverseANullTerminatedString(String inputStr){
			Character[] outputStr = new Character[inputStr.length()];			
			int n=0;
			
			for(int i=inputStr.length();i > 1;i--){
				//System.out.print(inputStr.charAt(i-1));
				outputStr[n]=inputStr.charAt(i-1);	
				
				n++;
			}			
			
			return outputStr.toString();
		}
		
		//compVersion -- Leetcode 
		    public int compareVersion(String version1, String version2) {		      
		    	String[] s1 = version1.split("\\.");
		    	String[] s2 = version2.split("\\.");
		    	
		    	int biggerSize;		    	
		    	int s1Len = s1.length;
		    	int s2Len = s2.length;
		    	
		    	if(s1Len >= s2Len) biggerSize = s1Len;
		    	else biggerSize = s2Len;
		    	
		    	int numbers1[] = new int[biggerSize];
		    	int numbers2[] = new int[biggerSize];
		    	
//		    	for(int i = 0;i < s1Len;i++)
//		    	{		    	   
//		    	   numbers1[i] = Integer.parseInt(s1[i]);
//		    	}
//		    	
//		    	for(int i = 0;i < s2Len;i++)
//		    	{		    	   
//		    	   numbers2[i] = Integer.parseInt(s2[i]);
//		    	}
		    	
		    	for(int i = 0;i < biggerSize;i++)
		    	{		    	   
		    	   if(s1Len > i ) numbers1[i] = Integer.parseInt(s1[i]);
		    	   if(s2Len > i ) numbers2[i] = Integer.parseInt(s2[i]);
		    	   
		    	   if(numbers1[i] < numbers2[i]) return -1;
		           if(numbers1[i] > numbers2[i]) return 1;
		    	}		    			    		    	
		    			    			    			        
//		        for(int i=0;i < biggerSize;i++){
//		        	if(numbers1[i] < numbers2[i]) return -1;
//		        	if(numbers1[i] > numbers2[i]) return 1;
//		        }
		    	
		    	return 0;		    	
		    }	
		    
		    //@ZigZag		    
		    public String convert(String s, int nRows) {
		     StringBuilder[] strB = new StringBuilder[3];
		     
		     for(int i=0; i< nRows; i++) {
		    	    strB[i]=new StringBuilder();
		    	}
		    
		     while(s != null & s.length() > 3){
		    	 strB[0].append(s.charAt(0));
		    	 
		    	 strB[1].append(s.charAt(1));
		    	 strB[2].append(s.charAt(2));
		    	 
		    	 strB[1].append(s.charAt(3));
		    	 
		    	 s= s.substring(4);
		    }		    		   		 
		     
		    for(int i =0; i< s.length(); i++){
		    	strB[i].append(s.charAt(i));
		    }
		     
		    String result = strB[0].toString()+strB[1].toString()+strB[2].toString();
		    return result;
		  }
		  
		    //@ZigZag		    
		    public String convert1(String s, int nRows) {
		     String[] strB = new String[4];
		     
		     for(int i=0; i< nRows; i++) {
		    	    strB[i]=new String();
		    	}
		    
		     while(s != null & s.length() > 3){
		    	 strB[0] = strB[0]+s.charAt(0);
		    	 strB[1] = strB[1]+s.charAt(1);
		    	 strB[2] = strB[2]+s.charAt(2);		    	
		    	 strB[1] = strB[1]+s.charAt(3);
		    	 
		    	 s= s.substring(4);
		    }		    		   		 
		     
		    for(int i =0; i< s.length(); i++){
		    	strB[i] = strB[i] + s.charAt(i);
		    }
		     
		    String result = strB[0]+strB[1]+strB[2];
		    return result;
		  }
		  
		    //@ZigZag		    
		    public String convert2(String s, int nRows) {		    	
		            if (nRows == 1)  return s;
		            
		    		     String[] strB = new String[nRows];
		    		     
		    		     for(int i=0; i< nRows; i++) {
		    		    	    strB[i]=new String();
		    		     }
		    		     
		    		     int strFormerIndex = 0; 
		    		     int boundaryZero = 0;
		    		     int boundaryEnd  = nRows-1;
		    		     
		    		    Boolean inc = true;		     
		    		     
		    		    for(int i =0; i< s.length(); i++){		    			    			    	 		    			    		    	
		    		    	strB[strFormerIndex] = strB[strFormerIndex ] + s.charAt(i);	
		    		    	
		    		    	if(strFormerIndex == boundaryEnd) inc = false;
		    		    	if(strFormerIndex == boundaryZero) inc = true;
		    		    	
		    		    	if(inc) strFormerIndex++;		    				    	
		    		    	else strFormerIndex--;		    				    			    			    			    		    			    			    			    		
		    		    }
		    		     
		    		    String result = "";
		    		    
		    		    for(int f=0; f < nRows;f++)
		    		    {
		    		    	result += strB[f];
		    		    }		    
		    		     
		    		    return result;
		    		    
		    }
		    
		    
		    //find duplicates in the two arrays and avoids them or
		    //avoid duplicates in an array or		    
		    //form a new array without duplicates
		    // Hash Set approach -- O(1) in checkin for duplicates and 0(n+nk) for creation of new array approach
		    void findDupes(int[] a, int[] b) {
		        HashSet<Integer> map = new HashSet <Integer>();
		        for (int i : a)
		            map.add(i);
		        for (int i : b) {
		            if (map.contains(i)) ; 
		                // found duplicate!   
		        }
		    }
	}


