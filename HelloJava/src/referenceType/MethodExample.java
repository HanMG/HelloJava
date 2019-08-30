package referenceType;

public class MethodExample
{
	public static void main(String[] args)
	{
		int[] gugu2 =
		{ 10, 20, 30 };

		int re = swap(gugu2, 2);

		System.out.println(re);

		// 결과 출력
		for (int i = 0; i < gugu2.length; i++)
		{
			System.out.print(gugu2[i] + " ");
		}		
	
	} // main

	public static int swap(int[] gugu2, int re)
	{
		int temp = 0;
		for (int i = 0; i < gugu2.length / 2; i++)
		{
			temp = gugu2[i];
			gugu2[i] = gugu2[gugu2.length - i - 1];
			gugu2[gugu2.length - i - 1] = temp;
		}
		return re;

	} // swap


}
