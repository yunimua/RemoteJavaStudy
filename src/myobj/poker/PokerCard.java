package myobj.poker;

import java.util.*;

/*
		poker
			- �ο� ��Ʈ����Ʈ �÷��� : ���� ����, 10 / J / Q / K / A
			- �� ��Ʈ����Ʈ �÷��� : ���� ����, A / 2 / 3 / 4 / 5
			- ��Ʈ����Ʈ �÷��� : ���� ����, ���ӵ� ���� 5��
			- ��ī�� : ���� ���� 4��
			- Ǯ�Ͽ콺 : ���� ���� 3��, ���� ���� 2��
			- �÷��� : ���� ���� 3��
			- �� ��Ʈ����Ʈ : A / 2 / 3 / 4 / 5
			- ��Ʈ����Ʈ : ���ӵ� ���� 5��
			- Ʈ���� : ���� ���� 3��
			- ����� : ���� ���� 2��
			- ����� : ���� ���� 1��
			- ����� : ���� ���� ���� 1������ ����
			- ���� �� ���� ��� ? : �� > �� > �� > �� (�ٸ� ��쵵 ����..���׸��� �ٸ�)

*/

public class PokerCard {
	
//    private static final String[] CARD = {"��A", "��2", "��3", "��4", "��5", "��6", "��7", "��8", "��9", "��10", "��J", "��Q", "��K", 
//    		"��A", "��2", "��3", "��4", "��5", "��6", "��7", "��8", "��9", "��10", "��J", "��Q", "��K",
//    		"��A", "��2", "��3", "��4", "��5", "��6", "��7", "��8", "��9", "��10", "��J", "��Q", "��K",
//    		"��A", "��2", "��3", "��4", "��5", "��6", "��7", "��8", "��9", "��10", "��J", "��Q", "��K"};
	
	final public static int NUM_OF_SUITS = 4; 
	final public static int NUM_OF_RANKS = 13;
	final public static int CARD_SIZE = NUM_OF_SUITS * NUM_OF_RANKS;
	
	PokerCard() {
		ArrayList deck = new ArrayList(NUM_OF_SUITS * NUM_OF_RANKS);
		
		for (int i = 0; i < NUM_OF_SUITS; ++i) {
			for (int j = 0; j < NUM_OF_RANKS; ++j) {
				deck.add(new CardSet(i, j + 1));
			}
		}
		Collections.shuffle(deck);
	}
	
	public void tableSet() {
		
	}
	
}

class CardSet {
	
	private int rank, suit;
	
    private static char[] SUITS = {'��', '��', '��', '��'};
    private static String[] RANKS = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    
    CardSet(int rank, int suit) {
    	this.rank = rank;
    	this.suit = suit;
    }
    
    @Override
    public String toString() {
    	return RANKS[rank] + SUITS[suit];
    }
    
}
