package staticExample;

public class SingletonExample
{
	public static void main(String[] args)
	{
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		// Singleton s3 = new Singleton();
		
		if(s1 == s2) {
			System.out.println("같은 객체입니다.");
		}
		else {
			System.out.println("다른 객체입니다.");
		}
	}
}
