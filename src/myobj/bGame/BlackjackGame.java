package myobj.bGame;

public class BlackjackGame {

	CardSet cards; //(16��)
	User user; //(18��)
	
	BlackjackGame() { 
		cards = new CardSet();  //(17��)
		user = new User(); //(20��)
	} 

	public void newGame() {
		
		user.add(cards.next()); // player���� ī�� 2��
		user.add(cards.next());
		
		System.out.println(user);
	}
	
	public static void main(String[] args) {
		new BlackjackGame().newGame();
	}
}
