package quiz;

import java.util.Scanner;

public class B01_AppleQuiz {
	public static void main(String[] args) {
		
		/*
			����� 10���� ���� �� �ִ� �ٱ��ϰ� �ִ�.
			
			����ڰ� �����ϰ� ���� ����� ������ �Է��ϸ�
			����� ��� ������� �ʿ��� �ٱ����� ������ �˷��ִ� ���α׷��� ��������.		
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int apple;
		int basket;
		int basket_su = 10;
		
		System.out.print("������ ��� ������ �Է��ϼ��� >");
		apple = sc.nextInt();
		
		basket = apple / basket_su;
		
		if (apple <= 0) {
			System.out.println("�߸� �Է��߽��ϴ�.");
		}else if (apple % basket_su == 0) {
			System.out.println("�ʿ��� �ٱ��� ������ " + (basket) + "�� �Դϴ�.");
		}else {
			System.out.println("�ʿ��� �ٱ��� ������ " + (basket + 1) + "�� �Դϴ�.");
		}

		
		/* ���� �ۼ��� ���� 
 		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("������ ����� ������ �Է��ϼ��� > ");
		int apple = sc.nextInt();
		int baguni = 10;
		
		if (apple >= 1 && apple <=10) {
			System.out.println("�ʿ��� �ٱ��� ������ 1�� �Դϴ�.");	
		}else if (apple % baguni == 0 && apple >= 11) {
			System.out.println("�ʿ��� �ٱ��� ������ " + (apple/baguni) + "�� �Դϴ�.");
		}else if (apple % baguni != 0 && apple >= 11) {
			System.out.println("�ʿ��� �ٱ��� ������ " + (apple/baguni + 1) + "�� �Դϴ�.");
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		*/
		
		/* if�Ⱦ� ���� ����
		Scanner sc = new Scanner(System.in);
		int apple;
		double basket_size = 10;
		double basket;
		
		System.out.print("��� �� ��? > ");
		apple = sc.nextInt();
		
		basket = apple / basket_size;
		
		// Math.ceil(a) : a�� �Ҽ� ù°�ڸ����� �ø���
		// Math.floor(a) : a�� �Ҽ� ù°�ڸ����� ������
		//System.out.println("�ʿ��� �ٱ����� ���� " + (int)Math.ceil(basket) + "�� �Դϴ�.");
		System.out.println(basket);
		System.out.printf("�ʿ��� �ٱ��� ������ %d�� �Դϴ�.", (int)Math.ceil(basket));
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		int apple;
		int basket_size = 10;
		int basket = 10;
		
		System.out.print("��� �� ��? > ");
		apple = sc.nextInt();
		
		if (apple % basket_size == 0) {
			basket = apple / basket_size;
		}else {
			basket = apple / basket_size + 1;
		}
		
		if (apple < 0) {
			System.out.println("�ùٸ� ��� ������ �ƴմϴ�.");
		}else {
			System.out.printf("�ʿ��� �ٱ����� ������ %d�� �Դϴ�.", basket);
		}*/
	}
}
