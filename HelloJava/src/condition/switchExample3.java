package condition;
//import java.util.Scanner;

public class switchExample3
{
	public static void main(String[] args)
	{
		//Scanner scan = new Scanner(System.in);
		//System.out.print("값을 입력: ");
		//int num = scan.nextInt();
		
		int num = (int)(Math.random()*101);
		
		switch (num/10) {
		case 5:
			System.out.println(num + " F");
			break;
		case 6:
			System.out.println(num + " D");
			break;
		case 7:
			System.out.println(num + " C");
			break;
		case 8:
			System.out.println(num + " B");
			break;
		case 9:
			System.out.println(num + " A");
			break;
		case 10:
			System.out.println(num + " A");
			break;
		default:
			System.out.println(num + " 재수강");				
		}
		
		if( num >= 90)
		{
			System.out.println(num + " A");			
		}
		else if( num >= 80 )
		{
			System.out.println(num + " B");			
		}
		else if( num >= 70 )
		{
			System.out.println(num + " C");			
		}
		else if( num >= 60 )
		{
			System.out.println(num + " D");			
		}
		else if( num >= 50 )
		{
			System.out.println(num + " F");			
		}
		else
		{
			System.out.println(num + " 재수강");		
		}
	}
}
