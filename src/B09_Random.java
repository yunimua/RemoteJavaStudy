
public class B09_Random {

	/*
		# ������ ���� �����ϱ�
		
		1. Math.random()
		 - 0 <= x < 1�� doubleŸ�� ���� �Ҽ��� �����Ѵ�.
		 - �� ���� �Ҽ��� �̿��Ͽ� ���ϴ� ������ ���ڸ� ���� �� �ִ�.
		 
		 �� ���ϴ� ������ ������ ����� ���� (ex :10 ~ 100) �� ������ 91�� 
		  
		   (1) ������ ���� �Ҽ��� ���ϴ� ������ ������ ���Ѵ� (91��) // ������ ����. ex) 30.256811452779896
		   		0 <= x < 1  //���� ū���� 0.9999999999
		   		0 * 91 <= x < 1 * 91 //���� ū���� 0.9999999999
		   		0 <= x < 91 //���� ū���� 0.9999999999
		   
		   (2) ���ϴ� ���� �� ���� ���� ���ڸ� ���Ѵ� (+10) // 68.3503991593131
		   		0 * 91 + 10  <= x < 1 * 91 + 10 //���� ū���� 100
		   		10 <= x < 101
		   		
		   (3) �Ҽ��� �Ʒ��� �����Ѵ� (int) // ((int)(Math.random() * 91 + 10)); >> int�� ������ȯ
		
		2. Random Ŭ���� ���
	
	*/
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; ++i) {
			System.out.println((Math.random() * 91));  

		}
		System.out.println("--------"); 
		
		// �������� : 1~45�� �A�� ���ڸ� 7�� ����غ�����
		
		for (int i = 0; i < 7; ++i) {
			System.out.println((int)(Math.random() * 45 + 1)); // 46�� �Է��߾��� ������ Ʋ��..
		
		}	
	}
}