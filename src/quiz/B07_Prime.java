package quiz;

import java.util.Scanner;

public class B07_Prime {
	
	/*
		����ڷκ��� ����(���)�� �Է� ������
		1���� �Է��� ���� ���̿� �����ϴ� �Ҽ��� ��� ����غ�����.
		(������ �Է��ϸ� �ٽ� ����� �Է��ϰ� �ϱ�)
		
		�� ������ �������� ���� 1�� �ڱ� �ڽŹۿ� ���� ���� 
		
			2,3,5,7,11,13....
	*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ��� > ");
		int num = sc.nextInt();
		
		
		//for (; num < 2;) {
		for (; num < 0;) {
			System.out.println("�߸��� �����Դϴ�. �ٽ� �Է����ֽÿ�");
			System.out.print("> ");
			
			num = sc.nextInt();
		}
		
		//2. for (int chkNum = 3; chkNum <= num; chkNum += 2) {
		
		//2. System.out.println(2);
		
		for (int chkNum = 2; chkNum <= num; ++chkNum) {
			
			int count = 0;
			//1. boolean prime = true;
			
			for (int divNum = 1; divNum <= chkNum; ++divNum ) {
			//1. for (int divNum = 2; divNum < chkNum; ++divNum) {  
			//2. for (int divNum = 3; divNum <= Math.sqrt(chkNum); divNum +=2) { 
			//	�� Math.sqrt�� chkNum�� �������� Ȯ���ϴ� ���, 
				
				if(chkNum % divNum == 0) {
					count++;  // �� 1. �� �Է½� �ּ�ó�� (2��) 
					//1. prime = false; // 2���� ����
				}
			}
			if (count == 2) {
				System.out.println(chkNum);
			}
		}

	/*	�߸����� ��
		
		if (su > 1) {
			for (int i = 2; i <= su; ++i) {
				int su2 = 0;
				
				for (int j = 1; j <= i; ++j) {
					if (i % j == 0) {
						su2++;
					}
				}
				if (su2 == 2) {
				System.out.println("1���� �Ҽ��� : " + i);
				}
			}
		}else {
			
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	*/	
	}
}
