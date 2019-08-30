package referenceType;

public class ArrayCopy
{
	public static void main(String[] args)
	{
		int[] oldArr = new int[] {10,20,30};
		int[] newArr = new int[5];
		
//		System.arraycopy(oldArr,0,newArr,1,3);
		myArrayCopy(oldArr,1,newArr,2,1);
		
//		for(int i =0; i< oldArr.length; i++) {
//			newArr[i] = oldArr[i];
//		}
		
		for(int i =0; i < newArr.length; i++) {
			System.out.print(newArr[i]+" ");
		}
	}

	private static void myArrayCopy(int[] src, int srcPos, int[] dest, int destPos, int length)
	{
//		for(int i = srcPos; i< (srcPos+length); i++) {
//			dest[destPos++] = src[i];
//		}
		for(int i = 0; i< length; i++) {
			dest[destPos+i] = src[srcPos+i];
		}		
	}
}
