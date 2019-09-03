package ch4;

class SutdaDeck {
	final int CARD_NUM = 30;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	SutdaDeck(){
		for(int i = 0; i < cards.length; i++) {			
			int num = i % 10 + 1;
			boolean isKwang = (i <= cards.length) && (num == 3 || num == 6 || num == 9);
			if((( (i+1)/10 ) / 3) > 0 ) {
				isKwang = true;
			}
			cards[i] = new SutdaCard(i+1, isKwang);
		}
	}
}

class SutdaCard {
	int num;
	boolean isKwang;
	SutdaCard() { this(1,true);}
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	// info () 대신  object 클래스의 toString()을 오버라이딩 했다.
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

public class Pro3
{
	public static void main(String[] args)
	{
		SutdaDeck deck = new SutdaDeck();
		for(int i= 0; i< deck.cards.length; i++) {
			System.out.print(deck.cards[i]+", ");
		}
	}
}

