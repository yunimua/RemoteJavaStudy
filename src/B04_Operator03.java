
public class B04_Operator03 {

	public static void main(String[] args) {
		
		/*
			# ���� ������
				= : ������ ������ �������� ���� �����Ѵ�
			
			# ���� ���� ������
				- ������ ����� ������Ű�� ������ �ٿ��� ǥ���Ѵ�
					+= , -=, *=, /= .....
		*/
		
		int num = 10;
		num = num + 15; // �����ʺ��� ����ϰԵ�. ����� 25 (����)
		
		num += 15; // �̰� ���մ��� ������...
	
		num = 20;
		System.out.println(num += 5); // num = num + 5; ����� 25
		System.out.println(num -= 3); // num = num - 3; 22
		System.out.println(num *= 2); // num = num * 2; 44
		System.out.println(num /= 7); // num = num / 7; 6
		System.out.println(num %= 10); // num = num % 10;  �� ���� ���´�. 6
	
		/*
			# ���� ������
			 - 1�� ������Ű�� ������ �� �ٿ��� ǥ���� ����
			 - ++, -- ��ġ�� ���� ����� �޶�����		
		*/
		
		num = 20;
		
		num++; // num += 1; �� ���� ���� 
		System.out.println("num++�� ��� : " + num);
		
		++num;
		System.out.println("++num�� ��� : " + num);
		
		num--;
		System.out.println("num--�� ��� : " + num);
		
		--num;
		System.out.println("--num�� ��� : " + num);
		
		// ++, --�� �ڿ� ���̸� �ش� ���� ��� ����� ������ �Ŀ� ���� ��ȭ��Ų��
		num = 30;
		System.out.println(num++);
		System.out.println(num);
		
		// ++, --�� �տ� ���̸� �ش� ���� ����� �����ϱ� ���� ���� ��ȭ��Ų��
		num = 30;
		System.out.println(++num);
		System.out.println(num);
	}
}
