package quiz;

public class B07_Gugudan {
	
	/*
		1. �������� ������ ���� ���η� ����غ�����.
		
		2�� : 2X1......
		3�� : 3X1....
		
		2. �������� ������ ���� ���η� ����غ�����.
		
		2��	3��	...
		2X1	3X1	...
		2X2	3X2	...
		2X3	3X3	...
	*/
	
	public static void main(String[] args) {
		
		// �����ֽ� ��
		for (int dan = 2; dan <= 9; ++dan) {
			System.out.printf("%d��: " , dan);
			for (int gop = 1; gop <=9; ++gop) {
				System.out.printf("%dx%d=%-2d"+ ' ', dan, gop, dan*gop);
			}
			System.out.println();
		}
		
		for (int line = 0; line < 10; ++ line) {
			
			for (int dan = 2; dan <= 9; ++dan) {
				if (line ==0) {
					System.out.printf("%d��\t", dan);
				}else {
					System.out.printf("%dx%d=%d\t", dan, line, dan * line);
				}
			}
			System.out.println();
		}

		
//		for (int dan = 2; dan <= 9; ++dan) {
//			System.out.print(dan + "�� : ");
//			
//			for (int gop = 1; gop <=9; ++gop) {
//				System.out.print(dan + "*" + gop + "=" + dan*gop + '\t');
//			}
//			System.out.println("");
//		}
//		for (int gop = 2; gop <=9; ++gop) {	
//			System.out.print(gop + "��" + '\t');
//		}
//		System.out.println("");
//		
//		for (int gop = 1; gop <=9; ++gop) {	
//			
//			for (int dan = 2; dan <= 9; ++dan) {
//				
//				System.out.print(dan + "*" + gop + "=" + dan*gop + '\t');
//			}
//			System.out.println("");
//		}
	}
}
