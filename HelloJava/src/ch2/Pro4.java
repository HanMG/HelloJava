package ch2;

public class Pro4
{
	public static void main(String[] args)
	{
		int i = 0;
		int j = 0;
		
		while(i<=10) {
			while(j<=i) {				
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
			j=0;
		}
	}
}
