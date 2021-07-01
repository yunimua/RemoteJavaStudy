package quiz;

import java.util.Scanner;

public class B03_MonthToSeason {

	/*	
		����ڷκ��� ���� �Է¹����� �ش��ϴ� ������ ����غ�����
		(switch-case���� ����� ��)
		
		12~2�� �ܿ�
		3~5�� ��
		6~8�� ����
		9~11�� ����
	*/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int month;
		
		System.out.print("�� ���ΰ���? > ");
		month = sc.nextInt();
		
		String season;
		
		switch (month) {
		case 12 : case 1 : case 2:
			season = "�ܿ�";
			break;
		case 3 : case 4 : case 5:
			season = "��";
			break;
		case 6 : case 7 : case 8:
			season = "����";
			break;
		case 9 : case 10 : case 11:
			season = "����";
			break;
		default :
			season = "��������";
			break;
		}
		
		if (month < 1 || month > 12) {
			System.out.println("�߸��� �Է��Դϴ�.");
		}else {
			System.out.printf("%d���� %s�Դϴ�.\n", month, season);
		}
		
		//  �� season �� case�� �ش����� �ʴ� ��쿡�� ����� ���� �ֱ� ������ default �� �ʿ�
		
		
		/* ���� �ۼ��� ����... // case�� ���Ƽ� �ۼ�����
		switch (month) {
		
		case 1 :
			System.out.println("�Է��Ͻ� ���� �ܿ��Դϴ�.");
			break;
		case 2 :
			System.out.println("�Է��Ͻ� ���� �ܿ��Դϴ�.");
			break;
		case 3 :
			System.out.println("�Է��Ͻ� ���� ���Դϴ�.");
			break;
		case 4 :
			System.out.println("�Է��Ͻ� ���� ���Դϴ�.");
			break;
		case 5 :
			System.out.println("�Է��Ͻ� ���� ���Դϴ�.");
			break;
		case 6 :
			System.out.println("�Է��Ͻ� ���� �����Դϴ�.");
			break;
		case 7 :
			System.out.println("�Է��Ͻ� ���� �����Դϴ�.");
			break;
		case 8 :
			System.out.println("�Է��Ͻ� ���� �����Դϴ�.");
			break;
		case 9 :
			System.out.println("�Է��Ͻ� ���� �����Դϴ�.");
			break;
		case 10 :
			System.out.println("�Է��Ͻ� ���� �����Դϴ�.");
			break;
		case 11 :
			System.out.println("�Է��Ͻ� ���� �����Դϴ�.");
			break;
		case 12 :
			System.out.println("�Է��Ͻ� ���� �ܿ��Դϴ�.");
			break;
		default :
			System.out.println("�ش��ϴ� ������ �����ϴ�.");
			break;	
			*/
	}
}
