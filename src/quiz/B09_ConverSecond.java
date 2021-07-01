package quiz;

import java.util.Scanner;

public class B09_ConverSecond {

	/*
		�ʸ� �Է¹����� ��/��/�ð�/��/�ʷ� ��ȯ�Ͽ� ����غ�����.
		
		�� ��, �ʿ���� ������ ������� �� ��
		
		ex: 0�� 0�� 13�ð� 0�� 5�� �� ��� > 13�ð� 0�� 5�ʸ� ���;� ��
	
	*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ʸ� �Է� > ");
		int second = sc.nextInt();
		
		int[] converted = new int[4];   // ��� 0�� ���ִ�
		int[] seconds = new int[4];		// ����
		String[] units = {"��", "��", "�ð�", "��"};
		
		seconds[0] = 365 * 24 * 60 * 60;
		seconds[1] = 24 * 60 * 60;
		seconds[2] = 60 * 60;
		seconds[3] = 60;
		
		for (int i = 0; i < converted.length; ++i) { // seconds.length�� �ص���
			converted[i] = second / seconds[i];
			second %= seconds[i];
		}
		
		boolean exist = false;
		
		for (int i = 0; i < converted.length; ++i) {
			if (converted[i] !=0 || exist) {
				System.out.printf("%d%s ", converted[i], units[i]);
				exist = true;
			}
		}
		System.out.printf("%d��", second);
		System.out.println();
		
		
//		int y = 0, d = 0, h = 0, m = 0, s = 0;
//		
//		final int SECOND_PER_YEAR = 365 * 24 * 60 * 60; // ��, ��, �ð�, ��
//		final int SECOND_PER_DAY = 24 * 60 * 60;
//		final int SECOND_PER_HOUR = 60 * 60;
//		final int SECOND_PER_MINUTE = 60;
//		
//		System.out.printf("'%d'�ʴ� ��ȯ�ϸ� ", second);
//		
//		y = second / SECOND_PER_YEAR;
//		second %= SECOND_PER_YEAR;
//		
//		d = second / SECOND_PER_DAY;
//		second %= SECOND_PER_DAY;
//		
//		h = second / SECOND_PER_HOUR;
//		second %= SECOND_PER_HOUR;
//		
//		m = second / SECOND_PER_MINUTE;
//		second %= SECOND_PER_MINUTE;
//		
//		boolean exist = false;
//		
//		if (y != 0) { // ���� 0�� �ƴ� �� ���
//			System.out.print(y + "�� ");
//			exist = true;
//		}
//		if (d != 0 || exist) { // ���� 0�� �ƴ� �� ��� // 0�� �ƴϰų� �տ��� ��µǰų�
//			System.out.print(d + "�� ");
//			exist = true;
//		}
//		if (h != 0 || exist) { // �ð��� 0�� �ƴ� �� ���
//			System.out.print(h + "�ð� ");
//			exist = true;
//		}
//		if (m != 0 || exist) { // ���� 0�� �ƴ� �� ���
//			System.out.print(m + "�� ");
//			exist = true;
//		}
//		System.out.println(second + "��");
		
		
//		int year = second / (60 * 60 * 24 * 365);
//		second %= (60 * 60 * 24 * 365);
//		
//		int day = second / (60 * 60 * 24);
//		second %= (60 * 60 * 24);
//		
//		int hour = second / (60 * 60);
//		second %= (60 * 60);
//		
//		int min = second / 60;
//		second %= 60;
//		
//		second %= 60;
//		int se = second;
//		
//		if (year != 0) {
//			System.out.printf("�Է��Ͻ� �ʴ� : %d�� %d�� %d�ð� %d�� %d�� �Դϴ�.", year, day, hour, min, se);
//		}else if (day != 0) {
//			System.out.printf("�Է��Ͻ� �ʴ� : %d�� %d�ð� %d�� %d�� �Դϴ�.", day, hour, min, se);
//		}else if (hour != 0) {
//			System.out.printf("�Է��Ͻ� �ʴ� : %d�ð� %d�� %d�� �Դϴ�.", hour, min, se);
//		}else if (min != 0) {
//			System.out.printf("�Է��Ͻ� �ʴ� : %d�� %d�� �Դϴ�.", min, se);
//		}else {
//			System.out.printf("�Է��Ͻ� �ʴ� : %d�� %d�� �Դϴ�.", se);
//		}
	}
}
