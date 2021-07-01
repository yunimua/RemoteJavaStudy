package myobj;

public class Barrack {
	
	final int MAX_QUEUE_SIZE = 5;
	
	Barrack_Unit[] queue;
	int queue_index; // 0�̴ϱ�
	
	Barrack(){
		queue = new Barrack_Unit[MAX_QUEUE_SIZE];
	}
	
	boolean checkMaxQueue() {
		return queue_index == MAX_QUEUE_SIZE;
	}
	
	void createSheep() {
		if (checkMaxQueue()) {
			System.out.println("���� ��⿭�� ���� á���ϴ�! ���� ������ �� �����ϴ�!");
			return; 
			// void  Ÿ�� �Լ��� return�� �� �� �ִ�
			// ȣ���� ���� ���� ���������� �ʰ� �Լ��� ����ȴ�
		}
		queue[queue_index++] = new Barrack_Unit("��", 5);
		System.out.println("�� ����");
	}
	
	void createCow() {
		if (checkMaxQueue()) {
			System.out.println("���� ��⿭�� ���� á���ϴ�! �Ҹ� ������ �� �����ϴ�!");
			return;
		}
		queue[queue_index++] = new Barrack_Unit("��", 7);
		System.out.println("�� ����");
	}
}
