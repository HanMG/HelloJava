package classCon;

public class MemberExample
{
	public static void main(String[] args)
	{
		Member user1 = new Member("홍길동", "hong");
		user1.login("hong","12345");
		Member user2 = new Member("강자바", "java");
	}
}

class Member
{
	String name; // 이름
	String id; // 아이디
	String password; // 패스워드
	int age = 0; // 나이

	Member(String name, String id)
	{
		this.name = name;
		this.id = id;
		password = "12345";
	}

	void login(String id, String password)
	{
		if ((this.id == id) && (this.password == password))
		{
			System.out.println(id + "로 로그인 되었습니다.");
		}
		else
		{
			System.out.println("로그인 실패");
		}
	}

}
