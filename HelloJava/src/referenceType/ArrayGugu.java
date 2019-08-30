package referenceType;

// 배열 9개, 구구단 2단 결과값을 집어넣고, 출력

public class ArrayGugu
{
	public static void main(String[] args)
	{
		int[] gugu2 = new int[9];
		int sum = 0; // 합
		int avg = 0; // 평균값
		int min = 0; // 최소값
		int max = 0; // 최대값

		for (int i = 1; i < gugu2.length + 1; i++)
		{
			gugu2[i - 1] = i * 2;
			// System.out.println("2 * " + i + " = " + gugu2[i - 1]);
			// 합
			sum += gugu2[i - 1];
		}

		min = 16;

		for (int i = 0; i < gugu2.length; i++)
		{
			// 최소값
			if (min > gugu2[i])
			{
				min = gugu2[i];
			}

			// 최대값
			if (max < gugu2[i])
			{
				max = gugu2[i];
			}
		}

		// 평균
		avg = sum / gugu2.length;
		int temp = 0;
		// System.out.println(sum + " " + avg + " " + min + " " + max);

		// v1

//		while (gugu2[0] != max)
//		{
//			for (int i = 0; i < gugu2.length - 1; i++)
//			{
//				if (gugu2[i] < gugu2[i + 1])
//				{
//					temp = gugu2[i];
//					gugu2[i] = gugu2[i + 1];
//					gugu2[i + 1] = temp;
//				}
//			}
//		}

		// v2

//		for (int i = 1; i < (int) (gugu2.length / 2) + 1; i++)
//		{
//			temp = gugu2[i - 1];
//			gugu2[i - 1] = gugu2[gugu2.length - i];
//			gugu2[gugu2.length - i] = temp;
//		}

		// v2.5
//		int ml = 0;
//		if (gugu2.length % 2 == 1)
//		{
//			ml = (gugu2.length / 2) + 1;
//		}
//		else if (gugu2.length % 2 == 0)
//		{
//			ml = gugu2.length / 2;
//		}
//
//		for (int i = 1; i < ml; i++)
//		{
//			temp = gugu2[i - 1];
//			gugu2[i - 1] = gugu2[gugu2.length - i];
//			gugu2[gugu2.length - i] = temp;
//		}

		// v3
		for (int i = 0; i < gugu2.length / 2; i++)
		{
			temp = gugu2[i];
			gugu2[i] = gugu2[gugu2.length - i - 1];
			gugu2[gugu2.length - i - 1] = temp;
		}	

		// 결과 출력
		for (int i = 0; i < gugu2.length; i++)
		{
			System.out.print(gugu2[i] + " ");
		}

	} // main

}
