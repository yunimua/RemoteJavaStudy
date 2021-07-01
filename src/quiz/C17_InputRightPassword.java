package quiz;

import java.util.Arrays;
import java.util.Scanner;

import myobj.checkpass.IllegalCharacter;
import myobj.checkpass.IllegalLength;
import myobj.checkpass.NotSatisfiedPassword;
import myobj.checkpass.NumericPasswoed;


public class C17_InputRightPassword {

	/*
		# �ùٸ� �н����带 ����� ���� ��Ģ
		
			1. ��� �����̸� �ȵ�
			
			2. �빮�ڿ� �ҹ��� ���� Ư�����ڰ� �����־�� ��
			
			3. Ư�� ���ڴ� !, @, #, $, %, ^, &, *�� ��� ����
			
			4. ��й�ȣ�� ���̰� 8�ڸ� �̻� 24�ڸ� ���Ͽ��� ��
	
		��Ģ�� ��� ��� ���ܸ� �߻����Ѽ� �˸��� �ȳ� ������ ����� ������
		  (���� ��Ģ�� �ѹ��� ���ٰ� �ؼ� ��� ���� ���� �ʿ�� ����)
	*/
	
	public static void main(String[] args) {
		try {
			check_password("asd@sd12fsdSD");
			System.out.println("��й�ȣ�� �����Դϴ�.");
		}catch (IllegalLength e) {
			System.out.println("���̰� �߸��ƽ��ϴ�.");
		}catch (NumericPasswoed e) {
			System.out.println("��� ������ ��й�ȣ �Դϴ�. ����Ͻðڽ��ϱ�? [y/N]");
		}catch (NotSatisfiedPassword e) {
			System.out.println("��й�ȣ���� ����, Ư������, �빮��, �ҹ��ڰ� ��� ���ԵǾ�� �մϴ�.");
		}catch (IllegalCharacter e) {
			System.out.println("������ ���� ���ڰ� �ֽ��ϴ�.");
		}
	}
	
	public static void check_password(String password) 
			throws IllegalLength, NumericPasswoed, NotSatisfiedPassword, IllegalCharacter{ //+���ܸ� ������ üũ�ϰڴ�
		
		int len = password.length(); //+ �Էµ� ������ ������
		
		if (len < 8 || len > 24) { //+ 8���� �۰ų� 24���� ũ�� ���� �޼��� ���
			throw new IllegalLength();
		}
		
		if (check_numeric(password.toCharArray())) {
			throw new NumericPasswoed();
		}
		
		if (!check_charactor_types(password.toCharArray())) {
			throw new NotSatisfiedPassword();
		}
	}
	
	private static boolean check_special(char ch) {
		String permit = "!@#$%^&*";
		
		for (int i = 0; i < permit.length(); ++i) {
			if (ch == permit.charAt(i)) {
				return true; //+ "!@#$%^&*" ���� ��� true
			}
		}
		return false;
	}
	
	private static boolean check_charactor_types(char[] pass) throws IllegalCharacter {		
		int len = pass.length;
		
		boolean num = false;
		boolean low = false;
		boolean upper = false;
		boolean special = false;
		
		for (int i = 0; i < len; ++i) {
			char ch = pass[i];
			if (ch >= '0' && ch <= '9') {
				num = true;
			}else if (ch >='a'&& ch <='z') {
				low = true;
			}else if (ch >='A'&& ch <='Z') {
				upper = true;
			}else if (check_special(ch)) {
				special = true;
			}else {
				throw new IllegalCharacter();
			}
		}
		return num && low && upper && special; //+ 4������ ��� �ش�Ǿ� true
	}
	
	
	private static boolean check_numeric(char[] pass) { //+ char�� �迭�� üũ
		for (int i = 0, len = pass.length; i < len; ++i) {
			char ch = pass[i];
			if(ch < '0' || ch > '9') { //+ 0���� �۰ų� 9���� ũ�� false
				return false;
			}
		}
		return true; //+ 0~9�� �ش��ϸ� true;
	}
}
