
public class C05_Inherit {
	
	/*
		# Ŭ���� ���
		
		  - ������ �̸� ����� �״� Ŭ������ �״�� �����޾Ƽ� ����ϴ� ��
		  - �������� �Ŀ��� �ش� Ŭ������ ������� ���ļ� ����� �� �ִ� (�������̵�)
		  - ������ �����ϸ鼭 ���Ӱ� �����غ� �� �ִ� ���� �����̴�
		  - ��ӹ޴� Ŭ������ �ڽ� Ŭ���� �Ǵ� ���� Ŭ������� �θ���
		  - ������ִ� Ŭ������ �θ� Ŭ���� �Ǵ� ���� Ŭ������� �θ���
		  
		# ����� ��Ģ
		
		  - extends��� Ű���带 ����Ѵ�
		  - �����ڿ��� �ݵ�� ���� ���� �θ� Ŭ������ �����ڸ� ȣ���ؾ� �Ѵ�
		  - �θ� Ŭ������ �ڽ� Ŭ������ �Ȱ��� �̸��� ���� �ڿ��� �ִ� ��쿡��
		  	super�� this�� ��Ȯ�ϰ� ������ �� �ִ�
		  - super()�� �θ��� �����ڸ� ���Ѵ� �� this()�� �ڽ��� �����ڸ� ���Ѵ�
	*/

	public static void main(String[] args) {
		Person gildoug = new Person("��浿", 42);
		
		gildoug.sayHi(); //+ ��� : �ȳ�? �� �̸��� ��浿�̾�. ���̴� 42�� �̾�.
		//gildoug.program("����");//+ �θ� Ŭ�������� �ڽ� Ŭ���� �޼��带 ����� �� ����
		
		Programmer chulsoo = new Programmer("��ö��", 28);
		
		// Programmer�� sayHi�� �������� ������ �θ��� �޼��带 �����޾� ����ϰ� �ִ�
		chulsoo.sayHi(); //+ ��� : �ȳ�? �� �̸��� ��ö���̾�. ���̴� 28�� �̾�. (�Ű����� ���� �� ���� �������� �����)
		
		// �������� �� �ڽ� Ŭ�������� ���� �߰��� �޼���
		// �θ� Ŭ������ ������ �Ѽ����� �ʰ� �߰����� ������ ������ �� �ִ�
		chulsoo.program("����"); //+ ��� : ���α׷��� ��ö������ ������ ����� �����߽��ϴ�.
		
		chulsoo.sayHi(); //+ ��� : ��ö������ �λ縦 �߽��ϴ�. prtin("Hello, world!")
	}
}

class Person {
	String name;
	int age;
	
	//����Ű�ϳ� ���ߴµ� ������(��������5/24 15:45)
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void sayHi() { //�Ȱ��� �Ű������� �߰��� �� ���� : sayHi()
		System.out.println("�ȳ�? �� �̸��� " + name + "�̾�. ���̴� " + age + "�� �̾�.");
	}
}

//Person Ŭ������ ��ӹ��� Programmer Ŭ���� //+extends ���
class Programmer extends Person { //Programmer �������̳��� �� �߰��ϸ� �Ʒ��� ���� : 

	Programmer(String name, int age) { //�� �κ��� �߰���, �θ� ������ ȣ���� ����
		super(name, age);
	}
	
	void program(String to_program) {
		System.out.println("���α׷��� " + name + "���� " 
						+ to_program + "�� ����� �����߽��ϴ�.");
	}
	
	//Override(¢���) : �ڽ� Ŭ������ �θ�Ŭ������ �޼��带 ������� �����ؼ� ����� �� �ִ�
	void sayHi() {
		System.out.println(name + "���� �λ縦 �߽��ϴ�. print(\"Hello, world!\")");
	}
}

class Tree {
	public Tree(int abc) {
		
	}
}

class OrangeTree extends Tree {
	
	OrangeTree() { //+Tree() { => �θ� Ŭ������ �⺻ �����ڰ� �߰��Ǹ� ������ �߻��ȴ�
		super(123); // �θ�Ŭ������ �⺻ �����ڰ� �ִ� ���� super()�� ������ �� �ִ�
	}
}



