package referenceType;

public class Pro8
{
	public static void main(String[] args)
	{
		int[][] array = { 
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum = 0;
		double avg = 0.0;
		int cnt = 0;
		
//		for(int i = 0; i < array.length ; i++) {
//			for(int j = 0; j < array[i].length; j++) {
//				sum += array[i][j];
//				cnt ++;
//			}
//		}
		
		sum = makeSum(array, sum);
		cnt = makeCount(array);
		avg = (double)sum / cnt;		
		
		System.out.println("sum: "+sum);
		System.out.println("avg: "+avg);		
	} // main	

	private static int makeSum(int[][] array, int sum)
	{
		for( int[] arr1 : array) {
			for(int value : arr1) {
				sum = sum + value;			
			}
		}
		return sum;
	}
	
	public static int makeCount(int [][] array) {
		int count = 0;
		for ( int[] arr1 : array) {
			count = count + arr1.length;
		}
		return count;
	}
}
