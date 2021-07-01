package myinterface;

public class Main {

	public static void main(String[] args) {
		
		Bus bus = new Bus();
		test(bus);
		
		Starex str = new Starex();
		test(str);
		
		Delivery_store ds = new Delivery_store();
		check(ds);
		
	}
	
	public static void test(Vehicle vehicle) {
		
		for (int i = 0; i < 100; ++i) {
			System.out.println("�ӵ��� �� �½��ϴ�.");
			System.out.println("���� �ӵ��� " + vehicle.acceleration() + "km/h �Դϴ�.");
		}
		
		System.out.println("�������� �ӵ��� �����մϴ�.");
		for (int i = 0; i < 30; ++i) {
			System.out.println("���� �ӵ��� " + vehicle.deceleration() + "km/h �Դϴ�.");
		}
		
		for (int i = 0; i < 15; ++i) { //+15���¿��
			if (!vehicle.ride()) {
				System.out.println("�� �̻� Ż �� �����ϴ�.");
			}else {
				System.out.println("�Ѹ��� �� �����ϴ�.");
			}
		}
	}
	
	public static void check(Delivery orders) {
		
		for (int i = 0; i < 10; ++i) {
			System.out.println("�ֹ��� �����Ǿ����ϴ�. [���� �ֹ� �Ǽ� : " + orders.order() + "]");
		}
		
		for (int i = 0; i < 10; ++i) {
			System.out.println("��� �ð��� ����� �ֹ��� ��ҵǾ����ϴ�. [���� �ֹ� �Ǽ� : " + orders.orderCancel() + "]");
		}
		
		for (int i = 0; i < 20; ++i) {
			if (!orders.orderQuantity()) {
				System.out.println("�ֹ����� ���� �߰� �ֹ��� ���� �� �����ϴ�.");
			}else {
				System.out.println("�ֹ� 1���� �߰� �����Ǿ����ϴ�.");
			}
		}
	}
}
