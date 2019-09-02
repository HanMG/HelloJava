package staticExample;

public class Calculator
{
	static double PI = 3.14159; // 상수
	
	static {
		int staticValue = 0;
		int staticResult = 0;
		int staticMux = staticValue * staticResult;
	}
	
	int mux(int x, int y) {
		return x*y;
	}
}
