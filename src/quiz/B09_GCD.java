package quiz;

import java.util.Scanner;

public class B09_GCD {
	
	/*
		�� ���ڸ� �Է¹ް� �� ������ �ִ������� ���غ�����.
		
		# �ִ�����
		
		 - �� ������ ����� �� ���� ū �����
		 
		 20 : 1, 2, 4, 5, 10, 20
		 50 : 1, 2, 5, 10, 25, 50
		 
		�� ��� 10�� �ִ� ������� 
	*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1. ���� �Է��ϼ��� > ");
		int num1 = sc.nextInt();
		System.out.print("2. ���� �Է��ϼ��� > ");
		int num2 = sc.nextInt();
		
//		int max = num1 > num2 ? num1 : num2;		// ū �� = 20 > 50 ? 50 
//		int min = num1 < num2 ? num1 : num2;		// ���� �� = 20 < 50 ? 20
		
		int max = Math.max(num1, num2);				// Math.max : () �� ���� �� ū����
		int min = Math.min(num1, num2);				// Math.max : () �� ���� �� ��������
		
		int gcd = 1;
		
		for (int i = 1; i <= min; ++i) {			// i�� ������(20)�̶� ���� �� ���� ����. => why ? �������� ������ ������ 0�̵Ǵ� ���� ���� ū���̹Ƿ�!
			if (min % i == 0 && max % i == 0) {		// ������(50), ū��(20)�� i�� ������ �� �� ������ ���� ���� ��
				gcd = i;
			}
		}
		System.out.println("�ִ� ������� " + gcd + "�Դϴ�");
		// System.out.printf("%d�� %d�� �ִ� ������� %d�Դϴ�.", num1, num2, gcd);
		
	}
}
