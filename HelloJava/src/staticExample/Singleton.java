package staticExample;

public class Singleton
{
	static Singleton sing = new Singleton();
	
	static Singleton getInstance()
	{		
		return sing;		
	}
	
	private Singleton() {
		
	}
	
}
