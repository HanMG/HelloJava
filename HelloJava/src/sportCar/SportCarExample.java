package sportCar;

public class SportCarExample
{
	public static void main(String[] args)
	{
		Car user1 = new Car("no1");
		user1.accel();
		user1.turnOnOff();
		user1.chargeGas(200);
		user1.chargeGas(100);
		for(int i = 0; i < 31; i++) {
			user1.accel();
		}		
		for(int i = 0; i < 31; i++) {
			user1.stop();
		}		
		user1.accel();
		user1.accel();
	}
}

class Car
{
	boolean power;
	String carName;
	String maker = "람보르기니";
	int maxSpeed = 300;
	int currentSpeed;
	int maxGas = 200;
	int currentGas;

	Car(String carName)
	{
		this.carName = carName;
		currentSpeed = 0;
		currentGas = 100;
		System.out.println("현재속력은 " + currentSpeed + " | 가스잔량은 " + currentGas + "입니다.");
	}

	void turnOnOff()
	{
		if (power == false)
		{
			power = true;
			System.out.println("시동이 켜졌습니다.");
		}
		else
		{
			power = false;
			System.out.println("시동이 꺼졌습니다.");
		}
	} // turnOnOff end

	void accel()
	{
		
		if (power == true && currentGas > 0)
		{
			if (currentSpeed < maxSpeed && (currentGas - 10) != 0)
			{
				if ((currentSpeed + 20) > maxSpeed)
				{
					int p_speed = (currentSpeed + 20) - maxSpeed;
					currentSpeed += p_speed;
					currentGas -= 10;
					System.out.println("현재속력은 " + currentSpeed + "\t가스잔량은 " + currentGas + "입니다.");
				}
				else
				{
					currentSpeed += 20;
					currentGas -= 10;
					System.out.println("현재속력은 " + currentSpeed + "\t가스잔량은 " + currentGas + "입니다.");
				}
			}
			else if (currentSpeed == maxSpeed)
			{
				System.out.println("현재 최고 속력 입니다!!");
				currentGas -= 10;
				System.out.println(
						"현재 최고 속력 입니다 : " + currentSpeed + " | 가스잔량은 " + currentGas + "입니다.");
			}
		}
		else if (power == false)
		{
			System.out.println("시동이 꺼져있습니다.");
		}

		else if ((currentGas - 10) <= 0)
		{
			power = false;
			System.out.println("가스가 다 달았습니다. 시동 OFF");
		}
		

	} // accel end

	void stop()
	{
		if (currentSpeed > 0)
		{
			currentSpeed -= 10;
			System.out.println("현재속력은 " + currentSpeed + "\t가스잔량은 " + currentGas + "입니다.");
		}
		else
		{
			System.out.println("현재속력은 " + currentSpeed + "\t가스잔량은 " + currentGas + "입니다.");
		}

	} // stop end

	void chargeGas(int gas)
	{
		if (currentGas == maxGas)
		{
			System.out.println("가스량이 최대입니다.");
		}
		else if (currentGas + gas > maxGas)
		{
			System.out.println("충전되는 가스량이 너무 많습니다. " + "가능한 양 : " + ((currentGas + gas) - maxGas));
		}
		else if (currentGas + gas <= maxGas)
		{
			currentGas += gas;
			System.out.println("가스 충전 완료. 현재 가스값 : " + currentGas);
		}
		else if (gas < 0)
		{
			System.out.println("가스 뺴기 안되용");
		}
	} // chargeGas end

	void printSpeed()
	{
		System.out.println("현재속력은 " + currentSpeed + "\t가스잔량은 " + currentGas + "입니다.");
	} // printSpeed end
}
