package ch4;

public class Pro4
{
	public static void main(String[] args)
	{
		String str = "123";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
		str = "1234o";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
	}
	
	private static boolean isNumber(String str)
	{	
		int cnt = 0;		
		for( int i =0 ; i<str.length(); i++) {
			if(!(str.charAt(i) >= 48 && str.charAt(i) <= 57)) {
				cnt++;
			}
		}		
		return cnt > 0 ? false : true;		
	}
}
