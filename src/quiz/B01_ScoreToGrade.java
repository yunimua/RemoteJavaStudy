package quiz;

import java.util.Scanner;

public class B01_ScoreToGrade {

	/*
		������ �Է¹����� ������ �ش��ϴ� �˸��� ����� ������ִ� ���α׷��� ��������
		
		90�� �̻� : A
		80�� �̻� : B
		70�� �̻� : C
		60�� �̻� : D
		�� �� : F
		
		�� ��ȿ�� ������ 0 ~ 100�� �Դϴ�.
		
	*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int score;
		char grade = 'V';
		
		System.out.println("������ �Է��ϼ��� >> ");
		score = sc.nextInt();
		
		if (score < 0 || score > 100) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}else if (score >= 90) {
			grade = 'A';
		}else if (score >= 80) {
			grade = 'B';
		}else if (score >= 70) {
			grade = 'C';
		}else if (score >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		System.out.printf("����� ����� %s �Դϴ�.\n", grade);
		
		
		// �� �Է��� �޾��� ���� �߸��� ���� ���� �Ÿ��� ���� ����.
		
		/*
		Scanner sc = new Scanner(System.in);
		
		char grade = 'Z';
		int score;
		
		System.out.print("������ �Է����ּ��� > ");
		score = sc.nextInt();

		if (score < 0 || score > 100) {
			System.out.println("�߸��� ������ �Է��ϼ̽��ϴ�.");
			grade = 'F';
		}else if (score >= 90) {
			grade = 'A';
		}else if (score >= 80) {
			grade = 'B';
		}else if (score >= 70) {
			grade = 'C';
		}else if (score >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		System.out.printf("����� ����� %c�Դϴ�.\n", grade);		
		*/
	
		/* ���� �� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է����ּ��� > ");
		int score = sc.nextInt();
		
		if (score < 0 || score > 100) { // �Է°��� ����� �ź��� �Է��ϰ� ����
			System.out.println("������ �߸� �Է��ϼ̽��ϴ�.");
		}else if (score >= 90) {  // 100�� ���� ������ �� �ʿ� ����..(score <=100 �̷���..)
			System.out.println("A���� �Դϴ�.");
		}else if (score >=80) {
			System.out.println("B���� �Դϴ�.");
		}else if (score >=70) {
			System.out.println("C���� �Դϴ�.");
		}else if (score >=60) {
			System.out.println("D���� �Դϴ�.");
		}else if (score < 60) {	
			System.out.println("F���� �Դϴ�.");
		}
		*/
	}
}
