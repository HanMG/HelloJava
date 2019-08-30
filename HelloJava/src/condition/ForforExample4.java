package condition;

// 최대 공약수, 최대 공배수 구하기.

public class ForforExample4
{
	public static void main(String[] args)
	{
		int x = 15;
		int y = 20;
		int gcd = 0; // 공약수중 마지막으로 저장되는 값
		int gcm = 0; // 공배수중 최소

		/*
		 * System.out.println("x의 약수 : "); for(int i = 1; i <=x; i++) { if(x%i == 0) {
		 * System.out.print(i+" "); } } System.out.println();
		 * System.out.println("y의 약수 : "); for( int i = 1; i<=y; i++) { if(y%i == 0) {
		 * System.out.print(i+" "); } } System.out.println();
		 * 
		 * System.out.println("x,y의 공약수 : "); for(int i = 1; i <=y; i++) { if(x%i == 0
		 * && y%i ==0) { System.out.print(i+" "); gcd = i; } } System.out.println();
		 * System.out.println("x,y의 최대공약수 : "+gcd);
		 */

		// 최소 공배수 구하기

		for (int i = y; i <= 1000000; i++)
		{
			if (i%y == 0 && i%x == 0) {
				gcm = i;				
				break;
			}
		}		
		System.out.println(gcm);

	}
}
