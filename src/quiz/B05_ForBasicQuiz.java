package quiz;

import java.util.Scanner;

public class B05_ForBasicQuiz {
	
	/*
		����ڰ� ���ڸ� �Է����� ��
		
		1. 10���� �Է��� ���ڱ����� ������ ���غ�����.
		
		2. 1000���� �Է��� ���ڱ��� ������� ������ ��������.
		
		3. 1���� �Է��� ���� ������ 5�� ����� ����غ�����.
		
	
	*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int user;
		
		System.out.print("���ڸ� �Է� > ");
		user = sc.nextInt();
		
		int total = 0;

		for (int i = 10; i <=user; ++i) {
			total += i;
		}
		System.out.println("10���� �Է��� ������ �� ���� " + total + "�Դϴ�.");

		if (user > 1000) {
			for (int i = 1000; i <=user; ++i) {
				System.out.println("1000���� �Է��� ���ڱ��� ��� > " + i);
			}
		}else {
			for (int i = 1000; i >=user; --i) {
				System.out.println("1000���� �Է��� " + user + "���� ��� > " + i);
			}
		}
		
		if (user > 1) {
			for (int i = 1; i <=user; ++i) {
				if (i % 5 == 0) {
					System.out.println("5�� ����� ��� : " + i);
				}
			}
		}else {
			for (int i = 1; i >=user; --i) {
				if (i % 5 == 0) {
					System.out.println("5�� ����� ��� : " + i);
				}
			}
		}
		
		
		/*
		//1��
		
		int sum = 0;
		
		int start, end; 
		
		if (user > 10) {
			start = 10;
			end = user;
		}else {
			start = user;
			end = 10;
		}
		
		for (int i = 10; i <= user; ++i) { // user�� 10���� Ŭ�� 10���� �Է��� ���ڱ��� �������
			sum += i;
			System.out.println("�������" + sum);
		}
		//System.out.printf("10���� %d������ ������ %d�Դϴ�.", user, sum);
		System.out.println("10���� �Է��� ���ڱ��� ������ : " + sum + "�Դϴ�.");
		
		
		// 2��
		if (user > 100) {
			for (int i = 1000; i <= user; ++i) {
				System.out.printf("1000���� %d���� ��� : %d\n", user, i);
			}
		}else {
			for (int i = 1000; i >= user; --i) {
				System.out.printf("1000���� %d���� ��� : %d\n", user, i);
			}
		}
		
		// 3��
		
		if (user > 1) {
			for (int i = 1; i <= user; ++i) {
				if (i % 5 == 0) {
					System.out.printf("1���� %d���� 5�� ����� ��� : %d\n", user, i);
				}
			}
		}else {
			for (int i = 1; i >= user; --i) {
				if (i % 5 == 0) {
					System.out.printf("1���� %d���� 5�� ����� ��� : %d\n", user, i);
				}
			}
		}*/

	}
}

