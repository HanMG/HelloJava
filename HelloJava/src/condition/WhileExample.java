package condition;

public class WhileExample
{
	public static void main(String[] args)
	{
		int i = 1;
		int result = 0;

		/*
		 * while ( i <= 100 ) { if( i%2 == 1){ System.out.println(i); result += i; }
		 * i++; }
		 * 
		 * System.out.println(result);
		 */
		
		i = 0;
		do
		{
			if (i % 2 == 1) // 홀수 찾기 
			{
				System.out.println(i);
				result += i;
			}
			i++;
		} while (i <= 100);

		System.out.println(result);

	}
}
