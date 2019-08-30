package referenceType;

public class ArrayEx
{
	public static void main(String[] args)
	{
		int[][] arr1 =
		{
				{ 1, 2 },
				{ 3, 4 } };
		int[][] arr2 =
		{
				{ 5, 6 },
				{ 7, 8 }, };

		int arr3[][] = new int[2][2];

		multi(arr1, arr2, arr3);

		for (int i = 0; i < 2; i++)
		{
			for (int j = 0; j < 2; j++)
			{
				System.out.println(arr3[i][j]);
			}
		}

	}

	public static void plus(int[][] arrA, int[][] arrB, int[][] arrC)
	{
		for (int i = 0; i < 2; i++)
		{
			for (int j = 0; j < 2; j++)
			{
				arrC[i][j] = arrA[i][j] + arrB[i][j];
			}
		}

	}

	public static void minus(int[][] arrA, int[][] arrB, int[][] arrC)
	{
		for (int i = 0; i < 2; i++)
		{
			for (int j = 0; j < 2; j++)
			{
				arrC[i][j] = arrA[i][j] - arrB[i][j];
			}
		}
	}

	public static void multi(int[][] arrA, int[][] arrB, int[][] arrC)
	{
		for (int i = 0; i < 2; i++)
		{
			for (int j = 0; j < 2; j++)
			{
				
//				arrC[i][j] = (arrA[i][0] * arrB[0][j]) + (arrA[i][1] * arrB[1][j]);
				
				for(int z = 0; z < 2; z++) {
					arrC[i][j] = arrC[i][j]+ arrA[i][z]*arrB[z][j];
				}
			}
		}
		
//		arrC[0][0] = (arrA[0][0]*arrB[0][0])+(arrA[0][1]*arrB[1][0]);
//		arrC[0][1] = (arrA[0][0]*arrB[0][1])+(arrA[0][1]*arrB[1][1]);
//		arrC[1][0] = (arrA[1][0]*arrB[0][0])+(arrA[1][1]*arrB[1][0]);
//		arrC[1][1] = (arrA[1][0]*arrB[0][1])+(arrA[1][1]*arrB[1][1]);
		
		
	}
}
