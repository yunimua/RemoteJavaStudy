package myobj.blackJack;

import java.util.Scanner;

public class Blackjack {

	Scanner sc;
	Cards cards;
	Player player;
	Dealer dealer;
	
	public Blackjack() {
		cards = new Cards();
		player = new Player();
		dealer = new Dealer();
		sc = new Scanner(System.in);
	}
	
	public void new_game() { 
		dealer.add(cards.next());
		dealer.add(cards.next());
		
		player.add(cards.next());
		player.add(cards.next());
		
		int pv = -1;
		while (choice()) { //+ hit�̳� stand��, 
			player.add(cards.next());
			
			pv = player.calc();
			if (pv >= 21) { //+ ����Ʈ�϶� ����!break
				break;
			}
		}
		info(); //+�������
		
		if(pv <= 21) { // ������ ���� ī�带 ���� ����, 21���� ũ�ų� ������ ����
			open(); //+  open() �޼ҵ� �߰�
		} else {
			System.out.println("�÷��̾� ����Ʈ!!!");
		}
		
		last_info(); //+ �����鼭 ���� ��� ���� : last_info �޼��� �߰�
		whowin();
		System.out.println("���� ��!!");
	}
	
	private void whowin() {
		int dv = dealer.calc(); //+ ���� ī�� ����
		int pv = player.calc(); //+ �÷��̾� ī�� ����
		
		if (dv == pv) {
			System.out.println("���º�!"); //+ī�� �ջ� ������ ������ ���º�
		}else if (dv > 21 && pv <= 21) {
			System.out.println("�÷��̾� �¸�!");
		}else if (pv > 21 && dv <= 21) {
			System.out.println("������ �¸�!");
		}else if (pv > dv) {
			System.out.println("�÷��̾� �¸�!");
		}else {
			System.out.println("������ �¸�!");
		}
		dealer.tables[0].hidden = false;
	}
	
	
	
	private void open() {
		
		while(dealer.calc() < 17) { //+ 17���� ������ ��� �̾ƶ�
			dealer.add(cards.next());
		}
		dealer.tables[0].hidden = false; //+ �����̾��� ī��(true����)�� false�� �ٲ۴�
	}
	
	private void info() { //+ ������ �� ��� ����
		System.out.println("������ ī��: " + dealer); 
		System.out.println(player + "�� value: " + player.calc()); //+ ���� ���� : player.calc()
	}
	
	private void last_info() { //+ ���� ��� ����
		System.out.println("������ ī��: " + dealer + ", value: " + dealer.calc()); //+ calc���� ����� �� : dealer.calc()
		System.out.println(player + "�� value: " + player.calc());
	}
	
	
	//+ ���̽� ǥ��
	private int input(String notice) {
		System.out.print(notice); //+ boolean choice()���� �Է��� ���� ���
		return sc.nextInt(); //+ Scanner�� �Է��� �� �ְ� �߰�
	}
	
	//+ ���̽� ǥ��
	private boolean choice() {
		while (true) {
			info();
			int choice = input("1. hit\t2. stand > "); //+ input(String notice)���� String���� ���, �Է��ϰ� Scanner�߰�
			
			if (choice  == 1) { //+ 1�� �����ϸ� true;
				return true;
			}else {
				return false;
			}
		}
	}
	
	public static void main(String[] args) { //+ ���ӽ���
		new Blackjack().new_game();
	}
}





