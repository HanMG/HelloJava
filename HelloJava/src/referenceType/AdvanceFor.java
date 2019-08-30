package referenceType;

public class AdvanceFor
{
	public static void main(String[] args)
	{
		int[] score =
		{ 10, 20, 30, 40, 50 };

		for (int i = 0; i < score.length; i++)
		{
			System.out.println(score[i]);
		}

		for (int value : score)
		{
			System.out.println(value);
		}

		int[][] multiScore =
		{
				{ 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 9 } };

		for (int[] Score : multiScore)
		{
			for (int value : Score)
			{
				System.out.print(value + " ");
			}
			System.out.println();
		}
	}
}
