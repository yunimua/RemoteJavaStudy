package quiz;

import java.util.Random;
import java.util.Scanner;

public class B09_31Game {
	public static void main(String[] args) {
		
		/*
		 	# 31 ������ ��������.
		 	
		 	1. ��ǻ�Ϳ� ����� �����ư��鼭 ���ڸ� �����ؾ� �Ѵ�.
		 		(1,2,3 �ۿ� ������ �� ����)
		 		
		 	2. ��ǻ�ʹ� �������� ���ڸ� �����Ѵ�.
		 	
		 	3. ������ �������� �����Ѵ�.
		 	
		 	4. �������� 31 �̻��� ���ڸ� �θ��� �÷��̾ �й��Ѵ�.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		// 0�� ��ǻ�� 1�� ���
		int turn = (int)(Math.random() * 2);
		int num = 0;
		/*
		if (turn == 0) {
			System.out.println("��ǻ�� ����!");
		}else {
			System.out.println("����� ����!");
		}
		*/
		String msg = turn == 0 ? "��ǻ�� ����" : "����� ����";
		System.out.println(msg);
		
		
		for(; num < 31;) {
		
		//while (num < 31) { // <= �� ���� 31���ᵵ true
			
			if (turn == 0) {
				int com = (int)(Math.random() * 3 + 1);
				num = num + com;
				System.out.printf("��ǻ�Ͱ� %d�� ������ϴ�. [���� ���� : %d]\n", com, num);
				
			}else {
				int user = 0;
				while (user < 1 || user > 3) {
					System.out.print("1,2,3? ");
					user = sc.nextInt();
				}
				num += user;
				
				System.out.printf("[���� ���� : %d]\n", num);
			}
			
			// 0�� 1�� �ݺ��ǰ� ��
			turn = (turn + 1) % 2;
		}
		
		// String winner = turn == 0 ? "��ǻ��" : "�÷��̾�" 
		// System.out.printf("���� ����! %s�� �¸�\n", winner);
		System.out.printf("���� ����! %s�� �¸�\n", turn == 0 ? "��ǻ��" : "�÷��̾�"); // ���� ������

		
		/*if (turn == 0) {
			System.out.println("���� ����! ��ǻ���� �¸�\n");
		}else {
			System.out.println("���� ����! �÷��̾��� �¸�\n");
		}*/
		
		
		/* ���� ����
		int person = 0;
		int com = 0;
		
		for (; person < 0;) {
			System.out.println("�ٽ� �������ּ��� > ");
			System.out.print("> ");
			
			person = sc.nextInt();
		}

		for (int i = 1; i <= 31; ++i) {

			if (i < 31 && i > 0) {
				System.out.print("���ڸ� �����ϼ��� > ");
				person = sc.nextInt();
				System.out.println((int)(Math.random() * 31 + 1));
			}
			
		}*/
	}
}












