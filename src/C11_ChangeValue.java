
public class C11_ChangeValue {
	
	public static void main(String[] args) {
		
		//�� ������ ���� ���� �ٲٴ� ���
		
		int a = 10;
		int b = 20;
		
		int temp = a; // temp�� �ӽ÷� �����صδ� ���
		a = b; //+ 10 > 20 = 20
		b = temp; //temp�� ��Ƶ� ������ �ٲ��
		//b = a; //+ 20 > 20 = 20 �̴�.
		
		System.out.println(a);
		System.out.println(b);
	}
}
