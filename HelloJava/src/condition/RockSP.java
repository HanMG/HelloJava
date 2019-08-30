package condition;

import java.util.Scanner;

public class RockSP
{
	public static void main(String[] args)
	{
		/// 가위바위보

		Scanner scan = new Scanner(System.in);

		for (;;)
		{

			System.out.print("0(가위) | 1(바위) | 2(보자기) 중 하나를 내시오: ");
			int input = scan.nextInt();
			int com = (int) ((Math.random() * 3));

			if (input == 0)
			{
				if (com == 2)
				{
					System.out.println("나 : 가위  | 컴 : 보자기 | 결과: 이겼습니다.");
					System.out.println("--------------종료-------------------");
					break;
				}
				else if (com == 1)
				{
					System.out.println("나 : 가위  | 컴 : 바위 | 결과: 졌습니다.");
					System.out.println("--------------다시-------------------");
				}
				else if (com == 0)
				{
					System.out.println("나 : 가위  | 컴 : 가위 | 결과: 비겼습니다.");
					System.out.println("--------------다시-------------------");
				}

			}
			else if (input == 1)
			{
				if (com == 0)
				{
					System.out.println("나 : 바위  | 컴 : 가위 | 결과: 이겼습니다.");
					System.out.println("--------------종료-------------------");
					break;
				}
				else if (com == 2)
				{
					System.out.println("나 : 바위  | 컴 : 보자기 | 결과: 졌습니다.");
					System.out.println("--------------다시-------------------");
				}
				else if (com == 1)
				{
					System.out.println("나 : 바위  | 컴 : 바위 | 결과: 비겼습니다.");
					System.out.println("--------------다시-------------------");
				}
			}
			else if (input == 2)
			{
				if (com == 1)
				{
					System.out.println("나 : 보자기  | 컴 : 바위 | 결과: 이겼습니다.");
					System.out.println("--------------종료-------------------");
					break;
				}
				else if (com == 0)
				{
					System.out.println("나 : 보자기  | 컴 : 가위 | 결과: 졌습니다.");
					System.out.println("--------------다시-------------------");
				}
				else if (com == 2)
				{
					System.out.println("나 : 보자기  | 컴 : 보자기 | 결과: 비겼습니다.");
					System.out.println("--------------다시-------------------");
				}
			}
			else
			{
				System.out.println("ERROR: 0~2사이의 값을 넣으시오!!!");
				continue;
			}
		} // for문
		scan.close();
	} // main
}
