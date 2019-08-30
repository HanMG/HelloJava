package hellojava;

import java.util.Scanner;

public class BendingMachine
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("얼마나 투입할지 넣으시요.");
		int input = scan.nextInt();
		int pro_price = 3610;
		int charge = input - pro_price;
		
		int c5000=charge/5000;
		int c1000=(charge%5000)/1000;
		int c500=(charge%1000)/500;
		int c100=(charge%500)/100;
		int c50=(charge%100)/50;
		int c10=(charge%50)/10;			
		
		
		System.out.println("5000원권 : "+ c5000 +"장");
		System.out.println("1000원권 : "+c1000+"장");
		System.out.println("500원권 : "+c500+"장");
		System.out.println("100원권 : "+c100+"장");
		System.out.println("50원권 : "+c50+"장");
		System.out.println("10원권 : "+c10+"장");
		
		
		
		
	}
}
