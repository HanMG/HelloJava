package ch2;

public class Pro9_5
{
	public static void main(String[] args)
	{
		int number = 12321;
		int tmp = number;
		int result = 0; // 변수 number를 거꾸로 변환해서 담을 변수
		int arr[] = new int[5];

		result = reverse(tmp, result, arr);

		System.out.println("number " + number);
		System.out.print("변환값: ");
		for (int value : arr)
		{
			System.out.print(value);
		}

		System.out.println();
		result = 0;
//		for(int i = 0; i < arr.length ; i++) {
//			result *= 10;
//			result += arr[i];			
//		}

		int cnt = 0;
		for (int i = arr.length; i > 0; i--)
		{			
			result += arr[i - 1] * Math.pow(10, cnt);
			cnt++;
		}

		System.out.println(result);

		printReverse(number, result);
	}

	private static void printReverse(int number, int result)
	{
		if (number == result)
		{
			System.out.println(result + "는 회문수 입니다.");
		}
		else
		{
			System.out.println(result + "는 회문수가 아닙니다.");
		}
	}

	private static int reverse(int tmp, int result, int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			result = tmp % 10;
			arr[i] = result;
			tmp /= 10;
		}
		return result;
	}

}
