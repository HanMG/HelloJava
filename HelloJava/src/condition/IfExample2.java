package condition;

public class IfExample2
{
	public static void main(String[] args)
	{
		int x = 5;
		int y = 10;

		if (x > y)
		{
			System.out.println(x + "는" + y + "보다 크다.");
		} else
		{
			System.out.println(x + "는" + y + "보다 크지 않다.");
		}

		if (x % 2 == 0)
		{
			System.out.println(x + "는 짝수");
		} else
		{
			System.out.println(x + "는 홀수");
		}

		if ( (y % 3 == 0) && (y != 0) )
		{			
			System.out.println(y + "는 3의 배수");
		}
		else
		{
			System.out.println(y + "는 3의 배수가 아님");
		}		

	}
}
