package quiz;

import java.util.Scanner;

public class B05_PrintReverse {

	// ����ڰ� � ������ �Է��ϸ� �� ������ �Ųٷ� ����غ�����.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String text;
		
		System.out.print("������ �Է� > ");
		text = sc.nextLine();
		
		for (int i = text.length()- 1; i > -1; --i) {
			System.out.print(text.charAt(i));
		}
		
		
		
		
		
		/*
		Scanner sc = new Scanner(System.in);
		
		String text;
		
		System.out.print("������ �Է� > ");
		text = sc.nextLine();
		
		int cha = text.length()-1;
		
		for (int i = cha; i >= 0; --i) {
			System.out.println(text.charAt(i));
		}*/
	}
}
