package myobj;

public class Barrack_Main {
	public static void main(String[] args) {		
		
		Smartphone sp = new Smartphone();
		
		sp.brand = "�Ｚ";
		sp.sale();
		System.out.println(sp.brand + " ����� ������ : " + (int)sp.price + "�� �Դϴ�.");

		
		Barrack b1 = new Barrack();
		
		// 5���̻� �����Ұ� �޼��� ��µ�
		b1.createSheep();
		b1.createSheep();
		b1.createSheep();
		b1.createCow();
		b1.createCow();
		b1.createCow();

		System.out.println(b1.queue[0].name);
		System.out.println(b1.queue[1].name);
		System.out.println(b1.queue[2].name);
		System.out.println(b1.queue[3].name);
		System.out.println(b1.queue[4].name);	
	}
}
