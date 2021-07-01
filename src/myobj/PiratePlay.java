package myobj;

import java.util.Scanner;

public class PiratePlay {
	
	int hole; // ���� ��
	int player; // �÷��̾� ��
	
	int lose_hole; //����
	int choice_hole;//�÷��̾ ������ ��
	
	boolean[] choice; //+�ʱⰪ�� ��� false
	boolean[] overlap;
	
	Scanner sc = new Scanner(System.in);
	
	public PiratePlay(int player, int hole) {
		this.hole = hole;
		this.player = player;
	}
	
	public boolean popUp; //+ Ƣ��ͼ� ���� ����Ǵ� ��
	
	public void checkHole(int hole) {
		choice = new boolean[hole]; //������ ī�� �迭
		overlap = new boolean[hole]; //����ī�� �迭
		
		for (int i = 0; i < 3; ++i) {
			overlap[(int)(Math.random()*hole)] = true;
		}
	}
	
	public boolean Select(int num) {
		if(choice[num]) {
			return false;
		}else {
			choice[num] = true;
			popUp = overlap[num];
			return true;
		}
	}
	
	public void choicePrint() {
		for (int i = 0, len = choice.length; i < len; ++i) {
			System.out.print(!choice[i] ? "�� " : "�� ");
		}
		System.out.println();
	}

	public void new_Game() {
		while(player < 2) {
			System.out.print("�÷��� �� �ο�(2����̻�) �Է�: ");
			player = sc.nextInt();
		}
		while(hole < player || hole == player) {
			System.out.print("�� ���� ���� �Է�: ");
			hole = sc.nextInt();
		}
		checkHole(hole);
		
		int i = 0;
		while(i < hole) {
			choicePrint();
			System.out.printf("�÷��̾�[%d] ��� > ", i % player+1);
			choice_hole = sc.nextInt();
			
			if(choice_hole > hole || choice_hole < 1) {
				continue;
			}
			if (Select(choice_hole - 1)) {
				if(popUp) {
					System.out.println("�й�...");
					break;
				}else {
					System.out.printf("���� ����!! ���� > \n", i % player+1);
					++i;
				}
			}else {
				System.out.println("�̹� � ��ġ �Դϴ�. �ٽ� ���� > ");
			}
		}
		System.out.println("Į�� ��� ����Ͽ����ϴ�.");
	}
}
