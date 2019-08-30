package starcraft;

public class StarcraftExample
{
	public static void main(String[] args)
	{
		Worker Jone = new Worker("Jone");
		Worker David = new Worker("David");
		
		Jone.attack(David);		
		System.out.println("David : "+David.hp);
		System.out.println("David : "+Jone.hp);
	}
}

class Worker{
	String name;
	int hp = 100;
	int x, y;
	int coal = 0 ;
	
	Worker(String name){
		this.name = name;
	}
	
	void mining(int x, int y) {
		System.out.println(x + "," +y+ "로 이동하여 석탄을 채취합니다.");
		coal = 10;
	}
	
	void attack(Worker worker) {
		worker.hp -= 10;	
		System.out.println(worker.name+"이 공격받고 있습니다.");
	}	
}
