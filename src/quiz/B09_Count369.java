package quiz;

import java.util.Scanner;

public class B09_Count369 {
	
	/*
		����ڷκ��� ������ �ϳ� �Է¹��� ��
		�ش� ���ڱ��� 369 ������ ����ȴٸ� �ڼ��� �� �� �� �ľ��ϴ��� �������.
		
		(�� 33, 36, 39...���� ���ڴ� ������ Ĩ�ϴ�.)
		
		
		���� �ذ�� - ������ Ǫ�� ���� ã�� ��
		������ - �����س� ���� �ڵ�� �����ϴ� ��
		��� ���ط� - ����ϴ� �� ���� ���� ���ص�
		
		//sysout > ctrl + space > System.out.println();
		ctrl + shift + o = import
		
	*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ڼ� üũ�غ� ���� > ");
		int num = sc.nextInt();
		
		// 353 % 10
		// 353 / 10
		// 353 / 100 % 10
		int count =  0;
		
		for (int i = 1; i <= num; ++i) {
			int checkNum = i;
			
			System.out.printf("[%d]\t: ", checkNum);
			
			while (checkNum != 0) {
				
				int digit = checkNum % 10;
				
				if (digit % 10 != 0 && digit % 3 == 0) {
					System.out.print("¦");
					count++;
				}
				checkNum /= 10;
			}
			System.out.println();
		}
		System.out.printf("�ڼ��� �� %dȸ �ƽ��ϴ�.\n", count);
	}
}
			
		/*
		int count = 0;

		System.out.print("���� �Է��ϼ��� > ");
		int su = sc.nextInt();
		
		for (int i = 1; i <= su; ++i) {
			
			int sum = i;													//�Է��� su�� sum���� ���� (1���� �Է��� su����)
																			// �� i�� �ְԵǸ� ���� ���� �� ����. 1�� �ݺ��ϴϱ�, ����� sum���� üũ
			while(sum > 0) {												//�Է��� su(sum)�� 0���� ū ��� ����
				if (sum % 10 == 3 || sum % 10 == 6 || sum % 10 == 9) {		//�������� ���� 3,6,9 �� �� üũ
					count++;												// 3,6,9 �� ���ڰ� ������ +1�� ����
				}
				sum /= 10;													//�Է��� su(sum)�� 10���� ������ �� �������� ���ڰ� 3,6,9 �� �� ī��Ʈ
			}
		}
		System.out.println(count);
		*/	


		
/*		for (int i = 1; i <= su; ++i) {
			for (int j = i; j > 0;) {
				if (j % 10 == 3 || j % 10 == 6 || j % 10 == 9) {
					count++;
					System.out.println("**" + count);
					System.out.println("^" + j);
				}
				j /= 10;
				System.out.println("/" + j);
			}
		}
		System.out.println(count);
	}
}*/
