package quiz;

import java.util.Scanner;

public class A06_CelToFahr {

	/*
	 	����ڷκ��� ���� �µ��� �Է¹����� ȭ�� �µ��� ��ȯ�Ͽ� ������ִ� ���α׷��� ��������.
	 	(��ȯ ������ �˻� Ȱ��, ����� �Ҽ� ù° �ڸ�����)
	
	
		- ���� : (��C �� 9/5) + 32 = ��F
	*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �µ��� �Է��ϼ��� >> ");
		double celsius = sc.nextDouble();
		
		double fahrenheit = (celsius * 9/5 + 32.0);
		
		System.out.println("�Է��� �� �µ��� �� �µ��� : " + fahrenheit + " �� �Դϴ�.");
		
		/*
			(����)
		int cel, fahr;
		
		System.out.print("���� �µ��� �Է� > ");
		cel = new Scanner(System.in).nextInt();
		// - �ι� �̻� ��ĳ�� ��� �ÿ�, ������ ����. �ѹ����� ������ ���
		
		fahr = cel * 9 / 5 + 32;
		
		System.out.printf("%.1f�ɴ� %.1f���Դϴ�., cel, fahr);
			
		
		*/
	}
}
