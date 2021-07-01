package myobj.item;

public class Main {
	
	int money;
	
	public Main() {
		money = 10000;
	}
	
	public void purchase(Item item) {
		this.money -= item.price;
		System.out.println(item.name + "�� ��� " + this.money + "���� ���ҽ��ϴ�.");
	}
	public static void main(String[] args) {
		Main m = new Main();
		
		m.purchase(new Glue());
		m.purchase(new Sharp());
		m.purchase(new Eraser());
	}
}
