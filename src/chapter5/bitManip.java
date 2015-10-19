package chapter5;

import java.util.function.BinaryOperator;

public class bitManip {

	public static void main(String args[])
	{
		clearbit(15,3);
		
		int w = swapOddEvenBits(26);
		
		System.out.println(w);
		
		int y = reverse32Bits(1);
		
		System.out.println(y);
	}
	
	public static int clearbit(int num, int i)
	{
		int mas = ~(1 << i); // shift 1 by i.eg.100 and inverse it so u get 1011. AND it with num.
		int mask = num  & mas;
		
		return mask;				
	}
	
	/**
	 * 11010 
	 * @param x
	 * @return 11100
	 */
	public static int swapOddEvenBits(int x)
	{
		return ( ((x & 0xaaaaaaaa) >> 1) | (( x & 0x55555555)) << 1 );			
	}
	
// 0001 is 10000000000000000000000000000000	
   public static int reverse32Bits(int n) {        
        int currBit = 0;
        int answer = 0;
        int shifter = 32;
        
        while(n!=0)
        {
            currBit = n % 2;
            
            currBit = currBit << 31;
            
            answer = answer | currBit;
            
            n = n / 2;
            --shifter ;
        }
        
        return answer;
    }
	
//	class Solution {
//		public:
//		    int hammingWeight(uint32_t n) {
//		        int count = 0;
//		        
//		        while(n != 0)
//		        {
//		            int rem = n % 2;
//		            
//		            if (rem == 1) ++count;
//		            
//		            n = n/ 2;
//		        }
//		        
//		        return count;
//		    }
//		};
}
