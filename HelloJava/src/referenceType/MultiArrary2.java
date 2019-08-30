package referenceType;

public class MultiArrary2
{
	public static void main(String[] args)
	{
		int[][] arr = new int[3][];
		arr[0] = new int[3];
		arr[1] = new int[2];
		arr[2] = new int[4];
		int value = 1;
		
		for( int hang = 0; hang < arr.length; hang++) {
			for(int yol = 0; yol < arr[hang].length; yol++) {
				arr[hang][yol] = value;
				value++;
				System.out.print(arr[hang][yol]+" ");
			}
			System.out.println();
		}
	}
}
