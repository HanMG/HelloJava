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
		for (int i = 0; i < 31; i++)
		{
			user1.accel();
		}
		for (int i = 0; i < 31; i++)
		{
			user1.stop();
		}
		user1.accel();
		user1.accel();
		user1.printSpeed();
		user1.accel();
		user1.turnOnOff();
		user1.chargeGas(-100);
	}
}

class Car
{
	boolean power;
	String carName;
	String maker = "람보르기니";
	int maxSpeed = 300;
	int currentSpeed = 0;
	int maxGas = 200;
	int currentGas = 0;

	Car(String carName) // 차명과 함께 생성. 동시에 가스 100 가짐.
	{
		this.carName = carName;
		currentSpeed = 0;
		currentGas = 100;
		power = false;
		System.out.println("현재속력은 " + currentSpeed + " | 가스잔량은 " + currentGas + "입니다.");
	}

	void turnOnOff() // 시동 토글, OFF시 ON으로 , ON시 OFF로
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

	void accel() // 속력을 20 증가, 가스 10 소모, 가스 량이 0 되면 시동 정지
	{

		if (power == true && (currentGas - 10) != 0) // 시동이 켜져있고, 가스가 소모되도 0 이 안되는 경우 
		{
			if (currentSpeed < maxSpeed) // 현재 속력이 최대속력이 아님
			{
				if ((currentSpeed + 20) > maxSpeed) // 엑셀을 밟아 속력이 증가되면  최대속력을 넘을 경우
				{
					int p_speed = (currentSpeed + 20) - maxSpeed;
					currentSpeed += p_speed;
					currentGas -= 10;
					printSpeed();
				}
				else // 정상적인 엑셀 기능
				{
					currentSpeed += 20;
					currentGas -= 10;
					printSpeed();
				}
			}
			else if (currentSpeed == maxSpeed) // 시동이 켜져있고, 가스량도 되는데 속력이 최고속력, 엑셀을 밟으니 가스 소모
			{
				System.out.println("현재 최고 속력 입니다!!");
				currentGas -= 10;
				System.out.println(
						"현재 최고 속력 입니다 : " + currentSpeed + " | 가스잔량은 " + currentGas + "입니다.");
			}
		}
		else if (power == false) // 시동이 꺼져있을때 
		{
			System.out.println("시동이 꺼져있습니다.");
		}

		else if ((currentGas - 10) == 0) // 엑셀를 밟는데 가스가 0으로 될때 속력 증가, 가스 소모, 시동 꺼짐
		{
			if ((currentSpeed + 20) > maxSpeed) // 속력 증가가 되면  최대속력을 넘을 경우 
			{
				int p_speed = (currentSpeed + 20) - maxSpeed;
				currentSpeed += p_speed;
			}
			else // 속력 증가가 되도 최대 속력을 넘지않을 경우
			{
				currentSpeed += 20;
			}
			currentGas -= 10;
			power = false;
			System.out.println("!!!! 가스가 다 달았습니다. 충전해주세요. 시동이 꺼집니다. !!!!");
		}

	} // accel end

	void stop() // 정지 , 속력 10씩 감소, 가스는 안바뀜
	{
		if (currentSpeed > 0) // 현재 속력이 0 이상이어서 감소가 가능할 경우
		{
			currentSpeed -= 10;
			printSpeed();
		}
		else
		{
			printSpeed();
		}

	} // stop end

	void chargeGas(int gas) // 가스 를 충전
	{
		if (currentGas + gas <= maxGas && gas > 0) // 충전되는 가스량과 현재의 가스량의 합이 최대 가스량과 같거나 낮으면서 가스가 0이 아닌 경우
		{
			currentGas += gas;
			System.out.println("가스 충전 완료. 현재 가스량 : " + currentGas);
		}

		else if (currentGas == maxGas) // 현재 가스가 최대 가스일때
		{
			System.out.println("가스량이 최대입니다.");
		}

		else if (currentGas + gas > maxGas) // 충전되는 가스량과 현재 가스량의 합이 최대 가스량을 넘어설때
		{
			System.out.println("충전되는 가스량이 너무 많습니다. " + "가능한 양 : " + ((currentGas + gas) - maxGas));
		}

		else if (gas < 0)  // 가스충전에 음수 넣을 경우
		{
			System.out.println("!!!! 가스 뺴기 안됩니다 !!!!");
		}
	} // chargeGas end
	
	void printSpeed() // 속력과 가스를 출력
	{
		System.out.println("현재속력은 " + currentSpeed + "\t가스잔량은 " + currentGas + "입니다.");
	}

}
