package referenceType;

public class bubble
{
	public static void main(String[] args)
	{
		int[] arr =
		{ 20, 10, 30, 80 ,50};

		// 오름차순
		bubble_asc(arr);
		

		System.out.println();

		// 내림차순
		bubble_desc(arr);
		

	}

	// 오름차순
	public static void bubble_asc(int[] arr)
	{		
		for (int i = arr.length - 1; i > 0; i--)
		{
			for (int j = 0; j < i; j++)
			{
				if (arr[j] > arr[j + 1])
				{
					swap(arr, j);
				}

			}
		}
		printArray(arr);
	}

	// 내림차순
	public static void bubble_desc(int[] arr)
	{		
		for (int i = arr.length - 1; i > 0; i--)
		{
			for (int j = 0; j < i; j++)
			{
				if (arr[j] < arr[j + 1])
				{
					swap(arr, j);
				}
			}
		}
		printArray(arr);
	}

	private static void printArray(int[] arr)
	{
		for (int value : arr)
		{
			System.out.print(value+" ");
		}
	}

	private static void swap(int[] arr, int j)
	{
		int tmp;
		tmp = arr[j];
		arr[j] = arr[j + 1];
		arr[j + 1] = tmp;
	}

}
