
public class D04_WrapperClass {

	/*
		# Wrapper Class
	
		  - �⺻ Ÿ�Ե��� ������ Ÿ������ ���γ��� Ŭ������
		  - �� �⺻ Ÿ�Ե鿡 ���� ������ ��ɵ��� ���ִ�
		  
		# �⺻�� Ÿ�Ե�
		
		  - byte, short, char, int, long, float, double, boolean
		  
		# �⺻���� ���� ������ Ÿ���� �̸�
		
		  - Byte, Short, Character, Integer, Long, Float, Double, Boolean
	*/
	public static void main(String[] args) {
		
		/*
			# parsing
			
			  - ���ڿ��� ���ϴ� Ÿ������ ��ȯ ��Ű�� ��
			  - �� Ÿ���� Wrapper Ŭ������ static �޼���μ� �����Ѵ�
		*/
		
		//+ ���� ��ȯ�ϴ� ��� (��ũ���� ���ڷ�)
		int num = Integer.parseInt("123");
		System.out.println(num);
		
		//+ �� String �� ���ڷ� ��ȯ : char ������ �ٲٰ�, int ������ ...
//		for (int i = 0; i < "123".length(); ++i) {
//			char ch = "123".charAt(i);
//			int num = ch - '0';
//		}
		
		double d = Double.parseDouble("123.1234");
		System.out.println(d);
		
		/*
			# toString
			
			  - �� Ÿ���� ���� ���ڿ��� ��ȯ��Ű�� ���
			  - �������̵� ������ toString���� �ٸ���
		*/
		
		String result = Integer.toString(89999999);
		System.out.println(result);
		
		//+ 2����
		result = Integer.toString(89999999, 2);
		System.out.println(result);
		
		//+ 36���� �̻��� ������ ����, 36���������� �ȴ�.
		// �� ���α׷��ӵ鿡�Դ� 2����, 8����, 16������ �߿��ϴ�
		for (int radix = 2; radix <= 36; ++radix) {
			result = Integer.toString(89999999, radix);
			System.out.println(radix + "���� : " + result);
		}
		
		System.out.println(Integer.MAX_VALUE); //2147483647
		System.out.println(Long.MAX_VALUE); //9223372036854775807
		System.out.println((int)Character.MAX_VALUE); //65535 �ִ밪 ǥ�õ�
		
		// �� Character���� ���ڸ� ���ϰ� �ٷ� �� �ִ� static �޼������ ����.
		Character.isLowerCase('a'); //+ �̰� ���ĺ��̴�?
		Character.isDigit('9'); //+ �̰� ���ڴ�? 
		
		System.out.println(Character.isLowerCase('a'));

	}
}
