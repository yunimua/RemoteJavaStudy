package quiz;

import java.util.Arrays;

public class B12_Array2Quiz {
	
	public static void main(String[] args) {
		
		int[][] numArr = new int[][]{
			{1, 1, 1, 1}, // ���η� ���Ѱ� ���� ��
			{1, 1, 1, 1, 1, 1, 1},
			{1, 1, 1, 1, 1},
			{1, 1},
			{1, 1, 1, 1}, // ���η� ���Ѱ��� ���� ��
		};
		
		/*
			1. numArr�� ��� ���� 0~100 ������ ���� ������ �ٲ㺸����
			
			2. �������� �ٲ� numArr�� ��� ���� ����ϰ� ���հ� ���(�Ҽ��� ��°�ڸ�)�� ���ؼ� ����غ�����
			
			3. numArr�� �� ���� ���� ��� ���ؼ� ����غ�����
			
			4. numArr�� �� ���� ���� ��� ���ؼ� ����غ�����
		*/
		
		//1��
		for (int row = 0; row < numArr.length; ++row) {
			for (int colnum = 0; colnum < numArr[row].length; ++colnum) {
				
				numArr[row][colnum] = (int)(Math.random() * 101); // 100������ +1�̵Ǿ�� ��
			}
		}
		//2��
		int sum = 0;
		int count = 0;
		
		for (int row = 0; row < numArr.length; ++row) {
			
			int len = numArr[row].length;
			count += len;
			//System.out.println(len); // numArr[0~4]�迭�ȿ� ����ִ� ���� ������ ����
			
			for (int colnum = 0; colnum < len; ++colnum) {
				System.out.print(numArr[row][colnum] + "\t");
				sum += numArr[row][colnum];
				//count++;			 // ���ڸ� �ϳ��� ���ϰų�.
			}
			System.out.println();
		}
		System.out.printf("���� : %d, ��� : %.2f\n", sum, sum/(double)count); // %.2f\ : �Ҽ��� 2��°¥������ ǥ��
		
		//3��
		int[] rowSum = new int[numArr.length];
		
		for (int row = 0; row < numArr.length; ++row) {
			for (int colnum = 0; colnum < numArr[row].length; ++colnum) {

				rowSum[row] += numArr[row][colnum];  // if������ ���� ����� (��������)
			}
		}
		
		//4��
		int max_len = 0;
		
		for (int row = 0; row < numArr.length; ++row) {
			max_len = Math.max(max_len, numArr[row].length);
			// Math.max �� �� ū���� üũ�ϴ°�...
			
		}
		
		int[] colSum = new int[max_len]; // ���� ū ������ üũ�� 7�̶�� ���� �������
		
		for (int row = 0; row < numArr.length; ++row) {
			for (int colnum = 0; colnum < numArr[row].length; ++colnum) {

				colSum[colnum] += numArr[row][colnum];
			}
		}
		
		//�迭�� ���ϰ� ���ڿ��� ��ȯ�ϱ�
		System.out.println("���� �� : " + Arrays.toString(rowSum));
		System.out.println("���� �� : " + Arrays.toString(colSum));
		

		
		
//		int sum = 0, mean = 0, rows = 0;
//		
//		
//		for (int i =0; i < numArr.length; ++i) {
//			for (int j = 0; j < numArr[i].length; ++j) {
//				int random = (int)(Math.random() * 101);					//101�̾����!!!!!!!!!
//				System.out.println(random);									// ������ 0~ 100���� �� 22�� ���
//				sum += random;
//				mean += numArr[i][j] + random - numArr[i][j];
//			}
//			System.out.println("������ ���� : " + mean);
//			mean = 0;
//		}
//		System.out.println();
//		System.out.print("----���� : ");
//		System.out.println(sum);											// ������ ����
//		System.out.println("----��� : " + (double)(sum/22.0));	
		
	}
}









