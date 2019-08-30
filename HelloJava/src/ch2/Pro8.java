package ch2;

public class Pro8
{
	public static void main(String[] args)
	{
		// Fibonnaci 수열의 시작의 첫 두 숫자를 1, 1로 한다.
		int num1 = 1;
		int num2 = 1;
		int num3 = 0; // 세번쨰값

		System.out.println(num1 + "," + num2);

		for (int i = 0; i < 8; i++)
		{
			num3 = num1 + num2;
			System.out.println((i + 1) + " 번째, 두 값을 을 더한 값 :" + num3);
			num1 = num2;
			num2 = num3;
		}
	}
}
