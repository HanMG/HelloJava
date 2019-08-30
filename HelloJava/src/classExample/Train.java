package classExample;

public class Train
{
	String type = "2호선";
	int speed = 0;
	
	Train(String dic){
		System.out.println(dic);
	}
	
	void run() {
		speed += 10;
	}
}
