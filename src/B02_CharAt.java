
public class B02_CharAt {

	/*
		# "���ڿ�".charAt(index);
		
		 - �ش� ���ڿ����� ���ϴ� ��°�� ���ڸ� charŸ������ ������ �Լ�
		 - ù ��° ���ڴ� 0�� �ε����� �ִ�
	
		# "���ڿ�".length();
		
		 - �ش� ���ڿ��� �� �� ���������� intŸ������ �˷��ش�
	
	*/
	
	public static void main(String[] args) {
		
		String text = "Hello, everyone!!";
		
		System.out.println(text.charAt(0));
		System.out.println(text.charAt(1));
		System.out.println(text.charAt(2));
		System.out.println(text.charAt(3));
		System.out.println(text.charAt(4));
		
		System.out.println(text.length());
		System.out.println("------------------------");
		
		// 0�� �ε������� 17���� ���ڰ� �ֱ� ������ 16�� �ε����� �������̴�
		System.out.println(text.charAt(16));
		System.out.println(text.charAt(text.length() - 1));
		System.out.println(text.charAt(text.length() - 2));
		System.out.println(text.charAt(text.length() - 3));
		System.out.println(text.charAt(text.length() - 4));
		System.out.println(text.charAt(text.length() - 5));
		
	}
}
