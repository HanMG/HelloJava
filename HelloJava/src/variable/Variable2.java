package variable;

public class Variable2
{
	public static void main(String[] arg) {
		byte byteType = 10;
		System.out.println(byteType);
		
		int intType = 0;
		intType = (int)byteType;
		System.out.println(intType);
		
		intType = 128;
		byteType = (byte)intType;
		System.out.println(byteType);
		
		long longType = 123456789;
		System.out.println(longType + intType);
	}
}
