package quiz;

import java.util.Scanner;

public class B02_CheckWord {

	/*
		����ڷκ��� �ܾ �ϳ� �Է¹ް�
		ù ��° ���ڰ� �����̸鼭 ������ ��° ���ڿ� ��ġ�ϸ� "OK"�� ����ϰ�
		��ġ���� ������ "NOT OK"�� ����غ�����.
	
	*/
	
	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);

		String word;
		boolean lowercase, uppercase;
		
		System.out.print("�ܾ �Է��ϼ��� >>");
		word = sc.nextLine();
		
		lowercase = word.charAt(0) >= 'a' && word.charAt(0) <= 'z';
		uppercase = word.charAt(0) >= 'A' && word.charAt(0) <= 'Z';
		
		if (word.charAt(0) != word.charAt(word.length() - 1)) {
			System.out.println("NOT OK");
		}else if (lowercase || uppercase) {
			System.out.println("OK");
		}else {
			System.out.println("NOT OK");
		}
		*/
		
		Scanner sc = new Scanner(System.in);
 		String word;
 		
		System.out.print("�ܾ �Է��ϼ��� >>");
		word = sc.nextLine();
		 		 
		char first_letter = word.charAt(0);
		char last_letter = word.charAt(word.length() - 1);
		
		boolean match = first_letter == last_letter;
		boolean alphabet = ((first_letter >= 'A') && (word.charAt(0) <= 'Z')) || 
							((first_letter >= 'a') && (word.charAt(0) <= 'z'));

		if (match && alphabet) {
		 	System.out.println("OK");
		}else {
			System.out.println("NOT OK");
		 
		 }
		
		 
	}
}
