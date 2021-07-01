
public class C13_LocalInnerClass {

	/*
		# ���� ���� Ŭ����
		
		  - Ŭ������ ��� �޼��� ���ο����� ������ �� �ִ�
		  - �޼��尡 ������ �ش� Ŭ������ �����̴��Ѵ�	
	*/
	
	public static void main(String[] args) { //+ �޼���ȿ� class Apple ������ ����.
		
		// �޼��� ���ο��� Ŭ������ ����� �� ����
		class Apple {
			int price;
			int color;
			
			public Apple(int price, int color) {
				this.price = price;
				this.color = color;
			}
			@Override
			public String toString() {
			
				return "price: " + price + "��\ncolor��: " + color;
			}
		}
		
		Apple a = new Apple(1000, 1);
		System.out.println(a);
		
		//������ ���� ��Ȳ�� o.check()�� ������ �� ���� ������ 200�� �̳��� �����Ͻÿ�
//		Object o = banana(); //+ banana�� ȣ���� �޼���
//		
//		((Banana)o).check();
		
		Fruitt fruit = execbanana();
		System.out.println("�ٳ����� ���� " + fruit.check() + "���Դϴ�.");
		
	}
	
	//public static Object banana() { //+ �ٳ��� �޼��� ���� //+ Banana banana���Ǹ� class�� �ҷ��ü������Ƿ� ���Ұ�
	public static Fruitt execbanana() { 
		class Banana extends Fruitt { //+ Fruitt���� ���(extends)����
	//	class Banana { //+ Banana Ŭ������ ����, �̰� ������ ���� ������ Ŭ����
			int bana_count; //+��ΰ�
			int price; //+ ������ üũ ����
			
			public Banana(int bana_count, int price) {
				this.bana_count = bana_count;
				this.price = price;
			}
			
			double check() {
				return price / (double)bana_count;
			}
		}
		//+ �� �̰� ����Ϸ��� main �޼ҵ忡 banana() �޼��� ������ �߰��ؾ��Ѵ�
		//+ �� class Banana�� �ν��Ͻ�(new Banana)�� �����ϰ� ���� ���� �� check�� ������ ������� ���
		// System.out.println(new Banana(11, 3000).check() + "��"); //+ 272.72727272727275��
		return new Banana(11, 3000);
	}
}

//+ abstract : ���¸� ����� ���� �ϼ��� �ڼ� Ŭ�������� �̷�� Ŭ����
//+ Fruitt���� ��ӹ��� check()�� ����
abstract class Fruitt { //+ �ߺ��� �̸����־ t�� �ϳ� ������
	abstract double check();
}



