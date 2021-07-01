package myobj;

public class SocialNumber {

		/*
		����ڰ� �ֹε�Ϲ�ȣ�� �Է��ϸ�
		�� �ֹε�Ϲ�ȣ�� ��ȿ���� �˻��ϴ� ���α׷��� ��������
		
		�� ���ڸ� ����
		�� �ڸ��� 01~12 �̳��� ����
		�� �ڸ��� 01~31 �̳��� ����
		(1,3,5,7,8,10,12���̸� 31 / 4,6,9,11���̸� 30 / 2���� �����϶� 29, �ƴϸ� 28)
		7��° �ڸ� '-'
		���ڸ� ���μ���	
		
		����üũ : (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
		
	*/
	
	// ���ڿ� üũ
	private static boolean checkSocial(char[] socialNumber)  {
		for (int i = 0; i < socialNumber.length; ++i) {
			if ((i == 6) && socialNumber[i] == '-') {
				continue;
			}else if (Character.isDigit(socialNumber[i])) { 											//+ isDigit : ������ ���ڰ� �������� �Ǻ��մϴ�.
				continue;
			}else {
				return false;
			}
		}
		return true;
	}
	
	// ���� 2�� üũ
	private static boolean checkYear(char[] socialNumber)  {
		for (int i = 0; i < socialNumber.length; ++i) {
			int chk1 = (char) (socialNumber[0]-48)*10;
			int chk2 = (char) (socialNumber[1]-48);
			int sum = chk1+chk2;
			if (!((sum % 400 == 0 || (sum % 4 == 0 && sum % 100 != 0)))) {
				continue;
			}else if (!((socialNumber[2] =='0') && (socialNumber[3] =='2'))) {
				continue;
			}else {
				return checkDay29(socialNumber);
			}
		}
		return checkDay31(socialNumber);
	}
	
	// ��(1~12) üũ
	private static boolean checkMonth(char[] socialNumber)  {
		for (int i = 0; i < socialNumber.length; ++i) {
			if ((socialNumber[2] == '0') && (socialNumber[3] >= '1' && socialNumber[3] <= '9')) {
				continue;
			}else if ((socialNumber[2] == '1') && (socialNumber[3] >= '0' && socialNumber[3] <= '2')) {
				continue;
			}else {
				return false;
			}
		}
		return true;
	}
	
	// ���� 2�� 29�� üũ
	private static boolean checkDay29(char[] socialNumber)  {
		for (int i = 0; i < socialNumber.length; ++i) {
			if ((socialNumber[4] == '0') && (socialNumber[5] >= '1' && socialNumber[5] <= '9')) {
				continue;
			}else if ((socialNumber[4] == '1') && (socialNumber[5] >= '0' && socialNumber[5] <= '9')) {
				continue;
			}else if ((socialNumber[4] == '2') && (socialNumber[5] >= '0' && socialNumber[5] <= '9')) {
				continue;
			}else {
				return false;
			}
		}
		return true;
	}
	
	// �Ϲ� 31�� üũ
	private static boolean checkDay31(char[] socialNumber)  {
		for (int i = 0; i < socialNumber.length; ++i) {
			if ((socialNumber[4] == '0') && (socialNumber[5] >= '1' && socialNumber[5] <= '9')) {
				continue;
			}else if ((socialNumber[4] == '1') && (socialNumber[5] >= '0' && socialNumber[5] <= '9')) {
				continue;
			}else if ((socialNumber[4] == '2') && (socialNumber[5] >= '0' && socialNumber[5] <= '9')) {
				continue;
			}else if ((socialNumber[4] == '3') && (socialNumber[5] >= '0' && socialNumber[5] <= '1')) {
				continue;
			}else {
				return false;
			}
		}
		return true;
	}
	
	
	public static void checkValidSocialNumber(char[] socialNumber) {
		boolean vaild = true;
		
		if (socialNumber.length != 14) {
			vaild = false;
			System.out.println("[WARNING] �ֹε�Ϲ�ȣ �Է� ���� �߸��Ǿ����ϴ�.");
		}else if(!checkSocial(socialNumber)) {
			vaild = false;
			System.out.println("[WARNING] ��� ���ڰ� �ƴϰų� -��ġ�� �߸� �ԷµǾ����ϴ�");
		}else if(!checkMonth(socialNumber)) {
			vaild = false;
			System.out.println("[WARNING] MONTH�� �߸� �ԷµǾ����ϴ�.");
		}else if(!checkYear(socialNumber)) {
			vaild = false;
			System.out.println("[WARNING] DAY�� �߸� �ԷµǾ����ϴ�.");
		}else if(!checkDay31(socialNumber)) {
			vaild = false;
			System.out.println("[WARNING] DAY�� �߸� �ԷµǾ����ϴ�.");
		}
		System.out.println(new String(socialNumber) + "�� "
				+ (vaild ? "�ùٸ� �ֹε�Ϲ�ȣ�Դϴ�." : "�ùٸ��� ���� �ֹε�Ϲ�ȣ�Դϴ�."));
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢ�[�����Է�] Check");
		checkValidSocialNumber("001130-3087010".toCharArray());
		System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢ�[-,���ڿ�] Check");
		checkValidSocialNumber("2102054-034010".toCharArray());
		checkValidSocialNumber("890325-s061210".toCharArray());
		System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢ�[��1~12] Check");
		checkValidSocialNumber("993028-1067610".toCharArray());
		System.out.println("�ƢƢƢƢƢƢƢƢƢƢƢƢƢ�[����] Check");
		checkValidSocialNumber("920229-1067610".toCharArray());
		checkValidSocialNumber("920230-1067610".toCharArray());
		// ���� �ƴҶ�, 28�Ϸ� üũ�Ǿ�� ������ �߰�����..
		//checkValidSocialNumber("850229-1067610".toCharArray());
	}
}
