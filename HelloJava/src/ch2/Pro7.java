package ch2;

public class Pro7
{
	public static void main(String[] args)
	{
		int num = 12345;
		int sum = 0;

		int n10000 = num / 10000;
		int n1000 = (num % 10000) / 1000;
		int n100 = (num % 1000) / 100;
		int n10 = (num % 100) / 10;
		int n = (num % 10);

		sum = n10000 + n1000 + n100 + n10 + n;

		System.out.println("sum = " + sum);
	}
}
