package staticExample;

public class StaticClass
{
	public static void main(String[] args)
	{
		print();
		System.out.println(Static1.name);
		Static1 s = new Static1();
		System.out.println(s.name);
		s.print();
		
		System.out.println(3*4* Calculator.PI);
		Calculator cal = new Calculator();		
		System.out.println(cal.mux(3, 4) * cal.PI);
	}
	public static void print() {
		System.out.println("StaticClass.print");
	}
}


class Static1 {
	
	static String name = "HAN";
	
	void print() {
		System.out.println("Static.print");
	}
}
