
public class C10_ForEach {

	public static void main(String[] args) {
		
		int[] numbers = {10, 20, 30, 40, 50, 60};
		
		//for each
		
		for(int number : numbers) {
			System.out.println("���ڸ� �ϳ��� ���� ��� : " + number);
		}
		
		for(int number : new int[] {100,90,88,77,66,55,44,33,22,11}) {
			System.out.println("���ڸ� �ϳ��� ���� ���2 : " + number);
		}
		
		//boolean[] examResult = {true, true, true, false, false, false};
		//+ �Ʒ� : �� ������ examResult �� ���� ����
		
		for (boolean complete : new boolean[] {true, true, true, false, false, false}) {
			if (complete) {
				System.out.println("���");
			}else {
				System.out.println("���հ�");
			}
		}
	}
}
