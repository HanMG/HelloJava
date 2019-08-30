package ch1;

public class Pro7
{
	public static void main(String[] args)
	{
		byte a = 10;
		byte b = 20;
		// 변수 연산시 강제 형변환
		byte c  = (byte) (a + b);
		char ch = 'A'; // 'A'의 아스키 코드값 65
		ch = (char) (ch + 2);
		
		//값에 F을 붙여서 구분, 값중 하나만 F 이 붙어도 값이 나옴. 대소문자 안가림
		float f = (3f / 2f); 
		
		//값에 L을 붙여서 구분, 값중 하나만 L 이 붙어도 값이 나옴. 대소문자 안가림
		long l = (3 * 3 * 3)*1000000000L;		
		long l2 = 3000* 3000* 3000L;  
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = (float)d==f2;
		
		System.out.println("c= "+c);
		System.out.println("ch= "+ch);
		System.out.println("f= "+f);
		System.out.println("l= "+l);
		System.out.println("l2= "+l2);
		System.out.println("result= "+result);
			
		
	}
}
