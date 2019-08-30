package condition;

import java.util.Scanner;

public class Ex05
{
	public static void main(String[] args)
	{
		/// P135 5번 문제 (4 * X + 5 * Y) == 60

		for (int x = 1; x < 11; x++)
		{
			for (int y = 1; y < 11; y++)
			{
				if ((4 * x + 5 * y) == 60)
				{
					System.out.println(x + ", " + y + " = " + (4 * x + 5 * y));
				}
			}
		}

	}
}
