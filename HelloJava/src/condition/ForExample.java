package condition;

public class ForExample
{
	public static void main(String[] args)
	{
		int result = 0;
		// 초기 조건 추가
		/*
		 * for (int i = 1; i <= 100; i++) { System.out.println(i + " "); result += i; }
		 * System.out.println("\n" + result);
		 */
		
		for (int i = 1; i <= 100; i++)
		{
			if (i % 2 == 0)
			{
				System.out.println(i);
				result += i;
			}
		}
		System.out.println("\n" + result);
	}
}
