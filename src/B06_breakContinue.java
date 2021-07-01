
public class B06_breakContinue {
	public static void main(String[] arg) {
		
		/*
			# break
			 - �ݺ��� ���ο��� ����ϸ� �����ִ� �ݺ����� �ϳ��� Ż���Ѵ�
			 - switch�� ���ο��� ����ϸ� switch���� Ż���Ѵ�
			 
			# continue
			 - �ݺ��� ���ο��� ����ϸ� ���� �� �ݺ����� �ٷ� �Ѿ��
			 - continue�� ���� �������� �ؿ� �ִ� �ݺ��� ����� ��� ���õȴ�		
		*/
		
		for (int i =0; i <100; ++i) {
			if (i == 3 || i == 4) {
				continue;  // 3,4�� ������ ���� ������ �Ѿ��.
			}
			System.out.println(i);
		}
		
		System.out.println("----------");
		
		for (int i =0; i <10; ++i) {
			if (i == 3 || i == 4) {
				break;  // 3,4�� ������ ����, ������.(�����)
			}
			System.out.println(i);
		}
		
		
		
		//# for���� ���� �ݺ�
		for (int i =0; true; ++i) {  // (; ture;)�� ��� ���ѹݺ� ����. true�϶� ��� �ݺ��Ǳ� ������.
			if (i == 10) {
				break;
			}
			System.out.println(i);
		}	
		
	}
}
