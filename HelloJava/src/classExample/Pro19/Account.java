package classExample.Pro19;

public class Account
{
	static final int MIN_BALANCE = 0; // account class 안에서만 사용 가능
	static final int MAX_BALANCE = 1000000;
	private int balance = 0;
	
	int getBalance() {  // balance 출력을 위해 getter, default로 같은 패키지안에서 사용가능
		return this.balance; 
	}
	void setBalance(int balance) // balance 수정을 위해 setter, default로 같은 패키지안에서 사용가능
	{		
		if((balance >=MIN_BALANCE )&&(balance <= MAX_BALANCE)) {
			this.balance = balance;
		}
		else {
			System.out.println("적당한 값을 넣으시오.");
			System.out.println("0 <= Balance <= 1000000");
		}

	}

}
