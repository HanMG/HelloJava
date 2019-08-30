package referenceType;

public class StringExample
{
	public static void main(String[] args)
	{
		String strVal1 = "good";
		String strVal2 = "good";
		
		if(strVal1 == strVal2) {
			System.out.println("strVal1, strVal2는 동일");
		}
		
		
		String strVal3 = new String("good");
		
		if(strVal1.equals(strVal3) ) {
			System.out.println("strVal1, strVal3는 동일");
		}
		
		String strVal4 = new String("good");
		
		if(strVal3 == strVal4) {
			System.out.println("strVal3, strVal4는 동일");
		}
		
	}
}
