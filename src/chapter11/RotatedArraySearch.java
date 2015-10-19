package chapter11;

public class RotatedArraySearch {

	public RotatedArraySearch() {
		// TODO Auto-generated constructor stub
	}
	
	public static int find(int[] arr, int start, int end, int x)
	{
		int ostart = start;
		int oend = end;
		
		while(end >= start){
			int mid = (start+end) /2;
			
			if(arr[mid] > arr[start]) {
				if(x <= arr[mid] && x >= arr[start]) {
					if(x == arr[mid]) return mid;
					if(x == arr[start]) return start;
					
					start = start+1;
					end = mid-1;
					continue;
				}
			}			
			else { // 150 10 70			
				if(x <= arr[mid] || x >= arr[start]){
					if(x == arr[mid]) return mid;
					if(x == arr[start]) return start;
					
					start = start+1;
					end = mid-1;
					continue;
				}
			}	
			
			if(arr[end] > arr[mid]){
				if(x >= arr[mid] && x <= arr[end]){
					if(x == arr[mid]) return mid;
					if(x == arr[end]) return end;
					
					start = mid+1;
					end = end - 1;
					continue;
				}
			}
			else {
				if(x >= arr[mid] || x <= arr[end]){
					if(x == arr[mid]) return mid;
					if(x == arr[end]) return end;
					
					start = mid+1;
					end = end - 1;
					continue;
				}
			}
			
		}
		
//		start = ostart;
//		end = oend;
//		
//		while(end > start)
//		{
//			int mid = start+end /2;
//			
//			if(arr[end] > arr[mid]){
//				if(x >= arr[mid] && x <= arr[end]){
//					if(x == arr[mid]) return mid;
//					if(x == arr[end]) return end;
//					
//					start = mid+1;
//					end = end - 1;
//					continue;
//				}
//			}
//			else {
//				if(x >= arr[mid] || x <= arr[end]){
//					if(x == arr[mid]) return mid;
//					if(x == arr[end]) return end;
//					
//					start = mid+1;
//					end = end - 1;
//					continue;
//				}
//			}
//		}
				
		return -1;
	}
	
	public int bS(int[] arr, int x)
	{
		int low = 0;
		int high = arr.length;
		int mid = low+high/2;
		
		while(high > low)
		{
			if(x > arr[mid])
				low = mid+1;
			else if(x < arr[mid])
				low = mid - 1;
			else
				return mid;
		}
		
		return -1;//error
	}
	
	public static void main(String[] args)
	{
		int[] arr = {10,15,20,25,50,55,75,0,2,4,7};
		//int[] arr = {0,1,3,5,7,10};
		int resultIndex = find(arr, 0, arr.length- 1, 7);
		
		System.out.println(resultIndex);
	}
}
