package condition;

public class ForforExample
{
	public static void main(String[] args)
	{
		int i = 1; // 뒷열
		int j = 1; // 앞열
		/*
		 * int z = 1; // 삭제열
		 * 
		 * for (j = 1; j <= 9; j++) { for (i = 1; i <= 9; i++) { if (z != i) {
		 * System.out.print(i + " X " + j + " = " + (i * j) + "\t"); } else {
		 * System.out.print("" + "\t\t"); } } System.out.println(" "); z++; }
		 */
		for (j = 1; j <= 9; j++)
		{
			for (i = 1; i <= 9; i++)
			{
				if ((i-j) != 1)
				{
					System.out.print(i + " X " + j + " = " + (i * j) + "\t");
				}
				else
				{
					System.out.print("" + "\t\t");
				}
			}
			System.out.println(" ");

		}
	}
}
