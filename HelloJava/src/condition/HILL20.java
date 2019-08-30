package condition;

import java.util.Scanner;

public class HILL20
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int com = (int) (Math.random() * 100) + 1;
		int success = 0;

		for (int i = 1; i < 6; i++)
		{
			System.out.print("시도" + i + "| 1~100 사이의 숫자를 입력하시오 : ");
			int num = scan.nextInt();
			if (num > 100 || num < 1)
			{
				System.out.println("ERROR 1~100사이의 값을 입력해주세요.");
				i--;
				continue;
			}
			else if (com == num)
			{
				System.out.println("정답!! COM : " + com);
				System.out.println("----------종료-----------");
				success = 1;
				break;
			}
			else if (com > num)
			{
				System.out.println("오답!! UP");
			}
			else if (com < num)
			{
				System.out.println("오답 !! DOWN");
			}
		}

		if (success == 0)
		{
			System.out.println("실패... COM : " + com);
		}

		scan.close();
	}
}
