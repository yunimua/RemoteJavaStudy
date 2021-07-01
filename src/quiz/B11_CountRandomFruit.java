package quiz;

import java.util.Scanner;

public class B11_CountRandomFruit {

	/*
		����ڷκ��� ���ڸ� �Է¹����� �ش� ���� ��ŭ ���� ������ �����Ѵ�.
		(�������� �����ϴ� ���� - apple, banana, kiwi, orange, grape, peach
		
		�� �� �� ������ �� �� �����ߴ��� ��� ����ϰ� ���
	*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� > ");
		int repeat = sc.nextInt();
		
		String[] fruits = {"apple", "banana", "kiwi", "orange", "grape", "peach"};

		int[] fruit_count = new int[fruits.length]; 				  // fruits �迭�� �� ��������, fruits.length : 6��
		
		for (int i = 0; i< repeat; ++i) {							  // �Է��� ������ ����(��������)
			int random_number = (int)(Math.random() * fruits.length); //�����ϰ� ���� ��� (0~5 �Ǵ� 1~6)
			System.out.println(fruits[random_number]);	 	 		  // �����ϰ� ������ ��µ�.
			fruit_count[random_number]++;							  // ������ ���������� +1�� ī��Ʈ�� ����.
		}
		System.out.println("### ���� ���� Ƚ�� ###");
		
		for (int i = 0; i < fruits.length; ++i) {					  // 0���� ������ ������ ��(����)���� ����
			System.out.printf("%s�� %d�� �����߽��ϴ�.\n", fruits[i], fruit_count[i]); //ȭ�� ��� : ���� �̸� / ��µ� Ƚ�� 
		}
		
		

		
//		String[] fruit = {"apple", "banana", "kiwi", "orange", "grape", "peach"};
//		int[] fruit_num = new int[fruit.length];  // �߰��� ����
//		
//		for (int i = 0; i < repeat; ++i) {
//			int su = (int)(Math.random() * fruit.length);
//			System.out.println(fruit[su]);
//			fruit_num[su]++;
//		}
//		for(int i = 0; i < fruit.length; ++i) {
//			System.out.println(fruit[i] + "�� " + fruit_num[i] + "�� ���Խ��ϴ�");

			
//			if (fruit_num == 1) {
//				System.out.println(fruit[su]);
//			}else if (fruit_num == 2){
//				System.out.println(fruit[su]);
//			}else if (fruit_num == 3){
//				System.out.println(fruit[su]);
//			}else if (fruit_num == 4){
//				System.out.println(fruit[su]);
//			}else if (fruit_num == 5){
//				System.out.println(fruit[su]);
//			}else if (fruit_num == 6){
//				System.out.println(fruit[su]);
//			}
//		}
	}
}
