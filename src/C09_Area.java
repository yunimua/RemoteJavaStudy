
public class C09_Area {

	/*
		# ������ ����
		
		 - ������ �ش� ������ ������ {}�� ����� �״´� (������ �����ֱ�)
		 - ��Ȯ�ϰ� ��Ī���� ������ �⺻������ ���� ����� ��ġ�� ������ ����Ѵ�
	*/
	
	//int a;
	// �ν��Ͻ� ���� (instance variable)
	//	  a.k.a ���(member), �ʵ�(field),�Ӽ�(attribute), �Ӽ�(property)
	int a = 15;
	
	void methodA() {
		// ���� ���� (local variable) : �޼��� ���ο��� ����� ����
		int a = 10;
		System.out.println(a); //+������� �������� 10�� �ҷ��´�
	}
	
	void methodB() {
		int b = 0;
		System.out.println(a); //+ methodA�� �ִ� int a�� �ҷ��� �� ����
		
		if (true) {
			b = 123;
			System.out.println(a);
			System.out.println(b); //+ methodB�� b(0)���� �����ͼ� 123���� ��ȯ ����
		}
	}
	
	class Area2 {
		public Area2() {
			System.out.println(a); //+ Ŭ���� ���ο� Ŭ���� ����, Ŭ���� �ܺ�(C09_Area)�� �ִ� a(15)�� �ҷ��� �� �ִ�
		}
		
		class Area3 {
			public Area3() {
			System.out.println(a);
			}
		}
	}
	
	public static void main(String[] args) {
		new C09_Area().new Area2();
	}
}
//���⼭�� int a;�� �ҷ��� �� ����.