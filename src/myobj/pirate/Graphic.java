package myobj.pirate;

public class Graphic {
	
	public static void printTong(MrTong tong) { //+ (boolean[] stabbed)�� �ְ� �����߾���(1��)
		
		boolean[] stabbed = tong.getStabbed();
		
		for (int i = 0, len = stabbed.length; i < len; ++i) {
			
			System.out.print(!stabbed[i] ? "O " : "X "); // false�� O�� ǥ��, true�� Xǥ��
			
			if (i % 15 == 14) {
				System.out.println();
			}
		}
	}
}
