package calculator;

public class CalculatorExample
{
	public static void main(String[] args)
	{
		Calculator cal = new Calculator();
		int result = 0;
		result = cal.add(10, 20, 30);		
		System.out.println(result);
	}
}

// overload
class Calculator
{
	int add(int a, int b)
	{
		return a + b;
	}
	
	double add(double a, double b)
	{
		return a + b;
	}
	
	int add(int a, int b, int c)
	{
		return a + b + c;
	}

	int mins(int a, int b)
	{
		return a - b;
	}

	int mux(int a, int b)
	{
		return a * b;
	}

	int div(int a, int b)
	{
		return a / b;
	}
}
