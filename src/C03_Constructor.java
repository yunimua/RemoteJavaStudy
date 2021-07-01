import java.util.Arrays;

public class C03_Constructor {
// Ŭ������ 1���� ���� �ϳ��� �⺻�̳�, 2~3���� �Ҽ��� ������ 1���� 1���� �⺻
	/*
		# Ŭ������ ������ (Constructor)
		
		 - Ŭ������ �̸��� �Ȱ��� �̸��� �޼���
		 - �޼������� ���� Ÿ���� �������� �ʴ´�
		 - �ν��Ͻ��� ������ �� new�� �Բ� ���ȴ�	
		 - �ν��Ͻ� ������ ���� ���� ȣ��Ǳ� ������ �ַ� �ν��Ͻ� �ʱ�ȭ�� ���ȴ� // �̰� �ν��Ͻ� : Orange o1 = new Orange(); 
		 - �����ڸ� �ϳ��� �������� ���� Ŭ�������� �ڵ����� ������ �⺻ �����ڰ� �����Ѵ�.
		   (�ƹ��ϵ� ���� ����)
		 - �����ڰ� �����ϴ� Ŭ������ �⺻�����ڸ� �ڵ����� �������� �ʴ´�.
		   (�⺻ �����ڸ� ����ϰ� �ʹٸ� �⺻ �����ڸ� �߰��� �����ؾ� �Ѵ�) 
		   //ex : Peach peach03 = new Peach(); <<�ν��Ͻ� > Peach() {} << �⺻ ������ ����
	*/
	
	public static void main(String[] args) {
		Window w1 = new Window(); // Window�� �����ڴ�
		Apple a1 = new Apple();
		Orange o1 = new Orange();
		Peach p1 = new Peach();
		Peach peach01 = new Peach("����ȫ��");
		Peach peach02 = new Peach("��������");
		Peach peach03 = new Peach();
		// Peach peach03 = new Peach(); �⺻�����ڷ� ��������ϸ� ������ ����. 
		// �� class Peach{} : �⺻�����ڰ� ������ ������ ����.
		
		System.out.println(o1.sweet); // 10.0
		System.out.println(o1.address); // ���ֵ�
		System.out.println(Arrays.toString(o1.color)); // ��� : [255, 255, 0]
		
		
		//�ٷ� ���ڿ��� �����Ѵ� : String.format
		String str = String.format("%d : %d : %d", 10, 20, 50);
		System.out.println(str); // ��� : 10 : 20 : 50
		
		System.out.println(p1.color); //�⺻��
		System.out.println(peach01.color);  //����ȫ��
		// Peach peach01 = new Peach("����ȫ��"); �ν��Ͻ��� �����ϸ� ��µǴ� ���� : ����ȫ��
		
		// ���ϴ� �⺻ �������̹Ƿ� �������� ���� �⺻���� ��µȴ�
		System.out.println("�ν��Ͻ� ������ �迭ó�� �ʱ�ȭ�� �̸� �Ǿ��ִ�");
		System.out.println(a1.color); // ��� : null
		System.out.println(a1.calrorie); //��� : 0
		System.out.println(w1.open); // false : �ʱⰪ�� false �� 
		System.out.println(w1.lock); // false
		
		System.out.println();
		System.out.println(p1.size); // 10
		System.out.println(p1.color); //�⺻��
		
	}
}

class Peach{
	String color; // ������ �ʴ� ��
	int size;
	
	// this : �ν��Ͻ� �ڱ� �ڽ��� ����Ų��. +++(����)
	Peach(String color){ //�����ڿ� �Ű� ������ �شٴ� ���� �������� ������ ���������, �� Peach p1 = new Peach("��ȫ��");
		this.color = color; // = color;�� ���Ҽ� �ִ� ��
	}
	
	Peach(int size) {
		this.size = size;
		this.color = "default color";
		
	}
	// ������ �����ε� : Peach peach03 = new Peach();���� �����ε�
	Peach() {
		this.color = "�⺻��";
		this.size = 10;
	}
}
class Orange{
	//null�� ������ ������ ���� (Array���� ã�ƺ�)
	int[] color;
	double sweet;
	String address; // String�� �������̴ϱ� null�� ���ִ�
	
	Orange() { // Orange o1 = new Orange();�� �����ǰ� ���� �Ʒ��� ���� ���ִ�
		//Ŭ������ �����ϰ� �̸����� �޼��带 �����, ������ ���ο� �ν��Ͻ��� ��������� ȣ��ȴ�
		// return �� ������ �ʿ䰡 ����
		color = new int[] {255, 255, 0};
		sweet = 10.0;
		address = "���ֵ�";
		
	}
}
