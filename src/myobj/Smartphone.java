package myobj;

public class Smartphone { 

	String brand;
	int price;
	double sale;
	
	Smartphone(){
		price = 1000000;
	}
	
	void sale() {
		if (brand.equals("�Ｚ")) {
			price -= (price*0.2);
		}else if (brand.equals("����")){
			price -= (price*0.1);
		}else {
			System.out.println("������ �Ұ����մϴ�.");
			return;
		}
	}
}
