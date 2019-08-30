package condition;
import java.util.Scanner;
public class RockSP2
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int my = scan.nextInt();
		int com = (int)(Math.random() * 3);
		int result = ((my - com) + 3) % 3;
		String resultStr = "none";
		
		// 나머지 0 , 이김 1, 짐 2
		switch(result) {
		case 0:
			resultStr = "비김";
			break;
		case 1:
			resultStr = "이김";
			break;
		case 2:			
			resultStr = "짐";
			break;
		}		
		System.out.println(resultStr);
		scan.close();
	} // main
}
