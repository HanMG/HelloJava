package classExample;

public class TrainExample
{
	public static void main(String[] args)
	{
		Train train = new Train("하행선");
		train.run();
		System.out.println(train.speed);
		train.run();
		System.out.println(train.speed);
		train.run();
		System.out.println(train.speed);
		train.run();
		System.out.println(train.speed);
				
	}
}
