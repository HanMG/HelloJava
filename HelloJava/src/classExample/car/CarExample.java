package classExample.car;

public class CarExample
{
	public static void main(String[] args)
	{
		Car myCar = new Car();
		myCar.setSpeed(-50);
		System.out.println(myCar.getSpeed());
		
		myCar.setSpeed(50);
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
	}
}
