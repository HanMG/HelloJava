package select;

public class SelectSort
{
	public static void main(String[] args)
	{
		int[] arr = {5,8,3,1,2};		
		int minPo;	
		int tmp;
		
		for(int i = 0; i < arr.length-1; i++) {
			minPo = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[minPo]) {
					minPo = j;
				}				
			}	
			tmp = arr[i];
			arr[i] = arr[minPo];
			arr[minPo] = tmp; 
		}
		
		for(int value : arr) {
			System.out.println(value);
		}
	}
	
	
	
}
