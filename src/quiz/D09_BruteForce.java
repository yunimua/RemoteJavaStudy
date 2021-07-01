package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class D09_BruteForce {

	/*
		# ��й�ȣ ���̸� �Է¹����� ���� ���ڷ� ���� �� �ִ� ��� �ش� ������ ��й�ȣ�� ����غ�����
		
		- ���� ��/�ҹ��� [a-z] 26��, [A-Z] 26�� => �� 52��
		- ���� [0-9] => �� 10��
		- Ư������ (shift ������ ���ڿ� �ִ°͵鸸) !@#$%^&*() => �� 10��
		
		���� 72��...
		
		ex) 4 > 0000 ~ zzzz
	*/
	
	static String charset = "abcdeefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()"; //+ ���ڵ��� ����(74����)

	public static void main(String[] args) {
		bruteforce(10);
	}
	
	/*
		 # 10������ ���
		 
		 	- 1234567 
		 		
		 		1234567 % 10 => 7 (���� �ڸ� �и�)
		 		1234567 / 10 => 123456(���� �ڸ� ����)
		 		123456 % 10 => 6 (���� �ڸ� �и�)
		 		123456 / 10 => 12345 (���� �ڸ� ����)
	
	*/
	
	public static void bruteforce(int password_size) {
		char[] arr = charset.toCharArray();
		int len = charset.length();
		long all_passwoed = (long) Math.pow(len, password_size); //+ Math.pow : ����!
		
		for (long i = 0; i < all_passwoed; ++i) {
			//System.out.println(i);
			long value = i;
			
			String password = "";
			while(value > 0) {
				password += arr[(int)value % len];
				value /= len;
			}
			
			if (password.length() < password_size) {
				int gap = password_size - password.length(); //+ �ѹ��� ���� ���ϰ� �� ������ �Ʒ��� ���
				for (int j = 0; j < gap; ++j) { //+ gap�ڸ��� password_size - password.length(); �� ������ ���� ��� ���ҵ�
					password = "a" + password;
				}
			}
			
			System.out.println(password);
		}
		System.out.println("len : " + len);
	}

	
	// ������, �������� ���??
//	private static ArrayList<Character> availableList = new ArrayList<>();
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("��й�ȣ ���̸� �Է��ϼ���.>");
//		int input = sc.nextInt();
//		
//		for(int i = '0'; i <= '9'; i++) {
//			availableList.add((char)i);
//		}
//		for(int i = 'a'; i <= 'z'; i++) {
//			availableList.add((char)i);
//		}
//		for(int i = 'A'; i <= 'Z'; i++) {
//			availableList.add((char)i);
//		}
//		Collections.addAll(availableList, '!','@','#','$','%','^','&','*','(',')');
//		// availableList : ArrayList�� ����, ���ĺ���ҹ���, Ư�����ڸ� ��� �ִ´�
//		// System.out.println(availableList);
//		
//		char[] prevChars = new char[input-1]; //+ �迭�� 0���� �����ϹǷ� -1
//		
//		printAllAvailablePassword(prevChars, input);
//	}
//
//	private static void printAllAvailablePassword(char[] prevChars, int len) {
//		for(int i =0, size = availableList.size(); i < size; i++) { // array�迭�� ������ ũ��(72)���� ����
//			if(len == 1) {
//				for(int j = prevChars.length-1; j > -1; j--) { // �Է��� ���� �迭�� �� ũ�� (2�� 2-1)���� �����ؼ� 0����(-1)�̵ɋ����� ����
//					System.out.print(prevChars[j]); 
//				}
//				System.out.println(availableList.get(i)); // �Է��� ���� ������ ���ڴ� array����Ʈ�� ���ڿ��� �ݺ��Ͽ� ���
//			} else {
//				prevChars[len-2] = availableList.get(i);
//				printAllAvailablePassword(prevChars, len-1);
//			}
//		}
//	}
	
	
	// �ҿ��Դ��
//	public static String pw = "abcdeefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()";
//	public static int cnt = pw.length();
//	   
//   public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in);
//      int len; // �Է¹޴� ��й�ȣ ����.
//
//      System.out.print("how long? ");
//      len = sc.nextInt();
//      System.out.println("length: " + len);
//      
//      int[] count = new int[len]; // ���̺� �� ��° ���ڸ� ������� �����صδ� �迭.
//      boolean[] check = new boolean[len]; // 3�ڸ� �̻��� �� ���� �ڸ����� �����ڸ����� �ٲ𶧱��� ��� 0���� ������ �������ϱ�.. üũ���ִ� ��.
//      
//      while(count[0] != cnt) {
//         for (int i = 0; i < len; i++) {
//            System.out.print(pw.charAt(count[i] % cnt));
//         }
//         System.out.print("\n");
//         
//         count[len-1]++;
//         for (int j = len - 2; j >= 0; j--) {
//            if (count[j + 1] != 0 && count[j + 1] % cnt == 0 && check[j] == false) {
//               count[j]++;
//               check[j] = true;
//            } else if (count[j + 1] != 0 && count[j + 1] % cnt != 0 && check[j] == true) {
//            	check[j] = false;
//            }
//         }
//      }
//   }
}
