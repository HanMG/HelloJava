package classCon;

public class classConstruct
{
	public static void main(String[] args)
	{
		Construct con = new Construct(1,2);		
		con.print();
		con.print(1);
		con.print(1,2);
	}
}


class Construct
{
	void print() {
		System.out.println("none");
	};
	void print(int a) {
		System.out.println(a);
	};
	void print(int a, int b) {
		System.out.println(a+" "+b);
	};
	
	
	
	//  Overloading
	Construct(){
		System.out.println("Counstruct()");
	}
	
	Construct (int a, int b){
		System.out.println(a + "  "+ b);
	}
	
	Construct(int a){
		System.out.println(a);
	}
	
	Construct(String str){
		System.out.println(str);
	}
	
}