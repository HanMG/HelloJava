package ch2;
//import java.util.Scanner;
public class Pro9
{
	public static void main(String[] args)
	{
		//Scanner scan = new Scanner(System.in);
		//int number = scan.nextInt();
		int number = 12321;
		int tmp = number;
		int result = 0; // 변수 number를 거꾸로 변환해서 담을 변수

		while (tmp != 0)
		{
//			int n10000 = tmp / 10000;
//			int n1000 = (tmp % 10000) / 1000;
//			int n100 = (tmp % 1000) / 100;
//			int n10 = (tmp % 100) / 10;
//			int n = (tmp % 10);
//			result = (n*10000)+(n10*1000)+(n100*100)+(n1000*10)+(n10000);
//			System.out.println(result);
//			break;			
			result *= 10;	
			result =  result + (tmp%10);
			tmp /= 10;
		}	
		

		if (number == result)
		{
			System.out.println(result + "는 회문수 입니다.");
		}
		else
		{
			System.out.println(result + "는 회문수가 아닙니다.");
		}
	}
}
