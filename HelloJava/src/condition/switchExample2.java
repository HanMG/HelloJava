package condition;

// 랜덤 함수 예제 

public class switchExample2
{
	public static void main(String[] args)
	{

		int num = ((int) (Math.random() * 6)) + 1;

		switch (num) {
		case 1:
			System.out.println(num);
			break;
		case 2:
			System.out.println(num);
			break;
		case 3:
			System.out.println(num);
			break;
		case 4:
			System.out.println(num);
			break;
		case 5:
			System.out.println(num);
			break;
		case 6:
			System.out.println(num);
			break;
		default:
		}

		if (num == 1)
		{
			System.out.println(num);
		}
		else if (num == 2)
		{
			System.out.println(num);
		}
		else if (num == 3)
		{
			System.out.println(num);
		}
		else if (num == 4)
		{
			System.out.println(num);
		}
		else if (num == 5)
		{
			System.out.println(num);
		}
		else if (num == 6)
		{
			System.out.println(num);
		}
	}
}
