package ch2;

public class Pro2
{
	public static void main(String[] args)
	{
		int i = 0;
		int sum = 0;
		for (i = 1; i < 21; i++) {
			if( (i%2 != 0) && (i%3 != 0)) {
				System.out.println(i);
				sum += i;
			}			
		}
		System.out.println("\n" + "총합은 :"+ sum);
	}
}
