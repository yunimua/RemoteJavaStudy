package quiz;

import java.util.Scanner;

public class B06_is_contain_alpha {

	/*
		1. ����ڰ� �Է��� ���ڿ��� ���ĺ��� ���ԵǾ� ������ true�� ���, ������ false�� ���
		
		2. ����ڰ� �Է��� ���ڿ��� ���ĺ����θ� �̷���� ������ true, �ƴϸ� false
		
		3. ����ڰ� ����� ���ڸ����� �̷���� ���ڿ��̶�� true, �ƴϸ� false
			(����� ���ڿ� : ���ĺ� �ҹ���, ����, _, $, ù��° ���ڿ� ���� �Ұ�)
	*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str;
		
		System.out.print("���ڸ� �Է��ϼ��� > ");
		str = sc.nextLine();	
		
		/* 3�� Ǯ�ٸ���
		boolean check = false;
		
		for(int i = 0; i < str.length(); ++i) {
			
			char ch = str.charAt(i);
			char tm1 = '_';
			char tm2 = '$';
			
			char firstNo = str.charAt(0);
			
			
			if (ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9') {
				if (ch == tm1 || ch == tm2) {
					if (!(ch >= '0' && ch <= '9')) {
						check = true;
				}
			}
			System.out.println(check);
		}*/
		
		
		// 1��
		
		boolean contain = false;
		
		for(int i = 0; i < str.length(); ++i) {
		// for (int i = 0; i < str.length() && !contain; ++i) �� ����ϴ��� �ݺ��� Ż���� ��
			
			char ch = str.charAt(i);
			
			if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
				contain = true;
				break;
			}
		}
		
		System.out.println("��� �ѹ��̶� ������ �ֳ���?" + contain);
		System.out.println("======================================");
		
		//2��
		
		boolean only_alpha = true;
		
		for (int i = 0; i < str.length(); ++i) {
			
			char ch = str.charAt(i);
			
			if (!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))) {
				only_alpha = false;
				break;
			}
		}
		
		System.out.println("��� ���Գ���? " + only_alpha);
		System.out.println("======================================");
		
		//3��
		
		boolean first_letter_check = true, letter_check = true;
		
		//first_letter_check = (str.charAt(0) >= '0' && str.charAt(0) <= '9');
		// �� ���� if�� ��ü ����
		
		
		if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {
			first_letter_check = false;
		}
		
			for (int i = 0; i < str.length(); ++i) {
				char ch = str.charAt(i);
			
				if (!(ch >= '0' && ch >= '9' || ch >= 'a' && ch <= 'z' || ch == '_' || ch == '$')) {  // �����ϴ� ���ڰ� (!) �ƴ� ��
					letter_check = false;
					break;
			}
			
		}
		System.out.println("�ùٸ� ���ڿ��ΰ���?" + first_letter_check);
		System.out.println("�ùٸ� ���ڿ��ΰ���?" + letter_check);
		System.out.println("======================================");

		
	/*		//String alpha = ""; //�켱 ���ܵ� �߸��� ���� ������.
			
			for (int i = text.charAt(0); i >= 0; ++i) {			 
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || 
					str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				System.out.println(true);
				break;
			}else {
				System.out.println(false);
				break;
			}*/

	}
}
