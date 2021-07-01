package myobj.bGame;

import java.util.Arrays;
import java.util.Scanner;

public class CardSet {
	
	final public static int CARD_SHAPE = 4; //������ 4��
	final public static int CARD_NUM = 13; // ī�������� 13��
	final public static int SIZE = CARD_SHAPE * CARD_NUM; //�� ������ 52��

	CardName[] cards; //(0��)
	
	private int nextcd;
	
	Scanner sc = new Scanner(System.in);
	
	User user; //(15��) : player Ŭ������ �ҷ��´�
	
	public CardSet() { //+(2��)
		cards = new CardName[SIZE];
		
		for (int i = 0; i < CARD_SHAPE; ++i) {
			for (int j = 0; j < CARD_NUM; ++j) {
				cards[i*CARD_NUM+j]= new CardName(i,j); //+ (1��)�� �����´�
			}
		}	
		mix(1000); //õ������ (6��) : mix ����� �߰�
	}
	
	//(5��)
	public void mix(int su) { //+��� ���� ��, Ƚ���� ���� �ϹǷ� (int "") ������ �ʿ�
		for (int i = 0; i < su; ++i) {
			int a = (int)(Math.random() * SIZE); //+ �����ϰԸ� �����ϸ�, ���������� ���������� �����Ե�
			int b = (int)(Math.random() * SIZE);
			
			CardName temp = cards[a];
			cards[a] = cards[b];
			cards[b] = temp;
		}
	}
	
	public CardName next() { //(7��)
		if( nextcd > SIZE - 1) {
			mix(500); //(8��) = ī�� 52���� ��� ���� �� �ٽ� �����ش�
			nextcd = 0; //(9��) = ������ ���� 0�� �߰����ش�
		}
		return cards[nextcd++];
	}

	@Override
	public String toString() { //(4��)
		return Arrays.toString(cards);
	}

	public static void main(String[] args) { //(3��)
		CardSet cards = new CardSet();
		System.out.println(cards);
//		
//		//System.out.println(Arrays.toString(new CardSet().newCard));
//		 //�� String toString �޼��带 �������̵� �ϱ��������� �� ���·� �����
	}
}

class CardName { //(0��) ó�� ���鶧���� Ŭ������ �߰��ص�
	static char[] CARDPATTERN = {'��', '��', '��', '��'}; // char ������ ������ �뷮 ���̱�, ������� �ʴ� �迭
	static String[] cardName = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	static int[] cardNum = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10}; // ������ ���� ����

	int cdPt;
	int cdName;
	boolean hide; //(14��) : ī�带 ���常 �����δ� ���ǹ�
	
	CardName(int cdPt, int cdName) { //(+1��)
		this.cdPt = cdPt;
		this.cdName = cdName;
	}
	
	@Override
	public String toString() { //(3��)
		return CARDPATTERN[cdPt] + cardName[cdName];
	}
}
