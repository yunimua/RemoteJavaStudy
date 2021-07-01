
public class A06_Operator01 {
	public static void main(String[] args) {
		
		/*
			# ������(Operator)
			 - ����� �� ����ϴ� ��
			 - +, -, *, / ....
		
		*/
		
		// # ��� ������
		
		int a = 10, b = 7;
		double c = 7.0;
		
		System.out.println("a + b : " + (a + b));
		System.out.println("a - b : " + (a - b));
		System.out.println("a * b : " + a * b);
		
		// ���� ������ ������ ����� �� ���´�
		// ��Ȯ�� ������ ����� ���Ѵٸ� �����⿡ �Ǽ��� ���ԵǾ� �־�� �Ѵ�
		System.out.println("a / b : " + a / b);
		System.out.println("a / c : " + a / c);
		System.out.println("a / (double)b : " + a / (double)b);
		System.out.println("(double)a / b : " + (double)a / b);
		
		// ������ ����
		System.out.println("a ������ b�� �ϸ� �������� : " + a % b);
		System.out.println("b ������ a�� �ϸ� �������� : " + b % a);
		
		// �� ^�� ������ �ƴϴ�
		System.out.println(10 ^ 2);
		System.out.println(10 ^ 3);
		System.out.println(10 ^ 4);
		
		// Math.pow(a, b) : a�� b������ ����Ͽ� ��ȯ���ִ� �Լ�
		System.out.println("10�� 2 ������ : " + Math.pow(10, 2) + "�̴�");
		System.out.println("10�� 3 ������ : " + Math.pow(10, 3) + "�̴�");
		System.out.println("10�� 4 ������ : " + Math.pow(10, 4) + "�̴�");
		
		// � Ÿ���� ����� �������� Ŀ���� �÷��� Ȯ���ϸ� ǥ�õ�
		// Math.pow �� ��� double(��ȯO), main�� ��� void(��ȯX)
		 
		// Math.sqrt(a) : a�� �������� ���ؼ� ��ȯ�Ѵ�
		System.out.println("9�� ������� : " + Math.sqrt(9));
		System.out.println("12�� �������� : " + Math.sqrt(12));
		
		// Math.abs(a) : a�� ���밪�� ���ؼ� ��ȯ�Ѵ�
		System.out.println("-123.12345�� ���밪�� : " + Math.abs(-123.12345));
		
		//Math.round(a) : a�� �Ҽ� ù°�ڸ����� �ݿø��� ����� ��ȯ�Ѵ�
		System.out.println("�Ҽ� ù°�ڸ����� �ݿø��� ����� : " + Math.round(123.5678));
		
		//Math.round()�� ���ϴ� �ڸ������� �ݿø��ϱ�
		// - �ݿø��ϰ� ���� �ڸ��� �Ҽ� ù° �ڸ��� ���鸸ŭ ���� �� �ٽ� ������
		System.out.println(123.56789 * 1000);
		System.out.println("�Ҽ� ��° �ڸ� �ݿø� ����� : " + Math.round(123.56789 * 1000) / 1000.0);
		System.out.println(123.56789 * 100);
		System.out.println("�Ҽ� ��° �ڸ� �ݿø� ����� : " + Math.round(123.56789 * 100) / 100.0);
		
		
		// Math : ���а� ���õ�..
	}
}
