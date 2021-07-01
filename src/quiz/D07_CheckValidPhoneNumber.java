package quiz;

import java.util.ArrayList;
import java.util.HashMap;

import myobj.Student;

public class D07_CheckValidPhoneNumber {

	/*
		����ڷκ��� �Է¹��� ���ڿ��� �ڵ��� ��ȣ���� �����ϴ� ���α׷��� ��������
		
		�ڵ�����ȣ�� �̷���� ����? 010���� ����, �� 11�ڸ���
	*/
	private static boolean checkNumeric(char[] phoneNumber)  {
		for (int i = 0; i < phoneNumber.length; ++i) {
			if ((i == 3 || i == 8) && phoneNumber[i] == '-') {
				continue;
			}else if (!(i == 3 && i == 8) && Character.isDigit(phoneNumber[i])) {
				continue;
			}else {
				return false;
			}
		}
		return true;
	}

	public static void checkValidPhoneNumber(char[] phoneNumber) {
		boolean vaild = true;
		
		String front = "" + phoneNumber[0] + phoneNumber[1] + phoneNumber[2]; 					//+ ""�� ���������� ���ڰ����� ��������
		
		if (!front.equals("010")) {
			vaild = false;
			System.out.println("[WARNING] �� �� ���ڰ� ������ �ʴ� �����Դϴ�.");
		}else if(phoneNumber.length != 13) {
			vaild = false;
			System.out.println("[WARNING] �ڵ��� ��ȣ�� ���̰� �ƴմϴ�.");
		}else if(!checkNumeric(phoneNumber)) {
			vaild = false;
			System.out.println("[WARNING] ���� �ƴ� ���ڰ� ���ԵǾ��ų� -�� ��ġ�� �̻��մϴ�.");
		}
		System.out.println(new String(phoneNumber) + "�� "
				+ (vaild ? "�ùٸ� �ڵ��� ��ȣ�Դϴ�." : "�ùٸ��� ���� �ڵ��� ��ȣ�Դϴ�."));
	}
	
	
//	String phoneNumber;
//	String numberCount;
//	boolean numCheck;
//	ArrayList<String> number;
//	
//	public D07_CheckValidPhoneNumber() {
//		number = new ArrayList<>();
//	}
//	
//	public D07_CheckValidPhoneNumber(String phoneNumber) {
//		this.phoneNumber = phoneNumber;
//	}
//	
//	public void checkNumber(String phoneNumber) {
//		number.add(phoneNumber);
//		for (String chk : number) {
//			if(number.size() != 11) {
//				System.out.println("�޴��� ��ȣ �ڸ� ���� �����մϴ�.");
//			}
//		}
//	}
	
	public static void main(String[] args) {
		checkValidPhoneNumber("010-ssss-2345".toCharArray());	
		checkValidPhoneNumber("010-3344-2345".toCharArray());
		checkValidPhoneNumber("010-344-12345".toCharArray());
		checkValidPhoneNumber("010-344-2345".toCharArray());
		checkValidPhoneNumber("011-3414-3145".toCharArray());
	}
}
