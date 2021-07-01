package myobj.item;

/*
	 �� Ŭ������ ��ӹ޾� 3���� �������� ��������
	 �� �� Item Ŭ������ �������� �� ��
*/
abstract public class Item {

	String name;
	int price;
	
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	// final�� ���� �޼���� �ڽ� Ŭ�������� �������̵带 ������Ų��.
	final public void info() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + price + "��");
	}
	
	abstract public void use();	
}
	
	
	//�߸� ���� �� : Ŭ������ ���� �����߾���Ѵ�!!!!
//	public class Cup extends Item {
//	
//		public Cup(String name, int price) {
//			super(name, price);
//		}
//	
//		@Override
//		public void use() {
//			name = "������";
//			price = 5000;
//			System.out.println(name + price);
//		}
//	}
//
//	public class Het extends Item {
//	
//		public Het(String name, int price) {
//			super(name, price);
//		}
//	
//		@Override
//		public void use() {
//			name = "ĸ����";
//			price = 17000;
//			System.out.println(name + price);
//		}
//	}
