package myobj.blackJack;

public class Dealer extends Player { //+player�� ������ �����̹Ƿ� ��ӹ޴´�

	
//	Dealer() {
//		tables = new Card[11];
//	}
	
	void add(Card card) {
		if(count == 0) {
			card.hidden = true; //+ù��°ī�常 ��������, 1�常 �����ش�
		}
		if (card.rank == 0) {
			ace_count++;
		}
		
		tables[count++] = card;
	}
	
}
