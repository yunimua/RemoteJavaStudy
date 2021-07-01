package myobj.checkpass;

import java.util.Scanner;

public class InputPassword {

	static Scanner sc = new Scanner(System.in);
	
	final static int MIN_DICE_NUM = 8;
	final static int MAX_DICE_NUM = 24;
	
	static String inputp;
	
	public static void passwoed() {
		System.out.print("������ �н����带 �Է��ϼ��� > ");
		inputp = sc.nextLine();
	}

	public static void inputNumber() throws NotAllNumberException {
		String s = inputp;
		
		int num = Integer.valueOf(s); //+���ڸ� ���ڷ�..
		
		if (!(num >= 0 && num <= 9)) {
			throw new NotAllNumberException();
		} 
	}
	
	public static void inputSpecial() throws SpecialCharException {

		
	}
	
	public static void lmitNumber() throws lmitNumberException {
		for (int i = 0; i < MAX_DICE_NUM; ++i) {
			
		}
	}
	
	public static void main(String[] args) {
		while(true) {
			try {
				passwoed();
				inputNumber();
				inputSpecial();
				lmitNumber();
				break;
			} catch (NotAllNumberException e) {
				System.out.println("���ڸ� �Է��� �� �����ϴ�.");
			} catch (SpecialCharException e) {
				System.out.println("Ư�����ڴ� [!, @, #, $, %, ^, &, *]�� ��� �����մϴ�.");
			} catch (lmitNumberException e) {
				System.out.println("�н������ 8�� �̻�, 24�� ���Ϸ� �Է����ּ���.");
			} catch (NumberFormatException e) { //+ ����, ���� ���� �Է½� ������ ���� ����ó��
				
			}
		}
		System.out.println("�н����� ������ �Ϸ�Ǿ����ϴ�.");
	}	
}

class NotAllNumberException extends Exception {
	public NotAllNumberException() {
		super("���ڸ� �Է��� �� �����ϴ�.");
	}
}

class SpecialCharException extends Exception {
	public SpecialCharException() {
		super("Ư�����ڴ� [!, @, #, $, %, ^, &, *]�� ��� �����մϴ�.");
	}
}

class lmitNumberException extends Exception {
	public lmitNumberException() {
		super("�н������ 8�� �̻�, 24�� ���Ϸ� �Է����ּ���.");
	}
}