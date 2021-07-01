package quiz;

import java.util.Scanner;

public class B11_CountAlphabet {
	
	/*
		����ڷκ��� ������ �ϳ� �Է¹ް�
		�ش� ���忡 � ���ĺ��� �� �� �����ߴ��� ��� ��� ����غ�����
		(��ҹ��ڵ� ������ ��)
		
	*/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� > ");
		String text = sc.nextLine();
		
		int[] lowercount = new int[26];
		int[] uppercount = new int[26];
		// �ҹ���, �빮�� �迭�� ���� ����
		
		for (int i = 0, len = text.length(); i < len; ++i) {
			
			char ch = text.charAt(i);
			//ch�� �Է��� ���ڿ��� ù����(0)���� ���������ڱ���
			
			if(ch >= 'a' && ch <= 'z') {
				lowercount[ch - 'a']++;
				// ch���� �ҹ��� a~z���� üũ, ��ġ�ϴ°� ������ �ٽ� -a�� �ؼ� ó������. üũ�� ���ĺ��� ī��Ʈ +1 ����.
			}else if (ch >= 'A' && ch <= 'Z'){
				uppercount[ch - 'A']++;
				// ch���� �ҹ��� A~Z���� üũ, ��ġ�ϴ°� ������ �ٽ� -A�� �ؼ� ó������. 
			}
		}
		for (int i = 0; i < 26; ++i) {
			System.out.printf("�빮�ڴ� %c�� %d�� �����߽��ϴ�.\n", 'A' + i, uppercount[i]);
			System.out.printf("�ҹ��ڴ� %c�� %d�� �����߽��ϴ�.\n", 'a' + i, lowercount[i]);
		}
		
		
		
//		final String SYMBOLS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
//		// final�� ���� ������ ������ �Ұ��������� ������. => String SYMBOLS�� ���ڸ� ������ �� ����.
//		
//		int[] symbol_count = new int[SYMBOLS.length()];
//		
//		// Common sence is not so common
//		for (int i = 0, len = text.length(); i < len; ++i) {
//			
//			char ch = text.charAt(i);
//			//System.out.println("�̹��� �˻��� ���ڴ� '" + ch + "'�Դϴ�.");
//			
//			for(int j = 0, len2 = SYMBOLS.length(); j<len2; ++j ) {
//				if (ch == SYMBOLS.charAt(j)) {
//					symbol_count[j]++;
//					//System.out.println("'" + ch +"'�� SYMBOLS�� " + j + "��°�� �����Ƿ� symbol_count�� " + j + "��° ���� ���� ��ŵ�ϴ�." );
//					//System.out.println(symbol_count[j]);  // �Էµ� ���ڿ� ���� ���ĺ� ī��Ʈ�� �����Ǵ� ���� Ȯ���� �� ����
//					break; // ���ĺ� ������ ���� �ʰ� ã�� ���ڱ����� ���� �� break�� ��
//				}
//			}
//		}
//		for (int m = 0; m < SYMBOLS.length(); ++m) {
//			System.out.println((char)(SYMBOLS.charAt(m)) + "�� ������ : " + symbol_count[m] + "�̴�.");
//		}
		
		
		
		/* �Էµ� ���ڿ����� ���ĺ� ��ҹ��� ������ ���� ����..
		int count = 0;
		
		for (int i = 0; i < text.length(); ++i) {
			char[] alpha = text.toCharArray();
			
			// alpha[i] �� ���� ���ĺ� a ~ z, A ~ Z�� ��ġ�ϴ��� üũ �ʿ�..
			// �迭�� ���ĺ� a~z�� �����ϴ� ����� �𸣰ڽ��ϴ�.
			
			if ((alpha[i] >= 'a' && alpha[i] <= 'z') || (alpha[i] >= 'A' && alpha[i] <= 'Z')) {
				count++;
			}
		}
		System.out.println(count);	// ���ĺ� ������ ����
		*/
	}
}
