
public class A03_VarTypes {
	public static void main(String[] args) {

		/*
			# ���� Ÿ��
				- byte (1byte) -128 ~ 127

				1byte => 8bit

				0000 0000(0) ~ 1111 1111(255)  (��ȣ�� ���� ��� 0~255���� ǥ�� ����)
				��ȣ�� ����ϴ� ��쿡�� ù ��° bit�� ��ȣ ��Ʈ�� ����Ѵ�

				byte Ÿ���� ��� ���� 0000 0000(0) ~ 0111 1111(127)
				byte Ÿ���� ���� ���� 1000 0000(-128) ~ 1111 1111(-1)		

				//�� 256����, ù��° ��Ʈ�� ��ȣ��Ʈ[-]


				- short (2byte)
					-32768 ~ 32767
						0111 1111 1111 1111(32767)
						1000 0000 0000 0000(-32768)
				- char (2byte untsigned) �� ���� �ڵ� �����
					0 ~ 65535
				- int (4byte)
					-2^31 ~ 2^31-1
				- long (8byte)
					-2^63 ~ 2^63-1
		*/

		byte a = 10;
		short b = 10;
		char c = 10;
		int d = 10;
		long e = 10;

		byte _byte = 127;
		short _short = 32727;
		char _char = 65535;
		int _int = 2147483647;

		// ����Ÿ�� ���ͷ��� �⺻������ intŸ���̴�
		// intŸ���� ������ ����� ���� ����ϰ� �ʹٸ� �ڿ� l �Ǵ� L�� �ٿ��� �Ѵ�
		long _long = 2000000000000000L;

		System.out.println(a);

		/*
			# �Ǽ� Ÿ��
				- float (4byte)
				- double (8byte)
		
				�Ǽ��� �ַ� �׷��� ��꿡 ���ȴ�
				�ε� �Ҽ��� ����� ����Ѵ�

		*/

		// �Ҽ� ���ͷ��� �⺻������ doubleŸ���̹Ƿ� doubleŸ�� �������� �ƹ� �������� ����
		double _double = 123.1234;
		// �Ҽ� �ڿ� f �Ǵ� F �� �����ָ� floatŸ�� ���ͷ��̶�� ǥ�ð� �ȴ�
		float _float = 123.123f;

		/*
			# ��/���� Ÿ��
				- boolean
		
				�� �� �ִ� ���� true/false �ۿ� ����

		*/
		boolean male = true;
		boolean female = true;
		boolean powerOn = false;
		boolean goonpil = true;
		boolean computerScience = true;

		/*
		  # ������ Ÿ��
		 
		  ������ Ÿ���� �빮�ڷ� �����Ѵ�
		  �ҹ��ڷ� �����ϴ� Ÿ���� ��� �⺻�� Ÿ���̶�� �θ���
		 
		  - String
		  - �� �� ��� Ŭ������..

		*/

		String welcome_message = "hello, world!";
		System.out.println(welcome_message);

		// char Ÿ���� ���� �ڵ� ���� ���� Ÿ���̴�
		char ch = 120;

		char ch2 = 'x';
		int num1 = 'x';
		System.out.println("ch�� ����� �� : " + ch);
		System.out.println("'x'�� ������ charŸ�� ������ ��� : " + ch2);
		System.out.println("'x'�� ������ intŸ�� ������ ��� : " + num1);

		/*
			ch�� ����� �� : x
			'x'�� ������ charŸ�� ������ ��� : x
			'x'�� ������ intŸ�� ������ ��� : 120

		*/
	}
}
