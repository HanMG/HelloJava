package ch3;

public class Pro2
{
	public static void main(String[] args)
	{
		int[][] arr = {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
		
		int total = 0;
		float average = 0;
		
		System.out.println(arr.length);		
		
		for( int i =0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length ; j++) {
				total += arr[i][j];
			}
		}
		
		average = ((float)total/(arr.length * arr[0].length));
		System.out.println(total/(arr.length * arr[0].length));
		
		
		System.out.println("total ="+total);
		System.out.println("average ="+average);
	}
}
