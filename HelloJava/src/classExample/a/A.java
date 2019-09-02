package classExample.a;
// 접근제한

//import classExample.b.B;
//import classExample.b.*;

public class A
{
	//B b = new B();
	
	public int a = 10;
	private void run () {		
	}
	
	int getter() {
		return a;
	}
	void setter(int a) {
		this.a = a;
	}
	public static void main(String[] args) {
		AA aa = new AA();
		aa.run();		
	}
}

//default
class AA{
	A a = new A();
	
	void run() {
		System.out.println(a.getter());
		a.setter(30);
		System.out.println(a.getter());
	}
}
