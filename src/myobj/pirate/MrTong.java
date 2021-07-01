package myobj.pirate;

public class MrTong {
	
	//true : �ش� ������ �� �� ����
	//false : �ش� ������ �� �� ����
	boolean[] stabbed;
	boolean[] launch;
	
	//+������ �����ϰ� �����Ǿ�� ��
	//int[] launch; //+���� �迭 ����
	
	// launched�� true�� ��������� �߻�� ����, �߻簡 �Ǹ� true�� �ȴ�
	public boolean launched;
	
	public MrTong(int size) { //+���鶧 ����� ��������
		stabbed = new boolean[size]; //+������� ��� false�� �ʱ�ȭ �� �����̴�
		launch = new boolean[size];
		
		//������ �켱 1~4�� ����
		for (int i = 0; i < 4 ; ++i) {
			launch[(int)(Math.random() * size)] = true;
		}
	}	

	// �̹� �� ���̶��  return false, �ƴ϶�� ��� �� �񷶴ٸ� return true;
	public boolean stab(int index) { //+���°�� � ���ΰ�, index�� ���޹����� true
		if (stabbed[index]) {//+ �̹� ���õ� ���ڸ� üũ�Ͽ�(index �迭�� ���) false�� ��Ƶд�
			return false; 
		}else {
			stabbed[index] = true;
			launched = launch[index]; //+���� ���� ���� �ּ�ó���Ǿ�����
			return true; //+ ���񷶴� (���񸰵���)
		}
	}
	
	public boolean[] getStabbed() { //+�������� Ȱ���ϵ��� �ۼ��ϴ� ���·� ����, ��� ������ �ʾҳ�!
		return stabbed;
	}

	
//			 // launched = launch[index]; �� ���� �����̴�!!!!! 
//			if (launch[index] == true) {
//				launched = true;
//			}else {
//				launched = false;
//			}

	
	//+���� ���� üũ�� �� �ִ�...
//	for (int i = 0, len = (int)(Math.random() * 4 + 1); i < len; ++i) {
//		launch[i] = true;
//	} // �̷��� ������ ���Ⱑ �ʿ���!
	// �� ���� �������� ����
//	launch = new int[(int)(Math.random() * 4 + 1)];
//	
//	int index = 0;
//	while (index < launch.length) {
//		
//		launch[index] = (int)(Math.random() * size);
//		
//		for (int i = 0; i < index; ++i) {
//			
//		}
//	}
	
//	for (int i = 0, len = launch.length; i < len; ++i) {
//		launch[i] = (int)(Math.random() * size);
//	}
//}
	
	//1000�� ����
//	for (int i = 0; i < 1000; ++i) {
//		int x = (int)(Math.random() * size);
//		int y = (int)(Math.random() * size);
//		
//		boolean temp = launch[x];
//		launch[x] = launch[y];
//		launch[y] = temp;
//	}
	

	//�� ���� ���� �������� ������
	//else {
		//stabbed[index] = true; // ���ϳ����̾���
//	for (int answer : launch) {
//		if (answer == index) {
//			launched = true;
//			return true;
//		}
//	}	

	
	
//	//+� �� �ִ� ��ȣ�� �˷��ִ� �迭(����)
//	public int[] notyet() { //+���� ���� ������ �������ش�
//		//+������ ���� �����? count�� true�� �����ȴ�??
//		int count = 0;
//		
//		// for each //+(a:b) : b�� �ִ°� a�� ������, 1���� ����������
//		for(boolean stab : stabbed) { //+stabbed�� �ִ� ���� 1���� ������ stab�� �ִ´�(����Ѵ�)
//			if(stab) {
//				count++;
//			}
//		}
//		return null;
//	}
}
