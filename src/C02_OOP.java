
public class C02_OOP {
	/*
		# ��ü���� ���α׷��� (OOP : Object Oriented Programming)
		
		 - ���� �����ϴ� ��� �͵��� ������ �Լ��� ǥ���Ϸ��� ���α׷��� �����
		 	(��üȭ�� ��Ű���� ����, �Լ��� ǥ��...)
		 - ������ �Լ��� ���к��ϰ� ����ϱ� ���ٴ� 
		   ���ǿ� �����ϴ� ��ü ������ ��� ǥ���Ͽ� �������� �ø���
		 - ��ü(Object) : ���� �����ϴ� ��� �� (�繰, ����, ��ü�� �ְ� ���� ���.. ���)
		 
		 ex: ���
		  - ���� : ũ��, �絵, ����, Į�θ�, �������, ���... 
		  - �Լ� : 
		  		�Դ´�(ũ�Ⱑ �پ��鼭 Į�θ���ŭ ���� ����� Į�θ��� ����)
		  		���� ���Ѵ�
		  		��������� �پ���
		  		������ (ũ�⸸ŭ�� �������� ������)
		  		����� �����Ѵ� (��������� ������ �����Ѵ�)
		  		
		 �� Ŭ���� ���ο�(�����ִ�) �ִ� �Լ��� �޼����� �θ��� (java���� �޼��� �ۿ� ����)
		 
		 # Ŭ���� (Class)
		 
		  - ��ü�� ���α׷��� ���� ǥ���� ��
		  - Ŭ������ �ش� ��ü�� ���赵�� (������ ���������� ��ü�� ����)
		  - ���赵��� ���� ���� ��ü�� '�ν��Ͻ�'���� �θ��� // ��ĳ�ʴ� ���赵����. new Scanner�� ���赵 ����
		  - Ŭ������ ������ ���� Ÿ���̴�
	*/
	
	//main�� �ݵ�� public class ���ο� �����ؾ� �Ѵ�. 
	//(���� �̸��� ���� �̸��� Ŭ������ �����ؾ� ã�� �� �ִ�)
	public static void main(String[] args) {
		String[] flavor = {"����", "�ٴҶ�", "����", "�ǽ�Ÿġ��", "����"};
		String[] color = {"����", "���̺���", "��ũ", "�׸�", "����"};
		int price = 1500;
		int calorie = 800;
		String product = "���";
		String type = "��";
		
		IceCream gugucon = new IceCream(); 
		
		IceCream[] icebox = new IceCream[10];
		
		icebox[0] = new IceCream();
		
		System.out.println(icebox[0].flavor); //null
		
		System.out.println(gugucon.color); //null
		System.out.println(gugucon.price); //0

		doSomething(1, "2", 'A', 4.0f, 5.0);
		
		// new�� ���� �ν��Ͻ� ����
		Apple a1 = new Apple();
		Apple a2 = new Apple();
		Apple a3 = new Apple();
		
		// �̰� �޼���?
		a1.size = 15;
		a1.color = "������";
		
		a2.size = 13;
		a2.color = "�����";
		
		a3.size = 25;
		a3.calrorie = 100;
	
		System.out.println(a1.color);
		System.out.println(a2.color);
		
		System.out.println("�Ա� �� a3�� ũ�� : " + a3.size);
		System.out.println("�Ա� �� a3�� Į�θ� : " + a3.calrorie);
		
		a3.eat();
		
		// void eat() {�� ���� ...
		System.out.println("���� �� a3�� ũ�� : " + a3.size); // -1�� ����
		System.out.println("���� �� a3�� Į�θ� : " + a3.calrorie); // -10�� ����
		
		Smartphone s1 = new Smartphone();
		Smartphone s2 = new Smartphone();
		
		s1.brand = "�Ｚ";
		s1.price = 1000000;
		s1.color = "��";
		
		s2.brand = "����";
		s2.price = 1000000;
		s2.color = "ȭ��Ʈ";
		
		s1.sale();
		s2.sale();
		
		System.out.println(s1.brand + " ����� ���ε� ������ : " + (int)s1.price + "�� �Դϴ�.");
		System.out.println(s2.brand + " ����� ���ε� ������ : " + (int)s2.price + "�� �Դϴ�.");
			
		//����Ǯ�� ����
		
		Window window1 = new Window();
		Window w2 = new Window();
		Window w3 = new Window();
		
		window1.open();
		window1.close();
		window1.lock();
		
		window1.status();
		
		String status = window1.getStatus();
		System.out.println("������ ���·� ���ڿ��� ���: " + status);			
	}
	
	public static void doSomething(int a, String b, char c, float d, double e) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
		
	public static void doSomething(Box box) {
		System.out.println(box.a);
		System.out.println(box.b);
		System.out.println(box.c);
		System.out.println(box.d);
		System.out.println(box.e);
	}
}

class IceCream{
	String flavor;
	String color;
	int price;
	int calorie;
	String product;
	String type;
}
		
class Box {
	int a;
	String b;
	char c;
	float d;
	double e;
}

class Apple{
	/* 
	 	# �ν��Ͻ� ����
	 	 - Ŭ���� ���ο� ������ ����
	  	 - �ν��Ͻ� ���� ������ ������ ������ �ִ� ������
	  	 - aka. �ʵ�, �Ӽ�, ��� ����, ���, ���� ...
	*/ 
	// �̰� ����
	int size;
	double sweet;
	String color;
	int calrorie; // Į�θ�
	
	/*
		# �ν��Ͻ� �޼���
		 - �ν��Ͻ� ������ ���� �ش� �ν��Ͻ��� ���¸� ��ȭ��Ű�� �޼���

	*/
	void eat() {
		size--;
		calrorie -= 10;
	}
}

// ���� ���� : ������ ��ü�� �����Ͽ� Ŭ������ �ϳ� ������ �� �ν��Ͻ��� �����ϰ� ���� ä����� ����غ�����
// �� �ν��Ͻ� ������ 3�� �̻�, �ν��Ͻ� �޼��� 2�� �̻�, ���� ����

class Smartphone{
	double price;
	String color;
	String brand;
	
	void sale() {
		if (brand.equals("�Ｚ")) {
			price -= (price*0.2);
			return;
		}else if (brand.equals("����")){
			price -= (price*0.1);
			return;
		}
		return;
	}
	
	void color() {
		if (color.equals("��")) {
			price += (price*0.01);
		}else if (!(color.equals("��"))) {
			price -= (price*0.02);
		}
	}
}

class Window {
	boolean open;
	boolean lock;
	double width;
	double height;
	
	void open() { // â�� ���ȴ�, ������
		open = true;
	}
	void close() {
		open = false;
	}
	void lock() { // â���� ����, ������
		lock = true;
	}
	void unlock() {
		lock = false;
	}
	void status() {
		System.out.printf("�� â���� %s. [%s].\n", 
							open ? "���� �ֽ��ϴ�." : "�����ֽ��ϴ�.",
							lock ? "����ֽ��ϴ�." : "��� ���� �����Դϴ�.");
	}
	String getStatus() {
		// String.format() : ������ �̿��� ���ϴ� ���ڿ��� �����Ѵ�
		return String.format("�� â���� %s. [%s].\n",
							open ? "���� �ֽ��ϴ�." : "�����ֽ��ϴ�.",
							lock ? "����ֽ��ϴ�." : "��� ���� �����Դϴ�.");

	}
}


