package quiz;

import java.util.Scanner;

public class B05_Palindrome {
	
	/*
		����ڷκ��� �ܾ �ϳ� �Է¹ް� 
		�ش� �ܾ ȸ���̶�� "PALINDROME"�� ���
		ȸ���� �ƴ϶�� "NOT PALINDROME"�� ���
		
		�� ȸ���̶� - MOM, BOB, ABBA, MADAM, EVE, TXT
	
	*/
	public static void main(String[] args) {
		
		String str = "LEVEL";
		
		int half = str.length() /2;
		int correct = 0;
		
		for(int i = 0; i < str.length() /2; ++i) {
			
			char front = str.charAt(i);
			char back = str.charAt(str.length() - 1 - i);
			
			System.out.printf("'%c'�� '%c'�� ���մϴ�.\n", front, back);
			
			if (front == back) {
				correct++;
			}
		}
		if (correct == half) {
			System.out.println("PALINDROME");
		}else {
			System.out.println("NOT PALINDROME");
		}
		
		
		/*
		
		String reverse = "";
		
		for (int i = str.length()- 1; i > -1; --i) {
			reverse += str.charAt(i);
		}
		
		if (word.equals(end)) {
			System.out.println("PALINDROME");
		}else {
			System.out.println("NOT PALINDROME");
		}
		
		//���� ����
		Scanner sc = new Scanner(System.in);		
		
		String word;
		String end = "";
		
		System.out.print("�ܾ �Է� > ");
		word = sc.nextLine();
		
		int length = word.length(); 
		
		for (int i = length - 1; i >= 0; --i) {
			end += word.charAt(i);
		}
		if (word.equals(end)) {
			System.out.println("PALINDROME");
		}else {
			System.out.println("NOT PALINDROME");
		}*/
	}
}
