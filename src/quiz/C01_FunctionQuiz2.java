package quiz;

import java.util.Arrays;

public class C01_FunctionQuiz2 {
	
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(range(5,10))); // Arrays.toString ���ڿ��� ��ȯ�ϱ�
		System.out.println(Arrays.toString(range(40, 50, 3)));
//		//1��
//		int[] number = range1(10);
//		for (int i = 0; i < number.length; ++i) {
//			System.out.print(number[i] + " ");
//		}
//		System.out.println();
//		
//		//2��
//		int[] min_max = range2(5, 10);
//		for (int i = 0; i < min_max.length; ++i) {
//			System.out.print(min_max[i] + " ");
//		}
//		System.out.println();
//		
//		//3��
//		int[] num_plus = range3(40, 50, 3);
//		for (int i = 0; i < num_plus.length; ++i) {
//			System.out.print(num_plus[i] + " ");
//		}
//		System.out.println();
	}
//		# ������ �Լ��� �����ϰ� �ùٸ��� �����ϴ��� �׽�Ʈ �غ�����
//		
//		 1. �ִ밪�� �Ű������� ���޹����� 
//		 	0���� �ִ밪 �̸��� ��� ���� �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ�
//		 	range �Լ��� ��������.
// 	
//			ex: range(10)�� ��� -> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
	
	/*
		# �Լ� �����ε�(overloading)
			- �Ű������� ���� �Ǵ� Ÿ���� �ٸ��� �Ȱ��� �Լ��� ����� �� �ִ�
		
		>> int[] range ���� �̸����� �Լ��� �� �� �־��� �͵� �����ε��̴�
	*/
	public static int[] range(float num) {
		// println() ���� �پ��� Ÿ�Ե��� �����ε��� �����Ѵ�
		System.out.println(110);
		System.out.println("123");
		System.out.println('A');
		return null;
	}

	public static int[] range (int num) {
		
		int[] arr = new int[num];
		
		for (int i = 0; i < num; ++i) {
			arr[i] = i;
		}
		return arr;
	}
	
	
//	public static int[] range1 (int num) {
//
//		int[] number = new int[num];
//
//		for (int i = 0; i < number.length; ++i) {
//			number[i] = i; // +=�� �ʿ������
//		}
//		return number;
//	}

//		 2. �ּҰ��� �ִ밪�� �Ű������� ���޹����� 
// 			�ּҰ����� �ִ밪 �̸��� ��� �������� �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ�
//		 	range �Լ��� ��������.
//		 	
//		 	range(5, 10)�� ��� -> [5, 6, 7, 8, 9]
	
	public static int[] range (int start, int end) {
				
		int increase = start > end ? -1 : 1;
		// increase���� ���۰��� -1�̳�, 1�̳Ŀ� ���� ���������� ���۵�
		
		int[] arr = new int[increase < 0 ? start - end : end - start];
		//start �� ũ�� = -1, �׷� start - end�� �Ѵ� (start = 5)
		// end �� ũ�� = 1, �׷� end - start�� �Ѵ�	(end = 10)
		// �׷� ū������ �������� �� ���� �� �迭 ���� �ȴ� (10-5 = 5)
		
		for (int value = start, index = 0; value != end; value +=increase) {
			//ū������ �������� �� ��(5)�� ���� ���� �ǰ�, �迭�� 0���� ���۵Ǿ� �ϴϱ� index = 0�� ����
			// value(ū��-������)�� ū��(10)���� ����ȴ�
			// increase(1)�̸�, 5+1, 5+2, 5+3, 5+4, 5+5 �� �����, ����� 6,7,8,9,10�̹Ƿ� -1�� increase�� ���Ѵ� 
			
			arr[index++] = value; //arr[0]���� ū������ = value���� �迭�� �ֱ� : 5,6,7,8,9 �� �迭�� ��
		}
		return arr;
	}
	
	
//	������ 2����, �迭 �� ���� �����	
//	public static int[] range2 (int num1, int num2) {
//		
//		int[] num_1 = new int[num1];
//		int[] num_2 = new int[num2];
//		
//		int[][] arr = {num_1, num_2};
//		
//		int max = Math.max(num1, num2);
//		int min = Math.min(num1, num2);
//		
//		boolean[] check = new boolean[max];
//		int count = 0;
//		
//		for (int i = 0; i < arr.length; ++i) {
//			for(int j = 0; j < arr[i].length; ++j) {
//				arr[i][j] += j;
//				if(arr[i][j] >= min && arr[i][j] < max) {
//					check[j-1] = true;
//					count++;
//				}
//			}
//		}
//		int[] result = new int[count];
//		int set = 0;
//		for (int i = 0; i < max; ++i) {
//			if (check[i]) {
//				result[set++] = i + 1;
//			}
//		}
//		return result;
//	}


//		 3. �ּҰ��� �ִ밪�� �������� �Ű������� ���޹�����
//		 	�ּҰ����� �ִ밪 �̸����� ��������ŭ �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ�
//		 	range �Լ��� ��������.
//		 	
//		 	range(40, 50, 3)�� ��� -> [40, 43, 46, 49] // 40~ 50 +3��
//		 	range(40, 45, 5)�� ��� -> [40]
	
	// /** �� ���� ���, public ���� �ۼ��ؾ� "public static int[] range"���� ���콺�� �÷��� �� �޸�ó�� ��µ�
	/**
 	����ȭ �ּ� (�� ��ɿ� ���� ������ �� �� �ִ�)
 	
 	@start
 		�����ϴ� ���� ��������
 	@end
 		������ ���� ��������
 	@return	
 		�߸��� ���� �Է��ϸ� null�� ������, ����� �����ø� int[]�� ���ɴϴ�.
	 */
	public static int[] range (int start, int end, int increase) {

		if (increase < 0 && start <= end) { // 0���� �۰ų� start�� end���� ������ null�� �ش�
			return null;
		}else if (increase > 0 && start >= end) { // 0���� ũ���� end ���� start���� ������ null�� �ش�
			return null;
		}else if (increase == 0) { // 0�� �� null�� �ش�
			return null;
		}
		
		int size;
		if (increase > 0) { // increase�� 0���� Ŭ�� ����
			int range = end - start; // range���� �ּҰ� üũ (end50-start40 =10)
			size = range % increase == 0 ? range / increase : range / increase + 1;
			//size = 10 % 3 ==0 ? false�̹Ƿ� 10 / (3+1)4 => 2.5 => 3(�ݿø�..)
			System.out.println(increase + "++");
		}else {
			int range = start - end; // range���� �ּҰ� üũ (start50-end40 =10)
			size = range % (increase * -1) == 0 ? range / (increase * -1) : range / (increase * -1) + 1;
			//size = 10 % (3*-1)-3 == 0 ? false�̹Ƿ� -3 +1 => -2
		}
		
		//System.out.println("size: " + size);
		int[] arr = new int[size];
		
		for (int value = start, index = 0; value != end; value += increase ) {
		// for (int value = start, index = 0; increase > 0 ? value < end : value > end; value += increase) {
		// ���� if�� ���� �ʿ�.arr[index++] = value; ������.
		// (value = 40, index = 0; 40 != 50; 40 += 3){
			System.out.println(increase + "====");
			if (increase > 0 && value > end) { // increase3�� 0���� ũ��(O), value40 > end50 Ŭ����(X) false
				break;
			}else if (increase < 0 && value < end) {// increase3�� 0���� �۰�(x), value40 < end50 Ŭ��(o)�� false
				break;
			}
			arr[index++] = value; // arr[0] ���� [39]���� ���ڸ� ä���ִ´� => 40, 43, 46, 49
			//System.out.printf("arr[%d] : %d\n", index - 1, value);
		}
		return arr;
	}
		
// 	������ 3����, �迭�� �� ���� ����ع���
//	public static int[] range3 (int num1, int num2, int plus) {		
//		int[] num_1 = new int[num1];
//		int[] num_2 = new int[num2];
//		int[] plus_1 = new int[plus];
//		
//		int[][] arr = {num_1, num_2, plus_1};
//		
//		int max = Math.max(num1, num2);
//		int min = Math.min(num1, num2);
//		
//		boolean[] check = new boolean[max];
//		int count = 0;
//		
//		for (int i = 0; i < arr.length; ++i) {
//			for(int j = 0; j < arr[i].length; ++j) {
//				arr[i][j] += j;
//				for(int small = min; small < max; small += plus_1.length) {
//					if (arr[i][j] == small) {
//						check[j-1] = true;
//						count++;
//					}
//				}
//			}
//		}
//		int[] result = new int[count];
//		int set = 0;
//		for (int i = 0; i < max; ++i) {
//			if (check[i]) {
//				result[set++] = i + 1;
//			}
//		}
//		return result;
//	}
}	

