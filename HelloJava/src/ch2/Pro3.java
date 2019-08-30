package ch2;

public class Pro3
{
	public static void main(String[] args)
	{
		int i = 1;
		int j = 1;
		int result = 0;
		for(i = 1; i < 11; i++) {
			for(j = 1; j < i+1; j++) {
				System.out.print(j);				
				result += j;				
			}			
			System.out.println();		
		}		
		System.out.println("\n"+result);
	}
}
