package myobj.bGame;

public class User {
	
	final static int MAX_TCARD = 11; //(10��) : �ִ� ���� �� �ִ� ī��� 11���̴�
	
	CardName[] table; //(11��) ���̺� �ø��� ī�� �迭
	
	int count; //(13��)
	int aceCount;
	
	User() {
		table = new CardName[MAX_TCARD]; //(12��)
	}
	
	void add(CardName card) {
		if (card.cdName == 0) { //(14��) : ���� ī�尡 0��(A)��� aceī��Ʈ 1�� �����Ѵ�
			aceCount++;
		}
		table[count++] = card; //(13��) : ī�带 ������ ī��Ʈ�� ++1 �����Ѵ�
	}
	
	@Override
	public String toString() { //���̺� �ö� ī�带 ǥ���ϱ� ���� String
		String str = "";
		for (int i = 0; i < MAX_TCARD; ++i) {
			if (table[i] == null) { //������ ���� ī��� null, ǥ������ �ʵ��� �Ѵ�
				break;
			}else {
				str += "[" + table[i] + "]";
			}
		}
		return str;
	}
}
