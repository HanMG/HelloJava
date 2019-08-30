package referenceType;

public class MethodExampleMax
{
	public static void main(String[] args)
	{
		int maxnum = 0;
		maxnum = max(1, 2, 3);
		System.out.println(maxnum);
	}

	public static int max(int a, int b, int c)
	{
		int max = 0;
//		if (a > b && a > c)
//		{
//			max = a;
//		}
//		else if (b > a && b > c)
//		{
//			max = b;
//		}
//		else if (c > a && c > a)
//		{
//			max = c;
//		}
//		else if (a == b && a == c)
//		{
//			max = a;
//		}
//		else if (a == b)
//		{
//			max = a > c ? a : c;
//		}
//		else if (a == c)
//		{
//			max = a > b ? a : b;
//		}
//		else if (b == c)
//		{
//			max = b > a ? b : a;
//		}		
		
		
		// 삼항연산자로
		max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c); 
		return max;
		

		
	}
	
	
}
