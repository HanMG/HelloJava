package classExample;

public class Car
{
	String maker = "현대";
	String type ="펠리세이드";
	String master = "";
	
	void run() {
		System.out.println("run");
	}
	
	void stop() {
		System.out.println("stop");
	}
	
	void runBack() {
		System.out.println("runBack");
	}
	
	Car(String str){
		System.out.println(str);
	}
	
}
