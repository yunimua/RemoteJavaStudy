package quiz;

import java.util.Scanner;

public class D04_IsJavaVariable {

	/*
		����ڷκ��� ���ڿ��� �Է¹����� �ش� ���ڿ��� �ڹ��� �����ν� ���� �� �ִ���
		�˻��ϴ� �޼��带 ����� �׽�Ʈ�غ�����.	
		
		����ڰ� ����� ���ڸ����� �̷���� ���ڿ��̶�� true, �ƴϸ� false
			(����� ���ڿ� : ���ĺ� �ҹ���, ����, _, $, ù��° ���ڿ� ���� �Ұ�)
		
		(1) ������ ù ���� ���ڴ� ���ڰ� �� �� ����
		(2) ������ ���̿��� ������ ��� �� �� ����
		(3) Ư�����ڴ� _�� $�� ����� �� �ִ�
		(4) �̹� ����ϰ� �ִ� Ű����� ���������� ����� �� ����
		ex : int, short, char, void, static, public ...
	*/
	
	public static void main(String[] args) {
		
		String str = "JAva123";
		
		System.out.println(str.toCharArray());
		
		System.out.println(check("java123".toCharArray()));
	}
	
	public static boolean check(char[] str) {
		// Character.isJavaIdentifierStart : �ڹ� �������� ù ��° ���ڷ� �������� üũ
		boolean check = Character.isJavaIdentifierStart(str[0]); 
		
		// Character.isJavaIdentifierPart : �ڹ� �������� ������ �κ����� �������� üũ
		for (int i = 1; i < str.length; ++i) { 
			check = check && Character.isJavaIdentifierPart(str[i]);
		}
		return check;
	}
}
