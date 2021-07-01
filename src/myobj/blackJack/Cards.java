package myobj.blackJack;

import java.util.Arrays;

public class Cards {
	
	final public static int NUM_OF_SUITS = 4; //+������ 4��
	final public static int NUM_OF_RANKS = 13; //+ ��ũ�� 13���� �ִ�
	final public static int CARD_SIZE = NUM_OF_SUITS * NUM_OF_RANKS;
	
	Card[] cards; //+Card Ŭ������ cards �迭�� �߰�..
	//+ cards��� �迭�� ���ڸ� ä���ְ�(1), int �迭�� ���ڿ� ���� char���� String �迭���� ����� �־� ����Ѵ�
	
	private int cursor;
	
	public Cards() {
		cards = new Card[CARD_SIZE]; //+�� ī�� ��
		
		for (int i = 0; i < NUM_OF_SUITS; ++i) {
			for (int j = 0; j < NUM_OF_RANKS; ++j) {
				cards[i * NUM_OF_RANKS + j] = new Card(i, j); //+ 0 * 13 + 0 = 0����.. => new card(0, 0) ���͵���.
			}
		}
		shuffle(1000); //+ ī�带 õ�� ���´�, (1000  = shuffle > int times)
	}
	//+ �����ִ� �޼���
	public void shuffle (int times){ //+ int times ��� ���� ���� ���� ��
		for (int i = 0; i < times; ++i) {
			int x = (int)(Math.random() * CARD_SIZE);
			int y = (int)(Math.random() * CARD_SIZE);
			
			Card temp = cards[x];
			cards[x] = cards[y];
			cards[y] = temp;
		}
	}
	
	public Card next() { //+ī�带 �ϳ��� ������ �޼���
		// �� �κп� �˸��� �ҽ��� �����غ�����
		if (cursor > CARD_SIZE -1) {
			shuffle(500); //+ �ٽ� �����ش� (+1�̷���)
			cursor = 0; //+ 52���� �Ѿ�� (����)�����ϱ� 0���� �ٲ㼭 �ִ´�
		}
		return cards[cursor++]; //+ % CARD_SIZE �� ������ (-1���̷���), : cards[cursor++ % CARD_SIZE]; 
	}
	
	@Override
	public String toString() {
		return Arrays.toString(cards); //+ ī�带 ���� ���ڷ� String �ؼ� �����ֱ����� return��
	}
	
	public static void main(String[] args) {
		Cards cards = new Cards();
		System.out.println(cards);
		
		for (int i = 0; i < 30; ++i) {
			System.out.println(i + "��°�� ���� ī�� : " + cards.next()); //+ next �޼��带 ���� �����ϰ� ������ ī����� ����� ���
		}
		
		
//		System.out.println(Arrays.toString(new Cards().cards)); //+ Cards�� �ҷ��ͼ� �ȿ� cards�� �ҷ��´�
//		//+ �� ������ String ���·� ���� ���ؼ��� �Ʒ��� SUITS[suit] + RANKS[rank]; return�� �ʿ��ϴ�, �ȱ׷� �迭 �ּҷ����..
//		
//		System.out.println(new Card(0,0).toString());
//		
//		// println()�� ��� ������ �ν��Ͻ��� toString()�� ȣ���� �ֿܼ� ����ϴ� �޼����
//		System.out.println(new Integer(10).toString());
//		
//		// JAVA�� ��� Ŭ������ toString() �޼��带 ������ �ִ�
//		// ��� Ŭ������ �θ��� Object Ŭ������ toString()�� ������ �ִ�
//		Object o1 = 10;
//		Object o2 = "ABCD";
//		Object o3 = new Card(1, 5); //+ Object�� �θ��̱� ������ ��� ���� �־� ����� �� �ִ�
	}
}

class Card {
	
	private static char[] SUITS = {'��', '��', '��', '��'};
	private static String[] RANKS = {
			"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"}; //+10������ String�迭�� �Ǿ���Ѵ�
	private static int[] VALUES = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
	
	int suit; //+ ī�� �ν��Ͻ� �迭�̴�!
	int rank; //+ ī�� ����üũ��..
	boolean hidden; //+ ī�尡 �������ִ��� üũ : public String toString() ���⼭ üũ�� 
	
	public Card(int suit, int rank) {
		this.suit = suit; //+ {'��', '��', '��', '��'};�� �����ֱ� ���� �ν��Ͻ� �迭
		this.rank = rank; 
	}
	
	int getValue() { //+ VALUES ���� �����ϱ� ���� �޼���
		return VALUES[rank];
	}
	
	// # Ŭ������ toString() �޼��带 �������̵�
	//  - �� Ŭ������ ���ڿ��� ǥ���Ǿ�� �� �� ��� ������ �ϴ����� ������ ���´�
	@Override //+ (ctrl+�����̽�) + toString �������̵�
	public String toString() {
		if(hidden) {
			return "H";
		}else {
			return SUITS[suit] + RANKS[rank];
		}
		
		//return (hidden ? "H" : SUITS[suit]) + (hidden ? "" : RANKS[rank]); 
		//+ hidden�̸� ������ H�� ǥ��, ���ڴ� ǥ������ �������� ���ǹ��� �� ����, if������ ��ü
		
		//+ return SUITS[suit] + RANKS[rank];
		//+  �� ���� (new Cards().cards) �� String ���·� �����ִ°�
	}
	
}