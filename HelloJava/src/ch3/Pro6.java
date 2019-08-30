package ch3;

public class Pro6
{
	public static void main(String[] args)
	{
		// 큰 금액의 동전을 우선적으로 거술러 줘야 한다.
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		
		System.out.println("money= "+money);
		
		for(int i = 0; i < coinUnit.length; i++) {
			switch(i) {
			case 0:
				System.out.println("500원 "+money/coinUnit[i]);
				break;
			case 1:
				System.out.println("100원 "+((money%coinUnit[i-1])/100));
				break;
			case 2:
				System.out.println("50원 "+((money%coinUnit[i-1])/50));
				break;
			case 3:		
				System.out.println("10원 "+((money%coinUnit[i-1])/10));
				break;
			}						
		}
	}// main
}
