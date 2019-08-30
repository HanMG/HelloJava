package ch1;

public class Pro8
{
	public static void main(String[] args)
	{
		// char 의 범위 -128~127, 싱글쿼트 0~9 가능 
		char ch = 'z';
		// 아스키 코드값 65 ~ 90 시 대문자, 97 ~ 122시 소문자, 48~57 시 0에서 9의 숫자값. 
		boolean b = (((ch >= 65 && ch <=90) || (ch >= 97 && ch <= 122) || ch >= 48 && ch <= 57 ) ? true : false);
		System.out.println(b);
		
		
		
		
	}
}
