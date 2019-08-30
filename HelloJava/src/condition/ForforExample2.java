package condition;

public class ForforExample2
{
	public static void main(String[] args)
	{
		int i = 1;
		int j = 1;

		/*
		 * for (i = 1; i < 6; i++) { for (j = 1; j < i + 1; j++) {
		 * System.out.print("*"); } System.out.println(" "); } for (i = 4; i > 0; i--) {
		 * for (j = 0; j < i; j++) { System.out.print("*"); } System.out.println(" "); }
		 */
		for(i = 1; i < 9 ; i++) {
			if(i <= 5) {
				for(j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			else if(i > 5) {
				for(j = 9; j > i; j--) {
					System.out.print("*");
				}
				System.out.println();				
			}
			
		}
	}
}
