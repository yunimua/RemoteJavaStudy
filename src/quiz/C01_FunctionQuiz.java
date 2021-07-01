package quiz;

public class C01_FunctionQuiz {

	private static final boolean check_result = false;


	/*
		# ������ �Լ��� �����ϰ� �ùٸ��� �����ϴ��� �׽�Ʈ �غ�����
		
		 1. ������ ���ڰ� ���ĺ��̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
		 2. ������ ���ڰ� 3�� ����̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
		 3. ���ڸ� �ϳ� �����ϸ� ���ڿ� "¦���Դϴ�" �Ǵ� "Ȧ���Դϴ�"�� ��ȯ�ϴ� �Լ�
		 4. ���ڸ� �����ϸ� �ش� ������ ��� ����� �迭 ���·� ��ȯ�ϴ� �Լ�
		 5. ������ ������ �Ҽ���� true�� ��ȯ�ϰ� �ƴϸ� false�� ��ȯ�ϴ� �Լ�
		 6. ���ڸ� �����ϸ� �ش� ������ ���丮�� ����� ��ȯ�ϴ� �Լ�
			factorial : (n)*(n-1)*(n-2)... 3*2*1
	*/
	public static void main(String[] args) {
		boolean alpha = alphabet('d');
		System.out.println(alpha);
		
		boolean three_resullt = three(13);
		System.out.println(three_resullt);
		
		String number = sniffling(14);
		System.out.println(number);
		
		int[] Yaksu = allYaksu(20);
		for (int i = 0; i < Yaksu.length; ++i) {
			System.out.print(Yaksu[i] + " ");
		}
		System.out.println();
		
//		boolean sosu_result = sosu(11);
//		System.out.println(sosu_result);
//		
//		int result = Factorial(4);
//		System.out.println(result);

		System.out.println(isPrime(1101));
		System.out.println(factorial(5));
		System.out.println("10�� ������� : " + Math.sqrt(6));
		
	}
	//1��
	public static boolean alphabet (char word) {
//		boolean check = ((word >= 'a') && (word <= 'z') || ((word >= 'A') && (word <= 'Z'))) ? true : false;
//		
//		return check;
		return word >= 'a' && word <= 'z' || word >= 'A' && word <= 'Z';
	}
	
	//1�� Ǯ��
	public static boolean isAlphabet(char ch) {
		return ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'; // �Ʒ��� ����
		//boolean �ڸ��� �Լ��� return�� �� �� �ִ�
		
//		if (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'){
//			return true;
//		}else {
//			return false;
//		}
	}

	
	//2��
	public static boolean three (int num) {
//		boolean number = num % 3 == 0 ? true : false;
//		
//		return number;
		return num % 3 == 0;  // �̷��� ������ �ȴ�.�ФФФ�
	}
	
	
	
	//3��
	public static String sniffling (int number) {
//		String snifflings = number % 2 == 0 ? "¦���Դϴ�" : "Ȧ���Դϴ�";
//		
//		return snifflings;
		return number % 2 == 0 ? "¦���Դϴ�" : "Ȧ���Դϴ�";  // ���ٷ� ������..
	}
	
	//4�� : ���ڸ� �����ϸ� �ش� ������ ��� ����� �迭 ���·� ��ȯ�ϴ� �Լ�
	public static int[] allYaksu (int num) {
		// 50�� ��� booleanŸ�� ���� 50���� ����
		boolean[] divided = new boolean[num];
		
		int count = 0;
		for (int i = 1; i <= num; ++i) {
			if (num % i == 0) { 
				//System.out.println(i);  // 1,2,4,5,10,20 ����� ��µ�
				divided[i - 1] = true; // �迭�� ������ ������ ���ڵ��� ǥ�ÿ� ���� : divided[0] ���� �����̹Ƿ� -1
				// System.out.println(divided[i-1]);  // true�� 6�� ��µ�
				count++;				// �Է��� ������ 1���� ������ 0���� �������� ī��Ʈ�� ���� : �� 6��(num 20)
			}
		}
		//System.out.println(count); // count�� 6�̴�

		int[] yaksu = new int[count]; //�迭 6���� ����
		int index = 0;
		
		for (int i = 0; i < num; ++i) {
			if (divided[i]) { // ������ ����� ���� true�� �� ī��Ʈ ����
				yaksu[index++] = i + 1; // yaksu[index(0����)++(1������)] = 0 + 1, 1���� +num����
			}	
		}
		//System.out.println(yaksu[5]); // 0~5���� ����� ����� ��µ�
		return yaksu;
	}
	
	
	//5 : ������ ������ �Ҽ���� true�� ��ȯ�ϰ� �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	
	public static boolean isPrime (int num) {
		if (num < 2) { //2���� ������ ����(�ٽ��Է�)
			return true; 	
		}else if (num == 2) { // num�� 2�� �Ҽ���
			return true; // 2�� �ƴҶ��� ������ ��������.
		}else if (num % 2 == 0) { // 2�γ����� 0���� �������°� 2���̻��̸� false
			return false; // 
		}
	
		for (int i = 3; i <= Math.sqrt(num); i += 2) { //Math.sqrt(num) : num�� �������� ���ؼ� ��ȯ
			if (num % i == 0) { //4�� ������� : 2.0, 2�� ������ 0���� �������Ƿ� false
				return false;
			}
		}
		return true;
	}	
	
	//����Ǭ��,�̰� ��� ����� ����������(������ ������ ���� �ȳ���)
//	public static boolean sosu (int num) {
//		
//		boolean check = false;
//		int count = 0;
//		for (int i = 1; i <= num; ++i) {
//			if (num % i == 0) {
//				count++;
//			}
//		}
//		return check = count == 2 ? true : false;
//	}
	
	// 6. ���ڸ� �����ϸ� �ش� ������ ���丮�� ����� ��ȯ�ϴ� �Լ�
	// factorial : (n)*(n-1)*(n-2)... 3*2*1
	
	public static int factorial (int num) {
		int factorial = 1;
		for (int i = num; i > 0; --i) { // num�Է��� ������ -�ϸ鼭 ���Ѵ�, 10�Է½� (10-0)*(10-1)*(10-3)*(10-4)*...
			factorial *= i;
		}
		return factorial;
	}
	//�ٸ���� ���
	//� �Լ��� �ڱ� �ڽ��� �ҷ��� ����ϴ� ���� ��� �Լ���� �θ���
	public static int recursive_factorial (int num) { // �̰� ������ ������... �Ѹ�
		if (num == 1) {
			return 1; // 1���� �����ϸ� �������� ���ư���, �����
		}
		return num * recursive_factorial(num - 1);// 10�� ������, 9 * 8 * 7 * 6... -��������
	}
	
	
	//����Ǭ��
//	public static int factorial (int num) {
//		
//		int fac = 1;
//		for (int i = num; i > 0; --i) {
//			fac *= i;
//		}
//		return fac;
//	}
}
