
public class C01_Function {
	
	/*
		# �Լ� (Function)
		
		 - ����� �̸� �����صΰ� ���߿� ������ ���� ��
		 - ������ ���������� ������� �ʰ� �Լ� �̸� �ڿ� ()�� �ٿ��� �Լ��� ȣ���ϸ� ����ȴ�
		 
		 - ���߿� ���� �� ���ɼ��� �ִ� ��ɵ��� �̸� ���������ν� �۾��� �ݺ��� ���� �� �ִ�
		 
		 - java���� �Լ�(�޼���)�� �ݵ�� Ŭ���� ���ο� �����ؾ� �Ѵ� 
		 
		 # �Լ��� ���� (return)
		 
		  - �Լ��� ������ �� �Լ��� �տ� �ش� �Լ��� ��ȯ�ϴ� ���� Ÿ���� ���´�
		  
		  - �Լ��� ȣ���ϸ� ȣ���� �ڸ��� �Լ��� ���� ����� ��ȯ(return)�ȴ�		
		  
		  - ����Ÿ�� void�� �ش� �Լ��� ��ȯ�ϴ� ���� ���ٴ� ���� �ǹ��ϴ� ��ȯ Ÿ���̴�
		  
		 # ������ �ŰԺ��� (arguments) = args
		 
		  - �Լ��� ȣ���� �� ()�ȿ� �����ϴ� ���� ���ڶ�� �Ѵ�
		  
		  - �Լ��� ������ �� ()�ȿ� ���ڸ� ���� �� �ִ� �������� �����ϴµ�, �̸� �Ű�������� �Ѵ�
		 
	*/
	
	public static void main(String[] args) { // �Լ��� �־�ΰ� ������ �ȵȴ�.
		for (int i = 0; i < 10; ++i) { // 10�� �䳢�� ����Ѵ�.
			printRabbit();
		}
		//printRabbit(); // �Լ��� ȣ���ؾ� ����̵ȴ�.
		
		//System.out.println(appleBasket(31,10)); // int apple���� 31, int size �� 1�� ��, ��� : 4
		
		int need = appleBasket(31,10);
		System.out.println("�ʿ��� �ٱ����� ������ : " + need + "�� �Դϴ�");
		
	}
	
	public static void printRabbit() {  // �Լ��� �����ص� ��, void�� ���� �� ���� �Լ��̴�
		System.out.println(" /)/)");
		System.out.println("( ..)");
		System.out.println("( >��");
	}
	
	// ex : ����� ������ �ٱ����� ũ�⸦ �����ϸ� �ʿ��� �ٱ����� ������ �˷��ִ� �Լ�
	
	public static int appleBasket(int apple, int size) { // ����� ������ �ٱ��� ũ�⸦ ���޹ްڴ�..��� �ǹ�
//		int basket = apple % size == 0 ? apple / size : apple / size + 1;
//		
//		return basket;
		return apple % size == 0 ? apple / size : apple / size + 1;
	}
	
	
	
	
	
}
