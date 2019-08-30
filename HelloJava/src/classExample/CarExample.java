package classExample;

public class CarExample
{
	public static void main(String[] args)
	{
		Car car = new Car("컨스트럭터");
		
		
		
		System.out.println(car.maker);
		System.out.println(car.type);
		car.master = "LEE";
		System.out.println(car.master);	
		
	}
}
