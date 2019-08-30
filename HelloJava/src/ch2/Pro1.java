package ch2;

public class Pro1
{
	public static void main(String[] args)
	{
		int fahrenheit = 100;
		float celcius = (float)((5.00/9.00) * (fahrenheit - 32.00)); 
		System.out.println("Fahrenheit: "+fahrenheit);
		System.out.printf("Celcius: "+"%.2f",celcius);
	}
}
