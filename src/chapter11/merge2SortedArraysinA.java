package chapter11;

public class merge2SortedArraysinA {

	public merge2SortedArraysinA() {
		
	}
	
	public static int[] merge(int[] A,int[] B)
	{
		int startingBindexinA = A.length - B.length-1;
		
//		for(int i = startingBindexinA,count=0; i < A.length;i++,count++)
//		{
//			A[i] = B[count];
//		}
//		
		int Acounter = startingBindexinA;
		int Bcounter = B.length-1;
		int insertCounter = A.length-1;
		
		while(insertCounter!= 0)
		{
			if(Acounter == -1){
				A[insertCounter] = B[Bcounter];
				
				
				Bcounter--;
				insertCounter--;
				
				continue;
			}
			
			if(Bcounter == -1){
				A[insertCounter] = A[Acounter];
				
				Acounter--;
				insertCounter--;
				continue;
			}
			
			if(A[Acounter] > B[Bcounter]) {
				A[insertCounter] = A[Acounter];
				
				Acounter--;
				insertCounter--;
			}
			else
			{
				A[insertCounter] = B[Bcounter];
				
				Bcounter--;
				insertCounter--;
			}
			
		}
		
		return A;		
	}

	public static void main(String[] args) {
		 
		int[] A = {1,20,30,40,0,0,0,0};
		int[] B = {5,16,37,80};
		
		merge(A, B);
		
		for(int a : A)
		System.out.println(a);

	}

}
