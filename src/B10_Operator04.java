
public class B10_Operator04 {

	/*	
		# ���� ������
			- ���� ? �� : �ƴϿ�;
	*/
	
	public static void main(String[] args) {
		
		int apple = 15;
		int basket = apple % 10 != 0 ? apple / 10 + 1 : apple / 10;
		
		char ch = '0';
		String msg = ch >= 'A' && ch <= 'Z' ? "�빮�� �Դϴ�." : "�빮�ڰ� �ƴմϴ�.";
		
		System.out.println(basket);
		System.out.println(msg);
	}
	
}
