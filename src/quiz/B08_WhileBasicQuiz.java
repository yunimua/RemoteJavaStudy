package quiz;

public class B08_WhileBasicQuiz {

	/*
		while���� �̿��Ͽ� ������ ���Ͻÿ�.
		
		1. 1���� 100 ���̿� �ִ� 3�� ����� ����
		
		2. 355���� 237���� ���
		
		3. continue �� �ݵ�� ����Ͽ� 3000���� 5000������ 7�� ����� ����ϱ�
		
		4. 1���� 200������ ���� �� 2�� ����� �ƴϰ� 3�� ����� �ƴ� ���ڵ��� ����
		
	*/
	public static void main(String[] args) {
		
		int i = 1;
		int sum = 0;
		/*
		while (i < 101) {
			//System.out.println(i++); // 1~100���� ��µ�
			if (i % 3 == 0) {
				sum += i;
			}
			++i;
		}
		System.out.println(sum);
		System.out.println("-----1��");
		
		i = 1;
		
		while (i < 101) {
			if (++i % 3 == 0) {
				sum += i;
			}
		}
		
		System.out.println("-----1��");
		*/
		i = 355;
		
		while (i >= 237) {
			System.out.print(i--);
			
			if (i !=236) {
				System.out.print(", ");
			}else {
				System.out.println();
			}
		}
		System.out.println("-----2��");
		
		
		i = 3000;
		
		while (i <=5000) {
			if (i % 7 != 0) {
				++i;
				continue;
			}
			System.out.println(i);
			++i; // �� ++i�� ���� ������ ��°��� ���� ���� ����
		}
		System.out.println("-----3��");
		
		
		
		//4��
		i = 1;
		sum = 0;
		
		while (i <= 200) {
			if (i % 2 != 0 && i % 3 != 0) {
				sum += i;
			}
			++i;
		}
		System.out.println(sum);
		System.out.println("-----4��");
		
		
		
		i = 0;
		int total = 0;
		
		while (i <= 100) { // ��� ���� (���ǰ�)
			++i;
			
			if (i % 3 == 0) {
				total += i; // ++�� ���� �ȵ�!!! �ФФ�
			}
			
		}
		System.out.println(total);
		System.out.println("-----1��");
		
		i = 356;
		
		while (i >= 237) { 
			--i;
			System.out.println(i);
		}
		System.out.println("-----2��");
		
		
		// ���� Ʋ��
		i = 3000;
		int j = 5000;
		
		while (j > i) { 
			// System.out.println(j--);
			if (i % 7 != 0) {
				++i;
				continue;
			}
			System.out.println(i);
			++i;
		}	
		System.out.println("-----3��");
		
		
		i = 0;
		total = 0;
		
		while (i <= 200) { 
			++i;
			
			if (i % 2 != 0 && i % 3 != 0) {
				total += (++i -1);
			}
			
		}
		System.out.println(total);
		System.out.println("-----4��");
		
	}
}
