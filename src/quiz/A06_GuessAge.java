package quiz;

import java.util.Scanner;


public class A06_GuessAge {
	public static void main(String[] args) {
	/*	
	 	����ڷκ��� �¾ �ؿ� ������ �⵵�� �Է¹�����
	 	�� ����� �ѱ� ���̸� ����Ͽ� �� ������ �˷��ִ� ���α׷��� ��������.
		
	*/
	
		Scanner sc = new Scanner(System.in);
	
	System.out.print("1. �¾ �ظ� �Է��ϼ��� >> ");
	int ageyear = sc.nextInt();
	
	System.out.print("2. ���� �⵵�� �Է��ϼ��� >> ");
	int year = sc.nextInt();
	
	int age = year - ageyear + 1;
	System.out.println("����� �ѱ� ���̴� : " + age + "�� �Դϴ�.");

	/*
		(����)
	Scanner sc = new Scanner(System.in);
	int birthYear, thisYear;
	
	System.out.print("�¾ �ظ� �Է� > ");
	birthYear = sc.nextInt();
	
	System.out.print("�� �ظ� �Է� > ");
	thisYear = sc.nextInt();
	
	System.out.println("����� ���̴�" + (thisYear - birthYear + 1) + "�� �Դϴ�.");
	
	*/
	}
}
