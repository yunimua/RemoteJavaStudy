import java.util.Scanner;

public class B11_Array {

	/*
		# �迭 (Array)
	
		 - ���� Ÿ�� ������ �ѹ��� ������ �����ϴ� ���
		 - ���� �̸����� ������ ������ ������ �� �ε����� �����Ѵ�
		 - �迭�� �ε���(�� ��ȣ)�� 0���� ��ü ���� -1���� �ִ�. (100�� ��� 0~99)
		 - �迭�� �ѹ� ũ�Ⱑ �������� ũ�⸦ ������ �� ���� (100���� ������ �Ŀ� ���� ���� �Ұ�)
		 - �����ʹ� �ٸ��� �迭�� ������ ���ÿ� ��� ���� �ʱ�ȭ �Ǿ� �ִ� 
		 	(���� : 0, �Ǽ� : 0.0, boolean: false, ������:null) => �⺻�� default
		 - ��� Ÿ���� �迭�� �ѹ��� ������ �� �ִ�
	*/
	
	public static void main(String[] args) {
		
		Scanner[] scanners = new Scanner[10]; // ��ĳ�ʸ� 10�� �����
		
		scanners[0] = new Scanner(System.in); // ��ĳ�� 0������ �ý��� ����
		scanners[1] = new Scanner(System.in);
		scanners[2] = new Scanner(System.in);
		
		System.out.println("ù ��° ��ĳ�� : " + scanners[0]);
		System.out.println("�� ��° ��ĳ�� : " + scanners[1]);
		System.out.println("�� ��° ��ĳ�� : " + scanners[2]);
		System.out.println("�� ��° ��ĳ�� : " + scanners[3]); // �ƹ��͵� ������� �ʴ�, null �� �������.
		
		
		/*int aaaaaa, b = 17, c;
		
		System.out.println(aaaaaa); // a, c�� ���� �������� �ʰ�, �ʱ�ȭ���� �ʾ� ���� �߻�
		System.out.println(b);
		System.out.println(c);*/
		
		int[] randomNumbers = new int[100];  // intŸ�� ������ 100�� �����
		
		randomNumbers[5] = 17; // 5���� 17�̶�� ���� ����
		
		System.out.println(randomNumbers[0]);
		System.out.println(randomNumbers[1]);
		System.out.println(randomNumbers[2]);
		System.out.println(randomNumbers[3]);
		System.out.println(randomNumbers[4]);
		System.out.println(randomNumbers[5]);  // 5������ 17�� ��µǰ� �������� ��� 0
		System.out.println(randomNumbers[6]);
		System.out.println(randomNumbers[7]);
		
		
		// �迭.length�� ���� �迭�� ��ü ���̸� �� �� �ִ�
		System.out.println("randomNumbers�� ���� : " + randomNumbers.length); // ����� : 100
		System.out.println("randomNumbers�� ������ �ε��� ��ȣ : " + (randomNumbers.length-1));  // 99
		System.out.println("scanners�� ���� : " + scanners.length); // 10
		System.out.println("scanners�� ������ �ε��� ��ȣ : " + (scanners.length-1)); // 9
		
		
		/*
			# �迭 ���� ���
			 
			 1. Ÿ��[] ������ = new Ÿ��[�迭ũ��];
			 2. Ÿ��[] ������ = {��1, ��2, ��3, ...}
			 3. Ÿ��[] ������ = new Ÿ��[] {��1, ��2, ��3, ...}		
		*/
		
		int[] numbers = new int[10];
		
		char[] blacklist = {'#', '@', '&', '^', '\\', 65, 111}; // 65 = A�̹Ƿ� ���ڷε� ����������
		boolean[] passExam = new boolean[] {true, false, false, true}; // boolean Ÿ������ ������ �Ҽ� �ִ�. �� �ƴϿ� �ƴϿ� ��
		
		int[] units = {
				365 * 24 * 60 * 60,
				24 * 60 * 60,
				60 * 60,
				60
		};
		
		
		// �迭�� �ݺ����� �Բ� ������ ����Ǿ� �ִ� (for���� �Բ� ������ ����Ǿ��ִ� �迭..)
		for (int i = 0; i < blacklist.length; ++i) {
			System.out.println(blacklist[i]); // #���� o(111)���� ������ ��µ�
		}
		
		/* �����
		 	#
			@
			&
			^
			\
			A
			o
		*/
		
		// String�� char[]�� ��ȯ�� �� �ִ�
		char[] hello = "Hello, world!".toCharArray();
		
		for (int i = 0; i < hello.length; ++i) {
			System.out.printf("hello[%d] : %c\n", i, hello[i]);
		};
		
		/* 
		 	���� ��� ��
		 	hello[0] :  H
			hello[1] :  e
			hello[2] :  l
			hello[3] :  l
			hello[4] :  o
			hello[5] :  ,
			hello[6] :   
			hello[7] :  w
			hello[8] :  o
			hello[9] :  r
			hello[10] :  l
			hello[11] :  d
			hello[12] :  !
		*/
		
		
		/*blacklist[6] = 111;
		
		char ch1 = '#';
		char ch2 = '@';*/
	}
}
