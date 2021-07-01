
public class B05_For {
	
	/*
		# �ݺ��� (loop)
		 - for, while, do-while(X), for-each
		 - �Ȱ��� �ڵ带 ������ �ݺ��ϰ� ���� �� ����Ѵ�
		 
		# for��
		 - for (�ʱ�ȭ; �ݺ�����; ������){
		 	����� �ִ� �ݺ������� true�� ���� �ݺ��� ��ɾ���� ���� ��
		 }
	*/
	public static void main(String[] args) {
		
		// int i (1) : ���۰�, �ʱ�ȭ�� �� üũ
		// i < 100; (2) : ������ üũ�� �Ͽ� true�� �� , false�� �߸� �ߴܵ�.
		// ++i (3) : true�� �� �ش� ���� ����
		
		/*
			1. ���� �⺻���� ������ for��
			 - �ʱⰪ���� 0�� �ְ�, ���ǿ��� �ݺ��ϰ� ���� Ƚ���� ���´�
			 - ������ 1���Ѵ�
			 - ���ϴ� Ƚ����ŭ �ݺ��ϱ� ���� ���� ������ for��
		*/
		
		for (int i = 0; i < 10; ++i) {
			System.out.println("Hello, worid!" + i);
		}
		
		/*
			2. �ʱⰪ, ������ ������ ������� ������ �� �ִ�
		
		*/
		
		for (int i = 10; i > 0; --i) {
			System.out.println("Hello, worid!" + i);
		}
		
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
		
		/*
			3. �ʱⰪ�� �������� ��ġ�� ������� ������ �� �ִ�
		*/
		
		int a = 123;
		for (; a< 234;) {
			System.out.println("Hello! " + a);
			a += 5;		// ����� �ϰ� �����Ѵ�.
		}
		
		/*
			4. �ݺ��� ���ο� �ٸ� �����鵵 �����Ӱ� ����� �� �ִ�	
		*/
		for (int month = 1; month <=12; ++month) {
			String season;
			
			switch (month) {
			case 12 : case 1 : case 2:
				season = "�ܿ�";
				break;
			case 3 : case 4 : case 5:
				season = "��";
				break;
			case 6 : case 7 : case 8:
				season = "����";
				break;
			case 9 : case 10 : case 11:
				season = "����";
				break;
			default :
				season = "��������";
				break;
			}
			System.out.printf("%d���� %s�Դϴ�.\n", month, season);
		}
		
		System.out.println("���α׷��� ����Ǿ����ϴ�");
		
		
		
		/* ���� ����

		 for (int i = 0; i < 10; i++) {
			for (int j = 1; j < 10 - i; j++) {
				System.out.print(' ');
			}
			for (int k = 0; k < i *2 +1; k++) {
				System.out.print('*');
			}
			System.out.println();
		}

		int num = 10;
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < i*2 +1; j++) {
				System.out.print('*');
			}
			System.out.println();

		
		for (int k = num; k > 0; k--) {
			for (int y = k *2 -1; y > 0; y--) {
				System.out.print('*');
			}
			System.out.println();
		
		for (int i = 0; i < 10; i++) { // 9�� �ݺ��� ����
			for (int y = 0; y < i*2 +1; y++) { // *�� ����� ����, ���� ���� �������� (1,3,5,7,9,11,13,15,17,19)
				System.out.print("*");
			}
			System.out.println();
		}
		*/
	}
}
