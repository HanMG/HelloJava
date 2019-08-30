package ch1;

public class Pro9
{
	public static void main(String[] args)
	{
		char ch = 'A';
		// 대문자일시 아스키코드값 + 32를 통해 소문자로 전환, 소문자로 입력시 그대로.
		char lowerCase = ((ch >= 65 && ch <=90) ? (char)(ch + 32) : ch); 
		System.out.println("ch: "+ch);
		System.out.println("ch to lowerCase: "+lowerCase);
		
	}
}
