// Ctrl + Shift + O : �ڵ� import

public class A09_Operator02 {

	public static void main(String[] args) {
		
		/* 
		  # �� ������
		  
		   - �� ���� ���ϴ� ����
		   - �� ������ ����� boolean Ÿ�Դϴ�. (�� / ����)
		   - ��� ����� �� ������ �Բ� ������ ��� ������ ���� ����Ѵ�	 
		*/
		
		int a = 10, b =10;
		
		System.out.println(a > b);
		System.out.println(a < b);
		
		// �� �ݵ�� �ε�ȣ�� ���� ���;� �� (��ȣ�� ���� ������ �ȵ�)
		System.out.println(a >= b);
		System.out.println(a <= b);
		
		System.out.println(a == b); // �� ���� ���� ������ true
		System.out.println(a != b); // �� ���� ���� �ٸ��� true
		
		/*
		  	# �� ������
		  	
		  	 - boolean Ÿ�� ������ �ϴ� ����
		  	 - �� ����� �� ������ �Բ� ������ �� ������ ���� ����Ѵ�
		  	 - && : �� ���� ���� ��� true�� ���� true (AND)
		  	 - || : �� ���� �� �� �ϳ��� true���� true (OR)
		  	 - ! : true�� false, false�� true (NOT)
		*/
		
		System.out.println("true && true : " + (true && true));
		System.out.println("true && false : " + (true && false));
		System.out.println("false && true : " + (false && true));
		System.out.println("false && false : " + (false && false));
		
		System.out.println("true || true : " + (true || true));
		System.out.println("true || false : " + (true || false));
		System.out.println("false || true : " + (false || true));
		System.out.println("false || false : " + (false || false));
		
		System.out.println(!true);
		System.out.println(!false);
		
		int c = 41;
		
		System.out.print("c�� ¦���ΰ���? ");
		System.out.println(c % 2 == 0);
		
		System.out.print("c�� Ȧ���ΰ���? ");
		System.out.println(c % 2 == 1);
		System.out.println(!(c % 2 == 0));
		System.out.println(c % 2 != 0);
		
		System.out.print("c�� ¦���̸鼭 50���� ū����?");
		System.out.println(c % 2 == 0 && c > 50);
		
		System.out.print("c�� ¦���̰ų� 50���� ū����?");
		System.out.println(c % 2 == 0 || c > 50);
		
		// ���� ���� : ���� x,y,z�� ��� 3�� ����� �ƴ� �� true�� �Ǵ� �� ������ ����� ������
		
		int x = 1;
		int y = 4;
		int z = 100;
		
		System.out.print("3�� ����� �ƴѰ�: ");
		System.out.println(x % 3 != 0 && y % 3 != 0 && z % 3 != 0);
		
		/*
		int x = 4, int y = 5, int z = 7;
		*/
		System.out.println(x % 3 != 0 && y % 3 != 0 && z % 3 != 0);
		System.out.println(!(x % 3 == 0 && y % 3 == 0 && z % 3 == 0));
		
	}
}
