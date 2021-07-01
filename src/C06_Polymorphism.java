
public class C06_Polymorphism {

	/*
		# ��ü�� ������
		
		  ex: ����� ���α׷��Ӵ� (X), ���α׷��Ӵ� ����̴� (O)
		  - ��ü�� �پ��� ���¸� ���� �� �ִ�
		  - ����� ����̱⵵�ϰ� �����̱⵵ �ϴ�
		  - ������ ���������� ����� �ƴ� ���� �ִ�
	*/
	
	public static void main(String[] args) {
		
		Fruit fruit01 = null;
		Pineapple pine01 = null;
		
		Fruit fruit = new Fruit();
		Pineapple pineapple = new Pineapple();
		
		fruit01 = fruit;
		fruit01 = pineapple; // �ڽ� Ÿ���� �θ� Ÿ���� �� �� �ִ� (�� ĳ����)
		//+ �θ� Fruit�̱� ������ pineapple�� ���� �� �ִ�, pineapple�� Fruit�� ��ӹ޾ұ� �����̴�
		
		pine01 = pineapple;
		// pine01 = fruit; // �θ� Ÿ���� ���� ����� ���Ƽ� �ڽ� Ÿ���� �� �� ���� (�ٿ� ĳ����) 
		
		// # �ٿ� ĳ������ ������ ���
		//	- ���� �ڽ� Ÿ���̾��� �ν��Ͻ��� ��ĳ���õǾ� �ִ� ���, �ٽ� �ٿ� ĳ���� �� �� �ִ�
		System.out.println(fruit01);
		//System.out.println((Pineapple) fruit01);
		pine01 = (Pineapple) fruit01; // �ٿ� ĳ����
		
		// # ��ĳ�̽��� �� �ν��Ͻ� ����غ���
		DragonFruit dragon = new DragonFruit(); //+ 1,
		Fruit f3 = dragon;
		
		Fruit f = new Pineapple(); 
		Fruit f2 = new DragonFruit(); //+ 2, => 1,2, �� ���� ���̴�
		
		// ��ĳ���� �� ���¿��� �������̵� �� �޼��带 ����ϸ� �ڽ��� ����� ����Ѵ�
		f.eat(); //+ ��� : [�������̵�] ���ξ����� �Ծ����ϴ�.
		
		// ��ĳ���� �� ���¿����� ���� Ŭ������ �����ִ� ����� ��� �ؾ������.
		// (��ĳ���� �� ���¿��� Pineapple���� �����ϴ� ����� ����� �� ����)
		// f.smash(); 
		
		// ���� ����� ����ϱ� ���ؼ��� �ٿ�ĳ������ �ʿ��ϴ�
		// �� �����Ϸ��� �ٿ� ĳ���ý� �߻��ϴ� �������� ã������ ���Ѵ�
		((Pineapple) f).smash(); //+ ��� : ���ξ����� ���� �����ƽ��ϴ�. // �ٿ�ĳ���� �� ��밡��
		//((Pineapple) f2).smash(); //+ �����ϸ� ������ �߻��Ѵ�, �����Ϸ����� ����ǥ�ô� ���� �ʴ´�
		
		//+ f = Pineapple, f2= DragonFruit, f�� f2�� ��� Fruit
		// instanceof �����ڸ� ���� �ش� �ν��Ͻ��� Ư�� Ŭ������ �ν��Ͻ������� �˻��� �� �ִ�
		
		if(f2 instanceof Pineapple) { //f2�� true�� ���� ����ϱ� ������ �������� ��µ��� �ʴ´�
			((Pineapple) f2).smash();
		}
		
		System.out.println("f�� Fruit�� �ɼ� �ִ� �ν��Ͻ��ΰ���? " 
					+ (f instanceof Fruit)); //+true
		System.out.println("f�� Pineapple�� �ɼ� �ִ� �ν��Ͻ��ΰ���? " 
					+ (f instanceof Pineapple)); //+true
		System.out.println("f�� DragonFruit�� �ɼ� �ִ� �ν��Ͻ��ΰ���? " 
					+ (f instanceof DragonFruit)); //+false
		
		System.out.println("f2�� Fruit�� �ɼ� �ִ� �ν��Ͻ��ΰ���? " 
					+ (f2 instanceof Fruit));//+true
		System.out.println("f2�� Pineapple�� �ɼ� �ִ� �ν��Ͻ��ΰ���? " 
					+ (f2 instanceof Pineapple));//+false
		System.out.println("f2�� DragonFruit�� �ɼ� �ִ� �ν��Ͻ��ΰ���? " 
					+ (f2 instanceof DragonFruit));//+true
		
		
		//Pineapple pine = new DragonFruit(); //+�ڽ�Ŭ������ �ٸ� �ڽ� Ŭ������ ����� �� ����
	}
}

class Fruit {
	
	void eat() {
		System.out.println("������ �Ծ����ϴ�.");
	}
}
	
//Apple�� �ȵǴ� ����, ���� ��Ű�� ���ο��� ���� �̸��� Ŭ������ ������ �� ����(peach�� �ְ� grape�� �־�?�� ���� ����..)
// C02_OOP (Apple), C03_Constructor(Peach)...
class Pineapple extends Fruit {
	
	void eat() {
		System.out.println("[�������̵�] ���ξ����� �Ծ����ϴ�.");
	}
	
	void smash() { //+ ���ξ����� ����
		System.out.println("���ξ����� ���� �����ƽ��ϴ�.");
	}
}

class DragonFruit extends Fruit {
	
	
}







