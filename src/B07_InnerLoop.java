
public class B07_InnerLoop {
	public static void main(String[] args) {
		
		for (int i =0; i < 10; ++i) {
			System.out.println("===================�ٱ��� �ݺ��� " + i); // 10�� �ݺ�
			
			for (int j = 0; j < 8; ++j) {
				System.out.printf("------------���� �ݺ��� %d-%d\n", i, j); // 8�� �ݺ�, �ٱ� 1���� ���� 8�� �ݺ� (�� 80ȸ)
				
				/*for (int k = 0; k < 3; ++k) {
					System.out.printf("+++���� ���� �ݺ��� %d-%d-%d\n", i, j, k); // 3�� �ݺ�, 2�� 80*3 = 240ȸ �ݺ���..
				}*/
			}
		}
		
		/*
			# ���� �ݺ������� ������ ����غ���
				
				- 2�� ~ 9��
				- �� �ܸ��� x1 ~ x9����
		*/
		
		for (int dan = 2; dan <= 9; ++dan) {
			
			System.out.printf("####%d��####\n", dan);
			
			for (int gop = 1; gop <=9; ++gop) {
				System.out.printf("%d x %d = %d\n", dan, gop, dan* gop);
			}
			
			System.out.println();
		}
	}
}
