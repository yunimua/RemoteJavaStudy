public class A02_Variable {
	public static void main(String[] args) {
		/*
			# ���� (Variable)
				- �����͸� ���� �� �ִ� ����
				- �ڹٿ����� ������ �ݵ�� ������ �ڿ� ����ؾ� �Ѵ�
				- ���� ����ÿ��� �� ������ ������ �������� Ÿ���� ��������� �Ѵ�
				- (���� ��������)���� �̸��� ������ �ٽ� ����� �� ����
		*/

		/* 
		 	# ������ ���� (declare, declaration)
				 - �տ� Ÿ���� ���� �ڿ� �������� ���Ѵ�
				 - ����� ���ÿ� �ʱ�ȭ �� ���� �ִ�
				 - ���� �Ŀ� �ʱ�ȭ ���� ���� ������ ����� �� ����
				 
		*/

		// ������ ���� �ϰ�, �ڿ� �ʱ�ȭ �ϴ� ���
		int a, b, c;
		int apple;
		int banana;
		int yet;


		// �� ���α׷��� ���� =�� ������ ������ �������� ���� ������� ���̴� (���� ����)
		a = 3;
		b = 4;
		c = -35;
		apple = 13;
		banana = 10;

		// ���Ͱ� ���ÿ� �ʱ�ȭ
		int x = 10, y = 11, z =99;
		int mango = 30;
		int grape = 123;

		// �� ���� ������ �ϸ� ������ ����Ǿ� �ִ� ���� �������
		a = 7;
		System.out.println("a : " + a);

		// ""���ڿ��� �տ������� �̾���̱Ⱑ ��.. �ڿ� ��갪�� �������� ()�ʿ�..
		System.out.println("a + b + c = "  + (a + b + c));
		System.out.println("����� ��� " + apple + "�� �ֽ��ϴ�.");
		System.out.println("�ٳ����� ��� " + banana + "�� �ֽ��ϴ�.");
		
		System.out.println(x - y * z);
		System.out.println(mango + apple);
		
		//System.out.println(yet); // ���� �ʱ�ȭ���� �ʾƼ� ����.
	}
}
