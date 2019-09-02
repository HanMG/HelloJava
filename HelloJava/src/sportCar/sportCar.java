package sportCar;


class sportCar
{

	boolean power;
	String carName;
	String maker = "람보르기니";
	int maxSpeed = 300;
	int currentSpeed = 0;
	int maxGas = 200;
	int currentGas = 0;

	sportCar(String carName) // 차명과 함께 생성. 동시에 가스 100 가짐.
	{
		this.carName = carName;
		currentSpeed = 0;
		currentGas = 100;
		power = false;
		System.out.println("현재속력은 " + currentSpeed + " | 가스잔량은 " + currentGas + "입니다.");
	}

	boolean turnOnOff()	
	{
		if(currentGas > 0) {
			power = true;
			return !power;
		}
		else {
			System.out.println("Gas가 없어요.");
			return false;
		}
		
	}

	void printSpeed()
	{
		System.out.println("현재속도 : " + currentSpeed);
	}

	void chargeGas(int inputGas)
	{
		int needGas = maxGas - currentGas;
		if (inputGas <= needGas)
		{
			currentGas += inputGas;
		}
		else
		{
			System.out.println(needGas + "보다 적은 양을 주유하세요.");
		}
	}

	void accel()
	{
		if (currentGas != 0)
		{
			if ((power == true) && (currentGas >= 10))
			{
				if ((currentSpeed + 20) <= maxSpeed)
				{
					currentSpeed += 20;
					currentGas -= 10;
				}
				else
				{
					System.out.println("최고속도에 이르렀습니다.");
				}
			}
		}
		else {
			System.out.println("Gas를 충전해주세요.");
		}

	}

	void stop()
	{
		if (currentSpeed >= 10)
		{
			currentSpeed -= 10;
		}
		else
		{
			currentSpeed = 0;
		}
	}
}
