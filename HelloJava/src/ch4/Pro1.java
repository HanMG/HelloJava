package ch4;

import java.text.DecimalFormat;

public class Pro1
{
	public static void main(String[] args)
	{
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		

		System.out.println("이름 :" + s.name);
		System.out.println("이름 :" + s.getTotal());
		System.out.println("이름 :" + s.getAverage());

	}
}

class Student
{

	int math;
	int eng;
	int kor;
	int no;
	int ban;
	String name;

	int getTotal()
	{
		int total = kor + eng + math;
		
		return total;
	}

	float getAverage()
	{
		float average = (float)(getTotal() / 3.00);
		return (float) (Math.round(average * 100) / 100.0);


	}

}
