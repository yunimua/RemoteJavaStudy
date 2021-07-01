package myobj.blackJack;

import java.util.Arrays;

public class Player {
	
	final static int MAX_TABLE_SIZE = 11;
	
	Card[] tables; //+���̺� �� ī��
	
	//+ ���� ���� ī���� ����
	int count; //+���� ������ ���� ī�� ī��Ʈ ����
	int ace_count;
	
	Player() { //+public�� ����
		tables = new Card[MAX_TABLE_SIZE]; //+ ���� ���̹��� �� �ִ� ī��� 11���̴�. 1 1 1 1 2 2 2 2 3 3 3, (1���� ���)
	}
	
	void add(Card card) { //+ �� ���̺� ī�� 1���� �߰��ϴ� �޼���
		if(card.rank == 0) { //+0�� A��. A�� ������ ī��Ʈ 1�� ������Ų��
			ace_count++;
		}
		tables[count++] = card;	
	}
	
	int calc() { //+���� ī�� ���� ���
		int value = 0; //+ value�� ī���� VALUES�� �ִ� ���� �����ϱ� ���� ��, ī�带 2������� �ջ�Ǿ�� �ϹǷ� value+value
		for (int i = 0; i < count; ++i) {
			value += tables[i].getValue(); //+ Cards > Card class�� �ִ� getValue���� �����ͼ� ���Ѵ�
			
		}
		int i = 0;
		while (ace_count - i> 0 && value > 21) { //+ace_count -1�� ���� �� 0���� ũ��(1�̶� �����߰�)
			value -= 10;						// �� value ���� 21�̸� -10�� �Ѵ�(Aī�� -10)
			i++;
		}
		return value; //+���� ���� �����ؼ� ������
	}
	
	
	public String toString() {
		String str = "";
		for (int i= 0; i < MAX_TABLE_SIZE; ++i) {
			if (tables[i] == null) {
				break;
			}else {
				str += "[" + tables[i] + "]";
			}
		}
		return str;
	}
}
