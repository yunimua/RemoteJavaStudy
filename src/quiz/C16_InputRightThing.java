package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C16_InputRightThing {

	/*
		����ڷκ��� ���ڸ� �Է¹޵� ���ڸ� ����� �Է¹��� �� ���� ��� �Է¹޴� ���α׷��� ��������.
		(�ٸ� Ÿ���� ���� �ԷµǾ ���α׷��� �������� ���� �ʾƾ� �մϴ�)
	*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		while(true) {
			try {
			System.out.print("���ڸ� �Է��ϼ��� > ");
			num = sc.nextInt();
			System.out.println("�Է��� ���� : " + num);
			break;
			
			} catch (InputMismatchException e) {
				System.out.println("���ڸ� �Է��ϸ� �ȵ˴ϴ�.");
				System.out.println("�߸� �Էµƴ� �� : " + sc.nextLine());
//			} finally {
//				sc.nextLine();
			}
		}
		System.out.println("���ڰ� �ԷµǾ� ����˴ϴ�.");
	}
}
