package condition;

public class Lotto_easy
{
	public static void main(String[] args)
	{
		/*
		 * int number1 = 0; int number2 = 0; int number3 = 0; // 난수 생성 및 중복값 체크 for(int
		 * i = 1; i<4 ; i++) { int number = ((int)(Math.random()*45)+1);
		 * 
		 * if(number1 == 0) { number1 = number; } else if((number2 == 0) && (number1 !=
		 * 0) && (number1 != number)) { number2 = number; } else if((number3 == 0) &&
		 * (number1 != 0) && (number2 != 0) && (number1 != number) && (number2 !=
		 * number)) { number3 = number; } else { i--; } } System.out.println(number1		 * +" "+ number2 +" "+ number3);
		 */
		int num1 = (int)(Math.random()*45)+1;
		int num2 = 0;
		int num3 = 0;
		
		do {
			num2 = (int)(Math.random()*45)+1;
		}while(num1 == num2);
		
		do {
			num3 = (int)(Math.random()*45)+1;
		}while( num1 == num3 || num2 == num3);
		
		System.out.println(num1 +" "+ num2+" "+num3);		
	}	
}
