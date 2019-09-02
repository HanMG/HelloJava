package classExample.car;

public class Car
{
	private int speed;
	private boolean stop;
	
	public int getSpeed() { //getter
		return speed;
	}
	
	public void setSpeed(int speed) { //setter
		if(speed < 0) {
			this.speed = 0;
		}
		else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() { //getter
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
