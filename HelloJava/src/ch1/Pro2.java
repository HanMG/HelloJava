package ch1;

public class Pro2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int numOfApples = 123; // 사과의 개수
		int sizeOfBucket = 10; // 바구니의 크기
		int numOfBucket =  ((numOfApples%sizeOfBucket)>0) ? (numOfApples/sizeOfBucket)+1 : (numOfApples/sizeOfBucket);// 모든 사과를 담는데 필요한 바구니의 수
		System.out.println("필요한 바구니의 수 : "+numOfBucket);
	}

}
